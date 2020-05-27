package sensomod.generated;

public class ShopLightsOff extends ContextDescription {

    public ShopLightsOff(ShopManagement shopmanagement) {
        this.name = "ShopLightsOff";
        this.shopmanagement = shopmanagement;
    }

    private ShopManagement shopmanagement;

    public void contextExpression() {
        ShopState.Lights = Off;
    }

    public ShopManagement getShopmanagement() {
        return shopmanagement;
    }

    public void setShopmanagement(ShopManagement shopmanagement) {
        this.shopmanagement = shopmanagement;
    }
}
// Use IDE to generate toString and equals methods

