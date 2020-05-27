package sensomod.generated;

public class KitchenLightOn extends ContextDescription {

    public KitchenLightOn(KitchenManagement kitchenmanagement) {
        this.name = "KitchenLightOn";
        this.kitchenmanagement = kitchenmanagement;
    }

    private KitchenManagement kitchenmanagement;

    public void contextExpression() {
        KitchenState.Light = On;
    }

    public KitchenManagement getKitchenmanagement() {
        return kitchenmanagement;
    }

    public void setKitchenmanagement(KitchenManagement kitchenmanagement) {
        this.kitchenmanagement = kitchenmanagement;
    }
}
// Use IDE to generate toString and equals methods

