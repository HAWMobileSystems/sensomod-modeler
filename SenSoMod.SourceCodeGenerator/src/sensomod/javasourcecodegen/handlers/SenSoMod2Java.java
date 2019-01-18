package sensomod.javasourcecodegen.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Modifier;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.ConstructorDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.printer.PrettyPrinter;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
/**
 * 
 * @author Julian
 *
 */
public class SenSoMod2Java {
	private static final Logger log = Logger.getLogger(SenSoMod2Java.class.getName());
	private FileHandler fileHandler;
	public static final String PACKAGE = "sensomod.generated";
	public static final QName TYPE_XSI = new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi");
	private CompilationUnit compilationUnit = new CompilationUnit();
	private ClassOrInterfaceDeclaration myClass = new ClassOrInterfaceDeclaration();
	private ClassOrInterfaceDeclaration typeElementClass = new ClassOrInterfaceDeclaration();
	private CompilationUnit typeElementClassCU = new CompilationUnit();
	private ConstructorDeclaration typeElementConstructor = new ConstructorDeclaration();
	private BlockStmt typeElementContructorBlock = new BlockStmt();
	private MethodDeclaration method = new MethodDeclaration();
	private String targetDir = null;
	private ArrayList<String> nodeNumbers = new ArrayList<>();
	private Multimap<String, String> relationMapping = ArrayListMultimap.create();

	private boolean output = false;
	private boolean type = false;
	private String classType;
	private ConstructorDeclaration myClassConstructor;

