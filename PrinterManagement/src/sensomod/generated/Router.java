package sensomod.generated;
//Use IDE to generate Constructor, Getters, Setters and toString methods
public class Router {

    private String ssid;

	public Router(String ssid) {
		super();
		this.ssid = ssid;
	}

	public String getSsid() {
		return ssid;
	}

	public void setSsid(String ssid) {
		this.ssid = ssid;
	}

	@Override
	public String toString() {
		return "Router [ssid=" + ssid + "]";
	}
    
    
}

