package sensomod.modelgenerator.jaxb.objects;

import javax.xml.bind.annotation.XmlAttribute;

public class ContextExpression {
	
	private String name;

	@XmlAttribute
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
