package sensomod.javasourcecodegen.handlers;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

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

public class XMLParser {

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

	public boolean parseXML(String fileName, String targetDir) {
		this.targetDir = targetDir;
		String newfileName = validateAndCorrectXML(fileName);
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
					System.out.println("start " + startElement.getName().getLocalPart());
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
								System.out.println(className + " has multiple not set");
							}

							System.out.println("classType " + classType);
							System.out.println("className " + className);
							System.out.println("multiple " + multiple);
							// Superklasse erzeugen
							createSuperClass(classType);
							// Von Superklase ableiten
							myClass.addExtendedType(classType);
							// name im construktor Wert zuweisen
							NameExpr namexpr = new NameExpr("name = " + '\"' + className + '\"');
							block.addStatement(namexpr);

							// Klassenvariablen hinzufügen Bsp: Klasse Context hat eine (private WIFI wifi)
							Collection<String> cs = relationMapping.get(className);
							if (!cs.isEmpty()) {
								for (String relation : cs) {
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
						}
						method.setType(type);
						// Erzeugt Klasse für Type z.b. Router
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
							// Erzeugt Klassenvariablen für Type z.b. String routername;
							typeElementClass.addField(elementType, elementName.toLowerCase(), Modifier.PRIVATE);
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
							System.out.println(contextExpression);
							method = myClass.addMethod("contextExpression", Modifier.PUBLIC);
							if (method.getBody().isPresent()) {
								BlockStmt block = method.getBody().get();
								NameExpr namexpr = new NameExpr(contextExpression);
								block.addStatement(namexpr);
							}

						}
					}

				}

				// if Employee end element is reached, add employee object to list
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
		}
		return true;
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
		try (PrintWriter out = new PrintWriter(targetDir + "/" + filename + ".java")) {
			out.println(cu);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
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

	// Ersetzt alle & mit &amp; Sirius stellt kein gültiges XML-File zur Verfügung
	private String validateAndCorrectXML(String fileName) {
		String newFileName = fileName + "_validated";
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));
				FileWriter fw = new FileWriter(newFileName);
				PrintWriter pw = new PrintWriter(fw)) {
			String line;
			while ((line = br.readLine()) != null) {
				String newline = line.replaceAll("&", "&amp;");
				pw.println(newline);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return newFileName;
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
					System.out.println("start " + startElement.getName().getLocalPart());
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
		}
		System.out.println(nodeNumbers);
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
					System.out.println("start " + startElement.getName().getLocalPart());
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
										System.out.println(relationMapping);
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
										System.out.println(relationMapping);
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
										System.out.println(relationMapping);
									}
								}
							}
						}
					}
				}
			}

		} catch (FileNotFoundException | XMLStreamException | NullPointerException e) {
			e.printStackTrace();
		}
		System.out.println(nodeNumbers);
	}
}