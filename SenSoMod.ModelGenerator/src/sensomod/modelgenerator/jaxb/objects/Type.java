package sensomod.modelgenerator.jaxb.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Type {
	
	//Attributes
	private String name;
	private String type;
	//Elements
	private List<Element> elements;
	private List<EnumElement> enumElements;
	
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
	@XmlElement(name="element")
	public List<Element> getElement() {
		return elements;
	}
	public void setElements(List<Element> elements) {
		this.elements = elements;
	}
	@XmlElement(name="enumelement")
	public List<EnumElement> getEnumElement() {
		return enumElements;
	}
	public void setEnumElement(List<EnumElement> enumElement) {
		this.enumElements = enumElement;
	}

}
