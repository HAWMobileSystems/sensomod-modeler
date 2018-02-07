package sensomod.generated;

import java.util.ArrayList;

public class WIFI extends PhysicalSensor {
	// Added
	private Router router1 = new Router("WlanRoom1");
	private Router router2 = new Router("WlanRoom2");
	private Router router3 = new Router("WlanRoom3");

	public WIFI() {
		name = "WIFI";
	}

	public Router output(String ssid) {
		// Added
		if (ssid == "WlanRoom1")
			return router1;
		if (ssid == "WlanRoom2")
			return router2;
		if (ssid == "WlanRoom3")
			return router3;
		else
			return null;
	}
}
