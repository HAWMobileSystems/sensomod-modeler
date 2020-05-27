package sensomod.generated;

public class LivingRoomTVOff extends ContextDescription {

    public LivingRoomTVOff(LivingRoomManagement livingroommanagement) {
        this.name = "LivingRoomTVOff";
        this.livingroommanagement = livingroommanagement;
    }

    private LivingRoomManagement livingroommanagement;

    public void contextExpression() {
        LivingRoomState.TV = Off;
    }

    public LivingRoomManagement getLivingroommanagement() {
        return livingroommanagement;
    }

    public void setLivingroommanagement(LivingRoomManagement livingroommanagement) {
        this.livingroommanagement = livingroommanagement;
    }
}
// Use IDE to generate toString and equals methods

