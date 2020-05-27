package sensomod.generated;

public class LivingRoomHeaterOn extends ContextDescription {

    public LivingRoomHeaterOn(LivingRoomManagement livingroommanagement) {
        this.name = "LivingRoomHeaterOn";
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

