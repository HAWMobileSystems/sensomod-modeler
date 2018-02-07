package sensomod.generated;

public class Building {

	private Location location;

	public static enum Location {

		NearbyRoom1, NearbyRoom2, NearbyRoom3, Unknown
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Building [location=" + location + "]";
	}

}
