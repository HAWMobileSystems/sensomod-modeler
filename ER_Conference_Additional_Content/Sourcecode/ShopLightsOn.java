package sensomod.generated;

public class ShopLightsOn extends ContextDescription {

    public ShopLightsOn(ShopManagement shopmanagement) {
        this.name = "ShopLightsOn";
        this.shopmanagement = shopmanagement;
    }

    private ShopManagement shopmanagement;

    public void contextExpression() {
        ShopState.Lights = On;
    }

    public ShopManagement getShopmanagement() {
        return shopmanagement;
    }

    public void setShopmanagement(ShopManagement shopmanagement) {
        this.shopmanagement = shopmanagement;
    }
}
// Use IDE to generate toString and equals methods

