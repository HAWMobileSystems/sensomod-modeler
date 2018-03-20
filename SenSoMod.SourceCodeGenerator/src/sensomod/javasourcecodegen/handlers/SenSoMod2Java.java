package sensomod.javasourcecodegen.handlers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
import com.github.javaparser.ast.comments.Comment;
import com.github.javaparser.ast.comments.LineComment;
import com.github.javaparser.ast.expr.NameExpr;
import com.github.javaparser.ast.expr.VariableDeclarationExpr;
import com.github.javaparser.ast.stmt.BlockStmt;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.type.VoidType;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class SenSoMod2Java {
	private static final Logger log = Logger.getLogger(SenSoMod2Java.class.getName());
	private FileHandler fileHandler;
	public static final String PACKAGE = "sensomod.generated";
	public static final QName TYPE_XSI = new QName("http://www.w3.org/2001/XMLSchema-instance", "type", "xsi");
	private CompilationUnit cu = new CompilationUnit();
	private ClassOrInterfaceDeclaration myClass = new ClassOrInterfaceDeclaration();
	private ClassOrInterfaceDeclaration typeElementClass = new ClassOrInterfaceDeclaration();
	private CompilationUnit typeElementClassCU = new CompilationUnit();
	private MethodDeclaration method = new MethodDeclaration();
	private String targetDir = null;
	private ArrayList<String> nodeNumbers = new ArrayList<>();
	private Multimap<String, String> relationMapping = ArrayListMultimap.create();

	private boolean output = false;
	private boolean type = false;

	public boolean transform(String fileName, String targetDir) {
		this.targetDir = targetDir;

		// Logging
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

		String newfileName = fileName;
		extractIDsFromNodes(newfileName);
		mapRelationToClasses(newfileName);
		cu.setPackageDeclaration(PACKAGE);
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
							String classType = xsiTypeAttr.getValue()
									.substring(xsiTypeAttr.getValue().indexOf(":") + 1);
							String className = nameAttr.getValue();
							boolean multiple = false;
							// Klassenamen setzen
							myClass = cu.addClass(className, Modifier.PUBLIC);
							// Construktor setzen
							ConstructorDeclaration cons = new ConstructorDeclaration(className);
							BlockStmt block = new BlockStmt();
							cons.setBody(block);
							myClass.addMember(cons);

							try { // Wert Multiple ermitteln
								if (classType.toLowerCase().contains("sensor")) {

									Attribute multipleAttr = startElement.getAttributeByName(new QName("multiple"));
									multiple = Boolean.parseBoolean(multipleAttr.getValue());
									// multiple im Constructor Wert zuweisen
									NameExpr namexpr2 = new NameExpr("multiple = " + multiple);
									block.addStatement(namexpr2);
								}
							} catch (NullPointerException e) {
								log.info(className + " has multiple not set");
							}

							log.info("classType " + classType);
							log.info("className " + className);
							log.info("multiple " + multiple);
							// Superklasse erzeugen
							createSuperClass(classType);
							// Von Superklase ableiten
							myClass.addExtendedType(classType);
							// name im construktor Wert zuweisen
							NameExpr namexpr = new NameExpr("name = " + '\"' + className + '\"');
							block.addStatement(namexpr);

							// Klassenvariablen hinzuf�gen Bsp: Klasse Context hat eine (private WIFI wifi)
							Collection<String> cs = relationMapping.get(className);
							if (!cs.isEmpty()) {
								for (String relation : cs) {
									relation = relation.replaceAll("[^a-zA-Z0-9]", "").trim();
									myClass.addField(relation, relation.toLowerCase(), Modifier.PRIVATE);
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
						method = myClass.addMethod("output", Modifier.PUBLIC);
						Attribute typeAttr = startElement.getAttributeByName(new QName("name"));
						String type = "Object";
						try {
							type = typeAttr.getValue().replaceAll("[^a-zA-Z0-9]", "").trim();

						} catch (Exception e) {
							log.log(Level.SEVERE, e.getMessage(), e);
						}
						method.setType(type);
						// Erzeugt Klasse f�r Type z.b. Router
						typeElementClassCU.setPackageDeclaration(PACKAGE);
						typeElementClass = typeElementClassCU.addClass(type, Modifier.PUBLIC);
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
							// Erzeugt Klassenvariablen f�r Type z.b. String routername;
							typeElementClass.addField(elementType, elementName.toLowerCase(), Modifier.PRIVATE);
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
						// Schreibe .java Datei
						writeToDisk(typeElementClassCU, typeElementClass.getNameAsString());
						// Variablen leer machen
						resetVarsTypeElement();
					}
					if (endElement.getName().getLocalPart().equals("node")) {
						// Schreibe .java Datei
						writeToDisk(cu, myClass.getNameAsString());
						// Variablen leer machen
						resetVars();
					}
				}
			}

		} catch (FileNotFoundException | XMLStreamException | NullPointerException e) {
			e.printStackTrace();
			log.log(Level.SEVERE, e.getMessage(), e);
		}
		fileHandler.close();
		return true;
	}

	private void createSuperClass(String name) {
		CompilationUnit sup = new CompilationUnit();
		sup.setPackageDeclaration(PACKAGE);
		ClassOrInterfaceDeclaration supClass = sup.addClass(name);
		supClass.addField("String", "name", Modifier.PROTECTED);
		// Sensoren erhalten zus�tzlich das Feld Multiple
		if (name.toLowerCase().contains("sensor")) {
			supClass.addField("boolean", "multiple", Modifier.PROTECTED);
		}
		writeToDisk(sup, name);
	}

	private void writeToDisk(CompilationUnit cu, String filename) {
		LineComment lc = new LineComment("Use IDE to generate Constructor, Getters, Setters and toString methods");
		cu.addOrphanComment(lc);
		String filePath = targetDir + "/" + filename + ".java";
		File f = new File(filePath);
		// Problem wenn Modellierer zwei Sprachelemente den selben Namen definiert
		// gel�st durch: Existierende Dateien werden nicht �berschrieben sondern der
		// Dateiname mit einer zuf�lligen Zahl erg�nzt
		if (f.exists() && !f.isDirectory()) {
			// Superklassen sollen nicht zus�tzlich erzeugt werden
			if (filename.equals("Context") || filename.equals("ContextDescription") || filename.equals("PhysicalSensor")
					|| filename.equals("VirtualSensor") || filename.equals("ComputedSensor")) {
				log.info(filename + " already exists");
			} else {
				int random = (int) (Math.random() * 100);
				filePath = filePath.replace(".java", random + ".java");
			}

		}
		try (PrintWriter out = new PrintWriter(filePath)) {
			out.println(cu);
		} catch (FileNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage(), e);

		}
	}

	private void resetVars() {
		output = false;
		type = false;
		cu = new CompilationUnit();
		cu.setPackageDeclaration(PACKAGE);
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
									// contexts k�nnen mehr als ein Context zugeordnet sein
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
									// computedsensor k�nnen mehr als ein Computed Sensor zugeordnet sein
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
									// computedsensor k�nnen mehr als ein Computed Sensor zugeordnet sein
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