package sensomod.modelgenerator.helpers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.body.BodyDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.EnumDeclaration;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;

import sensomod.modelgenerator.jaxb.objects.ContextExpression;
import sensomod.modelgenerator.jaxb.objects.DecisionLogic;
import sensomod.modelgenerator.jaxb.objects.Element;
import sensomod.modelgenerator.jaxb.objects.EnumElement;
import sensomod.modelgenerator.jaxb.objects.Modell;
import sensomod.modelgenerator.jaxb.objects.Node;
import sensomod.modelgenerator.jaxb.objects.Output;
import sensomod.modelgenerator.jaxb.objects.Type;

public class ExtractInfosFromJavaClasses {
	
	private List<Node> contextDescriptions = new ArrayList<Node>();
	private List<Node> contextList = new ArrayList<Node>();
	private List<Node> computedSensors = new ArrayList<Node>();
	private List<Node> physicalAtomicSensors = new ArrayList<Node>();
	private List<Node> virtualAtomicSensors = new ArrayList<Node>();
	
	private Map<String, ClassOrInterfaceDeclaration> mainModelElements = new HashMap<>(); 
	private Map<String, ClassOrInterfaceDeclaration> others = new HashMap<String, ClassOrInterfaceDeclaration>();
	
	 public void listClasses(File projectDir) {
	     exploreDirectoryForModellClasses(projectDir);
	     createOutputSection();
	     assignDependenciesBetweenModellComponents();
	     
		 Modell modell = new Modell();
		 modell.getNodes().addAll(contextDescriptions);
		 modell.getNodes().addAll(contextList);
		 modell.getNodes().addAll(computedSensors);
		 modell.getNodes().addAll(physicalAtomicSensors);
		 modell.getNodes().addAll(virtualAtomicSensors);
		 modellToXML(modell);		 
    }

	 /**
	  * This class creates the output xml structure. It iterates over every identified main model class and reads the signature of the output method.
	  * Hereafter, the referenced output class will be searched if the method signature returns a object type. Otherwise, the return type is a primitive type and 
	  * this would be noted in the xml. 
	  * 
	  */
	private void createOutputSection() {
		for(ClassOrInterfaceDeclaration currentClassOrInterface : mainModelElements.values()) {
			for(MethodDeclaration currentMethod: currentClassOrInterface.getMethods()){
				Output output = new Output();
				List<Type> types = new ArrayList<>();
				ClassOrInterfaceDeclaration outputObject = others.get(currentMethod.getType().toString());
				Node elementToManipulate = null;
				elementToManipulate = getElementToManipulate(currentClassOrInterface, elementToManipulate);					
				if(currentMethod.getNameAsString().equals("output") && !currentMethod.getType().isPrimitiveType() && !currentMethod.getType().toString().equals("String")) {					
					if(elementToManipulate != null && outputObject != null) {
						//has/is output Object Enums?
						Type type = new Type();
						EnumDeclaration outputObjectAsEnum = hasOuputObjectEnum(outputObject);
						if( outputObjectAsEnum != null) {	
							type.setName(outputObject.getNameAsString());
							type.setType(Constants.TYPE_NAME_ENUM);
							List<EnumElement> enumElements = new ArrayList<EnumElement>();
							EnumElement enumElement = new EnumElement();
							enumElement.setName(outputObjectAsEnum.getNameAsString());
							enumElement.setValuesCommaSep(outputObjectAsEnum.getEntries().toString().replaceAll("[\\[\\]]", ""));
							enumElements.add(enumElement);
							type.setEnumElement(enumElements);
							types.add(type);
							
						} else {							
							type.setName(outputObject.getNameAsString());
							type.setType(Constants.TYPE_NAME_OBJECT);
							List<Element> elements = new ArrayList<>();
							outputObject.getFields().forEach(currentField ->{
								Element element = new Element();
								element.setType(currentField.getElementType().toString());
								element.setName(currentField.getVariables().get(0).toString());
								elements.add(element);
							});
							type.setElements(elements);							
							types.add(type);
						}
					}
				} else if(currentMethod.getNameAsString().equals("output") && currentMethod.getType().isPrimitiveType() ||
							currentMethod.getNameAsString().equals("output") && currentMethod.getType().toString().equals("String")) {
					Type type = new Type();
					type.setType(currentMethod.getType().toString());
					for(FieldDeclaration curentField : currentClassOrInterface.getFields()) {
						Pattern pattern = Pattern.compile(curentField.getVariable(0).toString());
						Matcher matcher = pattern.matcher(currentMethod.getComment().toString());
						if(matcher.find()) {							
							type.setName(matcher.group(matcher.groupCount()));
							types.add(type);
							break;
						};
					}
				}
				if(types != null && !types.isEmpty()) {					
					output.setTpye(types);
					elementToManipulate.setOutput(output);
				}
			}
		}
		
	}

