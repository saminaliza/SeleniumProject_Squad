package amazonPrimeTest;

import amazonPrime.PrimeOptionsPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PrimeOptionsUseTest extends CommonAPI {
    @Test
    public void userCanNavigateToPrimeOptionsAndNavigateBackToHamburgerOptionsTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.navigateBackToHamburgerOptions();
    }

    @Test
    public void userCanNavigateToPrimeVideoOptionsTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickPrimeVideoOption();
    }

    @Test
    public void userCanNavigateToCheckWhatsIncludedWithPrimeTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForIncludedWithPrimeOption();
    }

    @Test
    public void userCanNavigateToVideoChannelOptionTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForVideoChannelOption();
    }

    @Test
    public void userCanNavigateToRentOrBuyOptionForPrimeMemberTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForRentOrBuyOption();
    }

    @Test
    public void userCanNavigateToWatchListOptionForPrimeMemberTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForWatchListOption();
    }

    @Test
    public void userCanNavigateToWatchAnywhereForPrimeMemberTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForWatchAnyWhereOption();
    }

    @Test
    public void userCanNavigateToGettingStartedOptionTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForGettingStartedOption();
    }

    @Test
    public void userCanNavigateToAmazonOriginalsOptionTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForAmazonOriginalsOption();
    }

    @Test
    public void userCanNavigateToKidsOptionTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForKidsOption();
    }

    @Test
    public void userCanNavigatePrimeOptionTest() throws Exception {
        PrimeOptionsPage pO = PageFactory.initElements(driver, PrimeOptionsPage.class);
        pO.clickForNavigateToPrimeOption();
    }
}
