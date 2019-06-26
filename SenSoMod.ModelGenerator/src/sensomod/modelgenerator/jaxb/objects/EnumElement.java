package sensomod.modelgenerator.jaxb.objects;

import javax.xml.bind.annotation.XmlAttribute;

public class EnumElement {
	
	private String name;
	private String valuesCommaSep;
	
	@XmlAttribute(required=true)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlAttribute(required=true)
	public String getValuesCommaSep() {
		return valuesCommaSep;
	}
	public void setValuesCommaSep(String valuesCommaSep) {
		this.valuesCommaSep = valuesCommaSep;
	}
	
	

}
