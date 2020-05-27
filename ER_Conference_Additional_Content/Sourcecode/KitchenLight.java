package sensomod.generated;

public class KitchenLight extends PhysicalSensor {

    public KitchenLight(String status) {
        multiple = false;
        this.name = "KitchenLight";
        this.status = status;
    }

    private String Status;

    /*TODO: create logic to return the Status*/
    public String output() {
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}
// Use IDE to generate toString and equals methods

