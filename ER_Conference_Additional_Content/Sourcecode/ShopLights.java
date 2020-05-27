package sensomod.generated;

public class ShopLights extends PhysicalSensor {

    public ShopLights(String state) {
        multiple = false;
        this.name = "ShopLights";
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

