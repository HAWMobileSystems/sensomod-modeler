package sensomod.modelgenerator.jaxb.objects;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="Modell")
public class Modell {

	private List<Node> nodes = new ArrayList<Node>();

	@XmlElement(name="node")
	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
}
