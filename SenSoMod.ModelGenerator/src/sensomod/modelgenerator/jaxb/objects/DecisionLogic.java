package sensomod.modelgenerator.jaxb.objects;

import javax.xml.bind.annotation.XmlAttribute;

public class DecisionLogic {
	
	private String name;

	@XmlAttribute(required=true)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
