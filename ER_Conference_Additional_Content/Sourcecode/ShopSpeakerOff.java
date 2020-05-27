package sensomod.generated;

public class ShopSpeakerOff extends ContextDescription {

    public ShopSpeakerOff(ShopManagement shopmanagement) {
        this.name = "ShopSpeakerOff";
        this.shopmanagement = shopmanagement;
    }

    private ShopManagement shopmanagement;

    public void contextExpression() {
        ShopState.Speaker = Off;
    }

    public ShopManagement getShopmanagement() {
        return shopmanagement;
    }

    public void setShopmanagement(ShopManagement shopmanagement) {
        this.shopmanagement = shopmanagement;
    }
}
// Use IDE to generate toString and equals methods

