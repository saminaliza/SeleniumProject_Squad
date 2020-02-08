package amazonShoppingCartTest;

import amazonShoppingCart.ShoppingCartPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ShoppingCartTest extends CommonAPI {
    @Test
    public void useCanAddItemToCartFromTodaysDeal(){
        ShoppingCartPage shop = PageFactory.initElements(driver,ShoppingCartPage.class);
        shop.addItemFromTodaysDeal();
    }
    @Test
    public void userCanCheckShoppingCart(){
        ShoppingCartPage shop = PageFactory.initElements(driver,ShoppingCartPage.class);
        shop.goToShoppingCart();
    }

    @Test
    public void userCanDeleteItemFromCartTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.addItemFromTodaysDeal();
        shop.saveItemForLater();
        //shop.deleteItemFromCart();
    }

    @Test
    public void userCanSaveItemForLaterTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.addItemFromTodaysDeal();
        shop.saveItemForLater();
    }

    @Test
    public void userCanCompareSimilarItemTest() {
        ShoppingCartPage shop = PageFactory.initElements(driver, ShoppingCartPage.class);
        shop.addItemFromTodaysDeal();
        shop.saveItemForLater();
    }
}
