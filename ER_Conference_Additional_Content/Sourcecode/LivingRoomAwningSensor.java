package sensomod.generated;

public class LivingRoomAwningSensor extends PhysicalSensor {

    public LivingRoomAwningSensor(double status) {
        multiple = false;
        this.name = "LivingRoomAwningSensor";
        this.status = status;
    }

    private double Status;

    /*TODO: create logic to return the Status*/
    public double output() {
    }

    public double getStatus() {
        return Status;
    }

    public void setStatus(double Status) {
        this.Status = Status;
    }
}
// Use IDE to generate toString and equals methods

