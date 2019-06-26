package sensomod.modelgenerator.jaxb.objects;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Node {

	//Attributes
	private String name;
	private String type;
	//Linked Elements
	private String contextdescription;
	private String context;
	private String computedsensor;
	
	//Elements
	private ContextExpression contextExpression;
	private DecisionLogic decisionLogic;
	private Output output;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlAttribute(namespace="http://www.w3.org/2001/XMLSchema-instance")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@XmlAttribute
	public String getContextdescription() {
		return contextdescription;
	}

	public void setContextdescription(String contextdescription) {
		this.contextdescription = contextdescription;
	}
	
	@XmlAttribute
	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@XmlAttribute
	public String getComputedsensor() {
		return computedsensor;
	}

	public void setComputedsensor(String computedsensor) {
		this.computedsensor = computedsensor;
	}

	@XmlElement(name="contextexpression")
	public ContextExpression getContextExpression() {
		return contextExpression;
	}

	public void setContextExpression(ContextExpression contextExpression) {
		this.contextExpression = contextExpression;
	}

	@XmlElement(name="decisionlogic")
	public DecisionLogic getDecisionLogic() {
		return decisionLogic;
	}

	public void setDecisionLogic(DecisionLogic decisionlLogic) {
		this.decisionLogic = decisionlLogic;
	}

	@XmlElement
	public Output getOutput() {
		return output;
	}

	public void setOutput(Output output) {
		this.output = output;
	}
	
	
}
