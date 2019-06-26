package sensomod.modelgenerator.jaxb.objects;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class Output {
	
	private List<Type> types;

	@XmlElement(name="type")
	public List<Type> getTpye() {
		return types;
	}

	public void setTpye(List<Type> tpye) {
		this.types = tpye;
	}

}