	public boolean transform(String fileName, String targetDir, boolean generateConstructors, boolean generateSettersGetters) {
		this.targetDir = targetDir;

		// Logging
		createLogfile(targetDir);

		String newfileName = fileName;
		extractIDsFromNodes(newfileName);
		mapRelationToClasses(newfileName);
		compilationUnit.setPackageDeclaration(PACKAGE);
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(newfileName));
			while (xmlEventReader.hasNext()) {
				XMLEvent xmlEvent = xmlEventReader.nextEvent();
				if (xmlEvent.isStartElement()) {
					StartElement startElement = xmlEvent.asStartElement();
					log.info("start " + startElement.getName().getLocalPart());
					if (startElement.getName().getLocalPart().equals("node")) {
						Attribute xsiTypeAttr = startElement.getAttributeByName(TYPE_XSI);
						Attribute nameAttr = startElement.getAttributeByName(new QName("name"));
						if (nameAttr != null && xsiTypeAttr != null) {
							classType = xsiTypeAttr.getValue().substring(xsiTypeAttr.getValue().indexOf(":") + 1);
							String className = nameAttr.getValue();
							boolean multiple = false;
							// Klassenamen setzen
							myClass = compilationUnit.addClass(className, Modifier.PUBLIC);
							myClassConstructor = new ConstructorDeclaration(className);
							BlockStmt block = new BlockStmt();
							myClassConstructor.setBody(block);
							myClass.addMember(myClassConstructor);
							log.info("myClass " + myClass.toString());


							try { // Wert Multiple ermitteln
								if (classType.toLowerCase().contains("sensor")) {

									Attribute multipleAttr = startElement.getAttributeByName(new QName("multiple"));
									if(multipleAttr != null) {										
										multiple = Boolean.parseBoolean(multipleAttr.getValue());
									} else {
										log.info("sensor " + className + " has not multiple set");
										multiple = false;
									}
									// multiple im Constructor Wert zuweisen
									NameExpr namexpr2 = new NameExpr("multiple = " + multiple);
									block.addStatement(namexpr2);
								}
							} catch (Exception e) {
								log.log(Level.SEVERE, e.getMessage(), e);
								log.info(className + " has multiple not set");
								return false;
							}

							log.info("classType " + classType);
							log.info("className " + className);
							log.info("multiple " + multiple);
							// Superklasse erzeugen
							createSuperClass(classType);
							// Von Superklase ableiten
							myClass.addExtendedType(classType);
							// name im construktor Wert zuweisen
							NameExpr namexpr = new NameExpr("this.name = " + '\"' + className + '\"');
							block.addStatement(namexpr);

							// Klassenvariablen hinzufügen Bsp: Klasse Context hat eine (private WIFI wifi)
							Collection<String> cs = relationMapping.get(className);
							if (!cs.isEmpty()) {
								for (String relation : cs) {
									relation = relation.replaceAll("[^a-zA-Z0-9]", "").trim();
									myClass.addField(relation, relation.toLowerCase(), Modifier.PRIVATE);
									if(generateConstructors) {										
										addVarToConstructor(relation.toLowerCase(), relation, myClassConstructor, block);
									}
								}
							}

						}
					}
					// set the other varibles from xml elements
					else if (startElement.getName().getLocalPart().equals("output")) {
						xmlEvent = xmlEventReader.nextEvent();
						output = true;
					} else if (startElement.getName().getLocalPart().equals("type") && output == true) {
						xmlEvent = xmlEventReader.nextEvent();
						type = true;
						String type = startElement.getAttributeByName(new QName("type")).getValue();
						Attribute nameAttr = startElement.getAttributeByName(new QName("name"));
						String name = "Object";
						try {
							name = nameAttr.getValue().replaceAll("[^a-zA-Z0-9]", "").trim();

						} catch (Exception e) {
							log.log(Level.SEVERE, e.getMessage(), e);
							return false;
						}

						// Wenn primitiver Javatyp, dann wird eine variable erzeugt und diese gleich zum Konsturktor hinzugefügt
						// Wenn nicht dann wird eine Klasse für Type erzeugt z.b. Router
						if(isPrimitiveType(type) && isAtomicSensor(classType) ) {
							myClass.addField(type, name, Modifier.PRIVATE);
							if(generateConstructors) {								
								addVarToConstructor(name, type, myClassConstructor, myClassConstructor.getBody());
							}
						} else {							
							method = myClass.addMethod("output", Modifier.PUBLIC);
							method.setType(name);
							LineComment comment = new LineComment("TODO: create logic for return value");
							method.setComment(comment);
							createBasicTypeClass(name);
						}
						} else if (startElement.getName().getLocalPart().equals("element") && type == true) {
						xmlEvent = xmlEventReader.nextEvent();
						Attribute elementNameAttr = startElement.getAttributeByName(new QName("name"));
						Attribute elementTypeAttr = startElement.getAttributeByName(new QName("type"));
						if (elementNameAttr != null && elementTypeAttr != null) {
							String elementName = elementNameAttr.getValue();
							String elementType = elementTypeAttr.getValue();
							// Java 8 Optional unwrapping
							if (method.getBody().isPresent()) {
								BlockStmt block = new BlockStmt();
								LineComment lc = new LineComment("TODO");
								block.addOrphanComment(lc);
								method.setBody(block);
							}
							// Erzeugt Klassenvariablen für Type z.b. String routername;
							typeElementClass.addField(elementType, elementName.toLowerCase(), Modifier.PRIVATE);
							if(generateConstructors) {								
								addVarToConstructor(elementName, elementType, typeElementConstructor, typeElementContructorBlock);
							}							
						}
					} else if (startElement.getName().getLocalPart().equals("enumelement") && type == true) {
						xmlEvent = xmlEventReader.nextEvent();
						Attribute enumElementNameAttr = startElement.getAttributeByName(new QName("name"));
						Attribute valuesTypeAttr = startElement.getAttributeByName(new QName("valuesCommaSep"));
						if (enumElementNameAttr != null && valuesTypeAttr != null) {
							String elementName = enumElementNameAttr.getValue();
							String values = valuesTypeAttr.getValue().replaceAll(",", ";");
							values = values.replaceAll(" ", "");
							EnumDeclaration enumD = new EnumDeclaration(Modifier.PUBLIC.toEnumSet(), elementName);
							enumD.addModifier(Modifier.STATIC);
							typeElementClass.addMember(enumD);
							String[] valuesArr = values.split(";");
							for (String value : valuesArr) {
								log.info(value);
								enumD.addEnumConstant(value);
							}

							log.info("enum: " + enumD.toString());
							typeElementClass.addField(elementName, elementName.toLowerCase(), Modifier.PRIVATE);

						}

					} else if (startElement.getName().getLocalPart().equals("decisionlogic")) {
						xmlEvent = xmlEventReader.nextEvent();
						Attribute dlAttr = startElement.getAttributeByName(new QName("name"));
						if (dlAttr != null) {
							String decisionLogic = dlAttr.getValue();

							method = myClass.addMethod("decisionLogic", Modifier.PUBLIC);
							if (method.getBody().isPresent()) {
								BlockStmt block = method.getBody().get();
								NameExpr namexpr = new NameExpr(decisionLogic);
								block.addStatement(namexpr);
							}
						}

					} else if (startElement.getName().getLocalPart().equals("contextexpression")) {
						xmlEvent = xmlEventReader.nextEvent();
						Attribute dlAttr = startElement.getAttributeByName(new QName("name"));
						if (dlAttr != null) {
							String contextExpression = dlAttr.getValue();
							log.info(contextExpression);
							method = myClass.addMethod("contextExpression", Modifier.PUBLIC);
							if (method.getBody().isPresent()) {
								BlockStmt block = method.getBody().get();
								NameExpr namexpr = new NameExpr(contextExpression);
								block.addStatement(namexpr);
							}

						}
					}

				}

				if (xmlEvent.isEndElement()) {
					EndElement endElement = xmlEvent.asEndElement();
					if (endElement.getName().getLocalPart().equals("output")) {
						//create getter and setters for all fields
						if(generateSettersGetters) {
							createGettersAndSetters(typeElementClass);
						}
						// Schreibe .java Datei
						writeToDisk(typeElementClassCU, typeElementClass.getNameAsString());
						// Variablen leer machen
						resetVarsTypeElement();
					}
					if (endElement.getName().getLocalPart().equals("node")) {
						//create getter and setters for all fields
						if(generateSettersGetters) {
							createGettersAndSetters(myClass);
						}
						// Schreibe .java Datei
						writeToDisk(compilationUnit, myClass.getNameAsString());
						// Variablen leer machen
						resetVars();
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.getMessage(), e);
			return false;
		}
		fileHandler.close();
		return true;
	}

