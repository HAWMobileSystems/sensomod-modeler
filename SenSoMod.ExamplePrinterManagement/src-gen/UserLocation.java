package sensomod.generated;

public class UserLocation extends ComputedSensor {

    public UserLocation() {
        name = "UserLocation";
    }

    private WIFI wifi;

    public Building output() {
    // TODO
    }

    public void decisionLogic() {
        if(SSID=="WlanRoom1"){location="NearbyRoom1"}if(SSID=="WlanRoom2"){location="NearbyRoom2"}if(SSID=="WlanRoom3"){location="NearbyRoom3"}else{location="unknown"};
    }
}

