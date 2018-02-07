package sensomod.generated;

import java.util.ArrayList;

public class UserLocation extends ComputedSensor {

	public UserLocation() {
		name = "UserLocation";
	}

	// Added new WIFI and routes
	private WIFI wifi = new WIFI();
	//private ArrayList<Router> routers = wifi.output();

	// Add Building
	private Building building = new Building();

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	private String ssid = "";

	public Building output(String ssid) {
		this.ssid = ssid;
		decisionLogic();
		return building;
	}

	public void decisionLogic() {
		if (ssid.equals("WlanRoom1"))
			building.setLocation(Building.Location.NearbyRoom1);
		else if (ssid.equals("WlanRoom2"))
			building.setLocation(Building.Location.NearbyRoom2);
		else if (ssid.equals("WlanRoom3"))
			building.setLocation(Building.Location.NearbyRoom3);
		else
			building.setLocation(Building.Location.Unknown);
	}
}