	/**
	 * This class creates getters and setters for a given class
	 * @param class for which the getters and Setter should be created
	 * 
	 */
	private void createGettersAndSetters(ClassOrInterfaceDeclaration classOrInterface) {
		for(FieldDeclaration actualField : classOrInterface.getFields()) {
			actualField.createGetter();
			actualField.createSetter();
		}
	}

	/**
	 * This class checks whether or not a given classType is an atomic sensor or not.
	 * It is atomic, when the sensor is a type of a virtual or physical sensor.
	 * @param classType class type to check as string
	 * @return whether or not the classType is atomic
	 */
	private boolean isAtomicSensor(String classType) {
		switch (classType) {
		case "PhysicalSensor":
			return true;
		case "VirtualSensor":
			return true;
		default:
			return false;
		}
	}

	/**
	 * This method check whether the given string type is a primitive 
	 * java object according to <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html">java_docs</a>
	 * @param type string value of the type to proof
	 * @return whether it is or it is not a primitive type
	 */
	private boolean isPrimitiveType(String type) {
		switch (type) {
		case "byte":
			return true;
		case "short":
			return true;
		case "int":
			return true;
		case "long":
			return true;
		case "float":
			return true;
		case "double":
			return true;
		case "boolean":
			return true;
		case "char":
			return true;
		case "String":
			return true;
		default:
			return false;
		}
	}


