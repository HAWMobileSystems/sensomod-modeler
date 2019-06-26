@XmlSchema(
		namespace = "http://www.example.org/senSoMod",
		elementFormDefault = XmlNsForm.UNSET,
	    xmlns = {
	        @XmlNs(prefix="senSoMod", namespaceURI="http://www.example.org/senSoMod"),
	        @XmlNs(prefix ="xmi", namespaceURI="http://www.omg.org/XMI")
	    })
package sensomod.modelgenerator.jaxb.objects;

import javax.xml.bind.annotation.*;
