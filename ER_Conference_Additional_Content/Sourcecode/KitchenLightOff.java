package sensomod.generated;

public class KitchenLightOff extends ContextDescription {

    public KitchenLightOff(KitchenManagement kitchenmanagement) {
        this.name = "KitchenLightOff";
        this.kitchenmanagement = kitchenmanagement;
    }

    private KitchenManagement kitchenmanagement;

    public void contextExpression() {
        KitchenState.Light = Off;
    }

    public KitchenManagement getKitchenmanagement() {
        return kitchenmanagement;
    }

    public void setKitchenmanagement(KitchenManagement kitchenmanagement) {
        this.kitchenmanagement = kitchenmanagement;
    }
}
// Use IDE to generate toString and equals methods

