package sensomod.generated;

public class ShopSpeaker extends PhysicalSensor {

    public ShopSpeaker(String state) {
        multiple = false;
        this.name = "ShopSpeaker";
        this.state = state;
    }

    private String State;

    /*TODO: create logic to return the State*/
    public String output() {
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }
}
// Use IDE to generate toString and equals methods

