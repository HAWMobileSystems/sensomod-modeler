package sensomod.generated;

public class LivingRoomAwningOff extends ContextDescription {

    public LivingRoomAwningOff(LivingRoomManagement livingroommanagement) {
        this.name = "LivingRoomAwningOff";
        this.livingroommanagement = livingroommanagement;
    }

    private LivingRoomManagement livingroommanagement;

    public void contextExpression() {
        LivingRoomState.Awning = Off;
    }

    public LivingRoomManagement getLivingroommanagement() {
        return livingroommanagement;
    }

    public void setLivingroommanagement(LivingRoomManagement livingroommanagement) {
        this.livingroommanagement = livingroommanagement;
    }
}
// Use IDE to generate toString and equals methods