	private Node getElementToManipulate(ClassOrInterfaceDeclaration currentClassOrInterface, Node elementToManipulate) {
		switch(currentClassOrInterface.getExtendedTypes(0).getNameAsString()){
		case "Context":
			for(Node currentContextElement: contextList) {
				if(currentContextElement.getName() != null && currentContextElement.getName().equals(currentClassOrInterface.getNameAsString())) {
					elementToManipulate = currentContextElement;
				}
			}
			break;
		case "PhysicalSensor":
			for(Node currentPhysicalSensor: physicalAtomicSensors) {
				if(currentPhysicalSensor.getName() != null && currentPhysicalSensor.getName().equals(currentClassOrInterface.getNameAsString())) {
					elementToManipulate = currentPhysicalSensor;
				}
			}
			break;
		case "VirtualSensor":
			for(Node currentVirtualSensor: virtualAtomicSensors) {
				if(currentVirtualSensor.getName() != null && currentVirtualSensor.getName().equals(currentClassOrInterface.getNameAsString())) {
					elementToManipulate = currentVirtualSensor;
				}
			}
			break;
		case "ComputedSensor":
			for(Node currentComputedSensor: computedSensors) {
				if(currentComputedSensor.getName() != null && currentComputedSensor.getName().equals(currentClassOrInterface.getNameAsString())) {
					elementToManipulate = currentComputedSensor;
				}
			}
			break;
		}
		return elementToManipulate;
	}

	private EnumDeclaration hasOuputObjectEnum(ClassOrInterfaceDeclaration outputObject) {
		for(BodyDeclaration<?> currentBody : outputObject.getMembers()) {
			if(currentBody.isEnumDeclaration()) {
				return currentBody.asEnumDeclaration();
			}
		}
		return null;
	}

	private void assignDependenciesBetweenModellComponents() {
		assignContextDescriptionDependencies();
		assignContextDependencies();
	}

	private void assignContextDependencies() {
		for(int i = 0; i < contextList.size(); i++) {
			Node currentXMLContextDes = contextList.get(i);
			ClassOrInterfaceDeclaration currentContextAsClass = mainModelElements.get(currentXMLContextDes.getName());
			List<Node> wholeSensorList = new ArrayList<>();
			wholeSensorList.addAll(computedSensors);
			wholeSensorList.addAll(physicalAtomicSensors);
			wholeSensorList.addAll(virtualAtomicSensors);
			for(Node currentXMLSensor : wholeSensorList) {
				String currentSensorName =  currentXMLSensor.getName();
				if(currentContextAsClass.getFieldByName(currentSensorName) != null ) {
					//is calculated by the number of nodes added to the xml. Caution if the sequence will be change the calculation can be incorrect!
					int nodeReferenzNumber = contextDescriptions.size()+i; 
					currentXMLSensor.setContext(Constants.DEPENDENCY_START_STRING + nodeReferenzNumber);
				}
			}
		}
		
	}

	private void assignContextDescriptionDependencies() {
		for(int i = 0; i < contextDescriptions.size(); i++) {
			Node currentXMLContextDes = contextDescriptions.get(i);
			ClassOrInterfaceDeclaration currentContextDescriptionAsClass = mainModelElements.get(currentXMLContextDes.getName());
			for(Node currentXMLContext : contextList) {
				String currentContextName =  currentXMLContext.getName();
				if(currentContextDescriptionAsClass.getFieldByName(currentContextName) != null ) {
					currentXMLContext.setContextdescription(Constants.DEPENDENCY_START_STRING + i);
				}
			}
		}
	}

