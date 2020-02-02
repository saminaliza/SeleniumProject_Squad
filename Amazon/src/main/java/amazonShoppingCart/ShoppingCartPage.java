package amazonShoppingCart;

import amazonSignIn.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class ShoppingCartPage extends CommonAPI {
    @BeforeMethod
    public void setUpLogin() {
        SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);
        signIn.signIn("myautotestmail2020@gmail.com", "test2055");
    }

    @FindBy(css = "a[id='nav-cart']")
    WebElement shoppingCart;

    @FindBy(name = "proceedToRetailCheckout")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
    WebElement deliverToThisAddress;

    @FindBy(xpath = "//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]")
    WebElement continueBTn;

    @FindBy(xpath = "//*[@id=\"checkoutDisplayPage\"]/div[1]")
    WebElement checkOutBtn;

    @FindBy(linkText = "Save for later")
    WebElement saveForLater;

    @FindBy(linkText = "Delete")
    WebElement delete;

    @FindBy(linkText = "Compare with similar items")
    WebElement compareItems;

    public void goToShoppingCart() {
        shoppingCart.click();
    }

    public void shoppingCartCheckout() {
        goToShoppingCart();
        proceedToCheckout.click();
        deliverToThisAddress.click();
        continueBTn.click();
        checkOutBtn.click();
    }

    public void deleteItemFromCart() {
        goToShoppingCart();
        delete.click();
    }

    public void saveItemForLater() {
        goToShoppingCart();
        saveForLater.click();
    }

    public void compareSimilarItems() {
        goToShoppingCart();
        compareItems.click();
    }
}
