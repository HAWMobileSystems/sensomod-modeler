package sensomod.modelgenerator.jaxb.objects;

import javax.xml.bind.annotation.XmlAttribute;

public class Element {
	
	private String name;
	private String type;
	
	@XmlAttribute(required=true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute(required=true)
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
