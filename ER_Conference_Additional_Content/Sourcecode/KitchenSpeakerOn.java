package sensomod.generated;

public class KitchenSpeakerOn extends ContextDescription {

    public KitchenSpeakerOn(KitchenManagement kitchenmanagement) {
        this.name = "KitchenSpeakerOn";
        this.kitchenmanagement = kitchenmanagement;
    }

    private KitchenManagement kitchenmanagement;

    public void contextExpression() {
        Kitchen.Speaker = On;
    }

    public KitchenManagement getKitchenmanagement() {
        return kitchenmanagement;
    }

    public void setKitchenmanagement(KitchenManagement kitchenmanagement) {
        this.kitchenmanagement = kitchenmanagement;
    }
}
// Use IDE to generate toString and equals methods

