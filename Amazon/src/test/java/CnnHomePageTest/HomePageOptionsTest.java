package CnnHomePageTest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageOptionsTest extends CommonAPI {
    @Test
    public void userCanGoToCareersLinkTest() {
        HomePageOptions hm = PageFactory.initElements(driver, HomePageOptions.class);
        hm.clickOnCareer();
    }

    @Test
    public void userCanGoToBlogPageTest() {
        HomePageOptions hm = PageFactory.initElements(driver, HomePageOptions.class);
        hm.canClickOnBlogLink();
    }

    @Test
    public void userCanNavigateToPressCenterPageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToPressCenterOption();
    }

    @Test
    public void userCanNavigateToInvestorsRelationsPageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToInvestorsRelationsOption();
    }

    @Test
    public void userCanNavigateToSellsPageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToSellsLinkOption();
    }

    @Test
    public void userCanNavigateAmazonHomeMadePageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToAmazonHomeMadeOption();
    }

    @Test
    public void testUserCanNavigateToAffiliatePage() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToAffiliateOption();
    }

    @Test
    public void userCanNavigateToSelfPublishPageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToSelfPublishOption();
    }

    @Test
    public void userCanNavigateToAdvertisementPageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToAdvertiseProductOption();
    }

    @Test
    public void userCanNavigateToSellingAppPageTest() {
        HomePageOptions homePageOptions = PageFactory.initElements(driver, HomePageOptions.class);
        homePageOptions.canGoToSellingAppsOption(); //need to check
    }

}