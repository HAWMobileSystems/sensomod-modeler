package sensomod.generated;

public class KitchenSpeakerOff extends ContextDescription {

    public KitchenSpeakerOff(KitchenManagement kitchenmanagement) {
        this.name = "KitchenSpeakerOff";
        this.kitchenmanagement = kitchenmanagement;
    }

    private KitchenManagement kitchenmanagement;

    public void contextExpression() {
        KitchenState.Speaker =Off;
    }

    public KitchenManagement getKitchenmanagement() {
        return kitchenmanagement;
    }

    public void setKitchenmanagement(KitchenManagement kitchenmanagement) {
        this.kitchenmanagement = kitchenmanagement;
    }
}
// Use IDE to generate toString and equals methods

