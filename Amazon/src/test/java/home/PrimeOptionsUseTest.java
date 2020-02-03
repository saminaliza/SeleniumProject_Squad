package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PrimeOptionsUseTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToPrimeOptionsAndNavigateBackToHamburgerOptions() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.navigateBackToHamburgerOptions();
    }
    @Test
    public void testUserCanNavigateToPrimeVideoOptions() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickPrimeVideoOption();
    }
    @Test
    public void testUserCanNavigateToCheckWhatsIncludedWithPrime() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForIncludedWithPrimeOption();
    }
    @Test
    public void testUserCanNavigateToVideoChannelOption() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForVideoChannelOption();
    }
    @Test
    public void testUserCanNavigateToRentOrBuyOptionForPrimeMember() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForRentOrBuyOption();
    }
    @Test
    public void testUserCanNavigateToWatchListOptionForPrimeMember() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForWatchListOption();
    }
    @Test
    public void testUserCanNavigateToWatchAnywhereForPrimeMember() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForWatchAnyWhereOption();
    }
    @Test
    public void testUserCanNavigateToGettingStartedOption() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForGettingStartedOption();
    }
    @Test
    public void testUserCanNavigateToAmazonOriginalsOption() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForAmazonOriginalsOption();
    }
    @Test
    public void testUserCanNavigateToKidsOption() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForKidsOption();
    }
    @Test
    public void testUserCanNavigatePrimeOption() throws Exception {
        PrimeOptionsUse pO = PageFactory.initElements(driver, PrimeOptionsUse.class);
        pO.clickForNavigateToPrimeOption();
    }
}
