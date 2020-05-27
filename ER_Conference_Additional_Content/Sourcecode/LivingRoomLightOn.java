package sensomod.generated;

public class LivingRoomLightOn extends ContextDescription {

    public LivingRoomLightOn(LivingRoomManagement livingroommanagement) {
        this.name = "LivingRoomLightOn";
        this.livingroommanagement = livingroommanagement;
    }

    private LivingRoomManagement livingroommanagement;

    public void contextExpression() {
        LivingRoomState.Lights = On;
    }

    public LivingRoomManagement getLivingroommanagement() {
        return livingroommanagement;
    }

    public void setLivingroommanagement(LivingRoomManagement livingroommanagement) {
        this.livingroommanagement = livingroommanagement;
    }
}
// Use IDE to generate toString and equals methods

