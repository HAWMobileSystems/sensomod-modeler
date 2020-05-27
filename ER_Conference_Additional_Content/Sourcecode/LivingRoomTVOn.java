package sensomod.generated;

public class LivingRoomTVOn extends ContextDescription {

    public LivingRoomTVOn(LivingRoomManagement livingroommanagement) {
        this.name = "LivingRoomTVOn";
        this.livingroommanagement = livingroommanagement;
    }

    private LivingRoomManagement livingroommanagement;

    public void contextExpression() {
        LivingRoomState.TV = On;
    }

    public LivingRoomManagement getLivingroommanagement() {
        return livingroommanagement;
    }

    public void setLivingroommanagement(LivingRoomManagement livingroommanagement) {
        this.livingroommanagement = livingroommanagement;
    }
}
// Use IDE to generate toString and equals methods

