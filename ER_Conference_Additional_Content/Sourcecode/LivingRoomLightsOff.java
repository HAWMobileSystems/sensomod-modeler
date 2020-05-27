package sensomod.generated;

public class LivingRoomLightsOff extends ContextDescription {

    public LivingRoomLightsOff(LivingRoomManagement livingroommanagement) {
        this.name = "LivingRoomLightsOff";
        this.livingroommanagement = livingroommanagement;
    }

    private LivingRoomManagement livingroommanagement;

    public void contextExpression() {
        LivingRoomState.Lights = Off;
    }

    public LivingRoomManagement getLivingroommanagement() {
        return livingroommanagement;
    }

    public void setLivingroommanagement(LivingRoomManagement livingroommanagement) {
        this.livingroommanagement = livingroommanagement;
    }
}
// Use IDE to generate toString and equals methods