	/**
	 * This method creates the basis of the class for the type element
	 * @param type the type name to create a class for
	 */
	private void createBasicTypeClass(String type) {
		typeElementClassCU.setPackageDeclaration(PACKAGE);
		typeElementClass = typeElementClassCU.addClass(type, Modifier.PUBLIC);
		typeElementConstructor = new ConstructorDeclaration(type);
		typeElementContructorBlock = new BlockStmt();
		typeElementConstructor.setBody(typeElementContructorBlock);
		typeElementClass.addMember(typeElementConstructor);
	}

	/**
	 * adds variable to the given constructor
	 * @param varName name of the variable to add
	 * @param varType type of the variable to add
	 */
	private void addVarToConstructor(String varName, String varType, ConstructorDeclaration constructorDeclaration, BlockStmt blockStmt) {
		constructorDeclaration.addParameter(varType, varName.toLowerCase());
		NameExpr namexpr = new NameExpr("this." + varName.toLowerCase() + " = "+ varName.toLowerCase() );
		blockStmt.addStatement(namexpr);
	}

	/**
	 * This method creates the log file.
	 * @param targetDir targetPath for the logfile.
	 */
	private void createLogfile(String targetDir) {
		try {
			fileHandler = new FileHandler(targetDir + "/log.txt");
			SimpleFormatter formatter = new SimpleFormatter();
			fileHandler.setFormatter(formatter);
			log.addHandler(fileHandler);
			log.info("...Start Parsing .sensomod...");
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void createSuperClass(String name) {
		CompilationUnit sup = new CompilationUnit();
		sup.setPackageDeclaration(PACKAGE);
		ClassOrInterfaceDeclaration supClass = sup.addClass(name);
		supClass.addField("String", "name", Modifier.PROTECTED);
		// Sensoren erhalten zusätzlich das Feld Multiple
		if (name.toLowerCase().contains("sensor")) {
			supClass.addField("boolean", "multiple", Modifier.PROTECTED);
		}
		writeToDisk(sup, name);
	}

	private void writeToDisk(CompilationUnit cu, String filename) {
		LineComment lc = new LineComment("Use IDE to generate toString and equals methods");
		cu.addOrphanComment(lc);
		String filePath = targetDir + "/" + filename + ".java";
		File f = new File(filePath);
		// Problem wenn Modellierer zwei Sprachelemente den selben Namen definiert
		// gelöst durch: Existierende Dateien werden nicht überschrieben sondern der
		// Dateiname mit einer zufälligen Zahl ergänzt
		if (f.exists() && !f.isDirectory()) {
			// Superklassen sollen nicht zusätzlich erzeugt werden
			if (filename.equals("Context") || filename.equals("ContextDescription") || filename.equals("PhysicalSensor")
					|| filename.equals("VirtualSensor") || filename.equals("ComputedSensor")) {
				log.info(filename + " already exists");
			} else {
				int random = (int) (Math.random() * 100);
				filePath = filePath.replace(".java", random + ".java");
			}

		}
		try (PrintWriter out = new PrintWriter(filePath)) {
			PrettyPrinter prettyPrinter = new PrettyPrinter();
			out.println(prettyPrinter.print(cu));
		} catch (FileNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage(), e);

		}
	}

	private void resetVars() {
		output = false;
		type = false;
		compilationUnit = new CompilationUnit();
		compilationUnit.setPackageDeclaration(PACKAGE);
		myClass = new ClassOrInterfaceDeclaration();
		method = new MethodDeclaration();
	}

	private void resetVarsTypeElement() {
		typeElementClassCU = new CompilationUnit();
		typeElementClassCU.setPackageDeclaration(PACKAGE);
		typeElementClass = new ClassOrInterfaceDeclaration();
	}

	// Nummeriert die Nodes von 0 - x durch und speichert sie in eine ArrayList
	private void extractIDsFromNodes(String fileName) {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
			while (xmlEventReader.hasNext()) {
				XMLEvent xmlEvent = xmlEventReader.nextEvent();
				if (xmlEvent.isStartElement()) {
					StartElement startElement = xmlEvent.asStartElement();
					log.info("start " + startElement.getName().getLocalPart());
					if (startElement.getName().getLocalPart().equals("node")) {
						Attribute xsiTypeAttr = startElement.getAttributeByName(TYPE_XSI);
						Attribute nameAttr = startElement.getAttributeByName(new QName("name"));
						if (nameAttr != null && xsiTypeAttr != null) {
							String className = nameAttr.getValue();
							nodeNumbers.add(className);
						}
					}
				}
			}

		} catch (FileNotFoundException | XMLStreamException | NullPointerException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.getMessage(), e);

		}
		log.info(nodeNumbers.toString());
	}

	// Verwendet die NodeNumbers um Sensoren den Contexten zuordnen, bzw. Context
	// Expression dem Context
	private void mapRelationToClasses(String fileName) {
		XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
		try {
			XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(fileName));
			while (xmlEventReader.hasNext()) {
				XMLEvent xmlEvent = xmlEventReader.nextEvent();
				if (xmlEvent.isStartElement()) {
					StartElement startElement = xmlEvent.asStartElement();
					log.info("start " + startElement.getName().getLocalPart());
					if (startElement.getName().getLocalPart().equals("node")) {
						Attribute xsiTypeAttr = startElement.getAttributeByName(TYPE_XSI);
						Attribute nameAttr = startElement.getAttributeByName(new QName("name"));
						if (nameAttr != null && xsiTypeAttr != null) {
							String className = nameAttr.getValue();
							String classType = xsiTypeAttr.getValue()
									.substring(xsiTypeAttr.getValue().indexOf(":") + 1);
							switch (classType) {
							case "ComputedSensor":
							case "VirtualSensor":
							case "PhysicalSensor":
								// Context Attr
								Attribute contextAttr = startElement.getAttributeByName(new QName("context"));
								if (contextAttr != null) {
									String contexts = contextAttr.getValue();
									// contexts können mehr als ein Context zugeordnet sein
									String[] contextsArry = contexts.replaceAll("//@node.", "").split(" ");
									for (String contextNo : contextsArry) {
										int contextNoInt = Integer.parseInt(contextNo);
										relationMapping.put(nodeNumbers.get(contextNoInt), className);
										log.info(relationMapping.toString());
									}
								}
								// Computed Sensor Attr
								Attribute computedSensorAttr = startElement
										.getAttributeByName(new QName("computedsensor"));
								if (computedSensorAttr != null) {
									String computedSensors = computedSensorAttr.getValue();
									// computedsensor können mehr als ein Computed Sensor zugeordnet sein
									String[] computedSensorArry = computedSensors.replaceAll("//@node.", "").split(" ");
									for (String computedSensorNo : computedSensorArry) {
										int computedSensorNoInt = Integer.parseInt(computedSensorNo);
										relationMapping.put(nodeNumbers.get(computedSensorNoInt), className);
										log.info(relationMapping.toString());
									}
								}
								break;
							case "Context":
								// Contextdescription Attr
								Attribute contextdescriptionAttr = startElement
										.getAttributeByName(new QName("contextdescription"));
								if (contextdescriptionAttr != null) {
									String contextdescriptions = contextdescriptionAttr.getValue();
									// computedsensor können mehr als ein Computed Sensor zugeordnet sein
									String[] contextdescriptionsArry = contextdescriptions.replaceAll("//@node.", "")
											.split(" ");
									for (String contextdescriptionsNo : contextdescriptionsArry) {
										int contextdescriptionsNoInt = Integer.parseInt(contextdescriptionsNo);
										relationMapping.put(nodeNumbers.get(contextdescriptionsNoInt), className);
										log.info(relationMapping.toString());
									}
								}
							}
						}
					}
				}
			}

		} catch (FileNotFoundException | XMLStreamException | NullPointerException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.getMessage(), e);
		}
		log.info(nodeNumbers.toString());

	}

}
