package amazonShoppingCartTest;

import amazonShoppingCart.ShoppingCartPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShoppingCartTest extends CommonAPI {
    @Test
    public void userCanCheckoutItemsTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.shoppingCartCheckout();
    }

    @Test
    public void userCanDeleteItemFromCartTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.deleteItemFromCart();
    }

    @Test
    public void userCanSaveItemForLaterTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.saveItemForLater();
    }

    @Test
    public void userCanCompareSimilarItemTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.saveItemForLater();
    }
}
