package sensomod.generated;

public class ShopSpeakerOn extends ContextDescription {

    public ShopSpeakerOn(ShopManagement shopmanagement) {
        this.name = "ShopSpeakerOn";
        this.shopmanagement = shopmanagement;
    }

    private ShopManagement shopmanagement;

    public void contextExpression() {
        ShopState.Speaker = On;
    }

    public ShopManagement getShopmanagement() {
        return shopmanagement;
    }

    public void setShopmanagement(ShopManagement shopmanagement) {
        this.shopmanagement = shopmanagement;
    }
}
// Use IDE to generate toString and equals methods

