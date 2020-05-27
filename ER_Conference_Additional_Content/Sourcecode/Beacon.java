package sensomod.generated;

public class Beacon extends PhysicalSensor {

    public Beacon(String id, int signalstrength) {
        multiple = false;
        this.name = "Beacon";
        this.id = id;
        this.signalstrength = signalstrength;
    }

    private String Id;

    /*TODO: create logic to return the Id*/
    public String output() {
    }

    private int SignalStrength;

    /*TODO: create logic to return the SignalStrength*/
    public int output() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public int getSignalStrength() {
        return SignalStrength;
    }

    public void setSignalStrength(int SignalStrength) {
        this.SignalStrength = SignalStrength;
    }
}
// Use IDE to generate toString and equals methods