	private void exploreDirectoryForModellClasses(File projectDir) {
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
		    System.out.println(path);
		    String separator ="";
		    for(int i = 0; i<path.length(); i++) {
		    	separator += "=";
		    }
		    System.out.println(separator);
		    try {
		        new VoidVisitorAdapter<Object>() {
		        	String contextExpression = "";
		        	String decisionLogic = "";
		            @Override
		            public void visit(ClassOrInterfaceDeclaration n, Object arg) {
		                super.visit(n, arg);
		                System.out.println(" name " + n.getName());
		                if(n.getExtendedTypes() != null && !n.getExtendedTypes().isEmpty()) {		                	
		                	n.getExtendedTypes().forEach(extendedType ->{
		                		System.out.println("extends:" + extendedType.getNameAsString());
		                		n.getMethods().forEach(currentMethod ->{
		                			System.out.println("Method name: " + currentMethod.getNameAsString());
		                			if(currentMethod.getNameAsString().equals("contextExpression")) {
		                				contextExpression =  currentMethod.getBody().get().toString().trim();
		                				//the cut of the first and the last position is necessary because the brackets of the method statement are 
		                				//included an need to be cut away.
		                				contextExpression =  contextExpression.substring(1, contextExpression.length()-1).trim();
		                			} else if(currentMethod.getNameAsString().equals("decisionLogic")) {
		                				decisionLogic = currentMethod.getBody().get().toString().trim();
		                				//the cut of the first and the last position is necessary because the brackets of the method statement are 
		                				//included an need to be cut away.
		                				decisionLogic = decisionLogic.substring(1, decisionLogic.length()-1).trim();
		                			}
		                		});
		                		switch(extendedType.getNameAsString()) {
		                		case "ContextDescription":
		                			Node contextDescription = new Node();
		                			contextDescription.setType(Constants.XSI_SENSOMOD_TYPE_CONTEXTDESCRIPTION);
		                			contextDescription.setName(n.getNameAsString());
		                			if(!contextExpression.trim().isEmpty()) {
		                				ContextExpression contextExpressionObject = new ContextExpression();
		                				contextExpressionObject.setName(contextExpression);
		                				contextDescription.setContextExpression(contextExpressionObject);
		                			}
		                			contextDescriptions.add(contextDescription);
		                			mainModelElements.put(n.getNameAsString(), n);
		                			break;
		                		case "Context":
		                			Node context = new Node();
		                			context.setType(Constants.XSI_SENSOMOD_TYPE_CONTEXT);
		                			context.setName(n.getNameAsString());
		                			setDecisionLogic(context, decisionLogic);
		                			contextList.add(context);
		                			mainModelElements.put(n.getNameAsString(), n);
		                			break;
		                		case "ComputedSensor":
		                			Node computedSensor = new Node();
		                			computedSensor.setType(Constants.XSI_SENSOMOD_TYPE_COMPUTEDSENSOR);
		                			computedSensor.setName(n.getNameAsString());
		                			setDecisionLogic(computedSensor, decisionLogic);
		                			computedSensors.add(computedSensor);
		                			mainModelElements.put(n.getNameAsString(), n);
		                			break;
		                		case "PhysicalSensor":
		                			Node physicalSensor = new Node();
		                			physicalSensor.setType(Constants.XSI_SENSOMOD_TYPE_PHYSICALSENSOR);
		                			physicalSensor.setName(n.getNameAsString());
		                			physicalAtomicSensors.add(physicalSensor);
		                			mainModelElements.put(n.getNameAsString(), n);
		                			break;
		                		case "VirtualSensor":
		                			Node virtualSensor = new Node();
		                			virtualSensor.setType(Constants.XSI_SENSOMOD_TYPE_VIRTUALSENSOR);
		                			virtualSensor.setName(n.getNameAsString());
		                			virtualAtomicSensors.add(virtualSensor);
		                			mainModelElements.put(n.getNameAsString(), n);
		                			break;
		                		} 		            			
		                	});
		                } else {
		                	others.put(n.getNameAsString(), n);
		                }
		            }
		        }.visit(JavaParser.parse(file), null);
		         System.out.println(); // empty line
		    } catch (IOException e) {
		        new RuntimeException(e);
		    }
		}).explore(projectDir);
	}
	
	private void setDecisionLogic(Node node, String decisionLogic) {
		if(!decisionLogic.trim().isEmpty()) {
			DecisionLogic decisionLogicObject = new DecisionLogic();
			decisionLogicObject.setName(decisionLogic);
			node.setDecisionLogic(decisionLogicObject);
		}
	}
	 
	 private void modellToXML(Modell modell)
	    {
	        try
	        {
	            //Create JAXB Context
	            JAXBContext jaxbContext = JAXBContext.newInstance(Modell.class);
	             
	            //Create Marshaller
	            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	            //Required formatting??
	            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	 
	           //Store XML to File
	            File file = new File("test.sensomod");
	             
	            //Writes XML file to file-system
	            jaxbMarshaller.marshal(modell, file);
	        }
	        catch (JAXBException e)
	        {
	            e.printStackTrace();
	        }
	    }

}
