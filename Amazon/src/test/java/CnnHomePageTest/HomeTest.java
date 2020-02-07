package CnnHomePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class HomeTest extends CommonAPI {
    @Test
    public void testUserCanUseSearchBox() {
        HomePage searchPage = PageFactory.initElements(driver, HomePage.class);
        searchPage.searchItems("backpack");
    }

    @Test
    public void userCanClickOnAmazonLogoTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.clickOnAmazonLogo();
    }

    @Test
    public void userCanClickOnReturnNOrderTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.returnNOrderProduct();
    }

    @Test
    public void userCanGoToShoppingCartTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.checkShoppingCart();
    }

    @Test
    public void userCanGoToPrimeTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.gotoPrime();
    }

    @Test
    public void userCanClickOnSignInTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.goToSignIn();
    }

    @Test
    public void userCanClickOnHamburgerIconForMoreOptionsTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.hamburgerIconForOptions();
    }

    @Test
    public void userCanSelectAddressTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useAddressBtn();
    }

    @Test
    public void userCanGoToTodaysDealPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useTodaysDealBtn();
    }

    @Test
    public void userCanGoToBestSellersPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useBestSellersBtn();
    }

    @Test
    public void userCanGoToCustomerServicePageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCustomerServiceBtn();
    }

    @Test
    public void userCanGoToFindAGiftPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useFindGiftBtn();
    }

    @Test
    public void userCanGoToNewReleasePageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useNewReleaseBtn(); //amazon problem
    }

    @Test
    public void userCanGoToRegistryPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useRegistryBtn(); //amazon problem
    }

    @Test
    public void userCanGoToSellPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useSellBtn(); //amazon problem
    }

    @Test
    public void testUserCanClickOnCountryBtn() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCountryBtn();
    }

    @Test
    public void userCanGoToCouponPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useCouponBtn(); //need to change the locator
    }

    @Test
    public void userCanGoToWholeFoodsPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.useWholeFoodsBtn(); //need to cjeck
    }

    @Test
    public void userCanGoBackToTopOfHomePageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.backToTopNavigation();
    }

    @Test
    public void userCanGoToAboutAmazonPageTest() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.canClickOnAboutAmazon();
    }
}