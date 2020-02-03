package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePageOptionsTest extends CommonAPI {
    @Test
    public void testUserCanGoToCareersLink() {
        HomePageOptions hm = PageFactory.initElements(driver, HomePageOptions.class);
        hm.clickOnCareer();
    }
    @Test
    public void testUserCanGoToBlogPage(){
        HomePageOptions hm = PageFactory.initElements(driver,HomePageOptions.class);
        hm.canClickOnBlogLink();
    }
    @Test
    public void testUserCanNavigateToPressCenterPage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToPressCenterOption();
    }
    @Test
    public void testUserCanNavigateToInvestorsRelationsPage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToInvestorsRelationsOption();
    }
    @Test
    public void testUserCanNavigateToSellsPage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToSellsLinkOption();
    }
    @Test
    public void testUserCanNavigateAmazonHomeMadePage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToAmazonHomeMadeOption();
    }
    @Test
    public void testUserCanNavigateToAffiliatePage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToAffiliateOption();
    }
    @Test
    public void testUserCanNavigateToSelfPublishPage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToSelfPublishOption();
    }
    @Test
    public void testUserCanNavigateToAdvertisementPage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToAdvertiseProductOption();
    }
    @Test
    public void testUserCanNavigateToSellingAppPage(){
        HomePageOptions homePageOptions = PageFactory.initElements(driver,HomePageOptions.class);
        homePageOptions.canGoToSellingAppsOption();
    }

}
