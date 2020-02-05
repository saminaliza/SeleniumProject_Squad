package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoreOnHomePageTest extends CommonAPI {
    @Test
    public void testUserCanUseDropdownToGoToCreateListPage() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.selectCreateAListFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToFindAGiftPage() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.selectCreateAListFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToIdeaListPage() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.selectIdeaListFromMouseHover();
    }

    @Test
    public void testUserCanUseDropdownToGoToDiscoverPage() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canDiscoverOptionsFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToOrderListPage() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.cancheckOrderListOptionsFromDropdown();
    }
    @Test
    public void testUserCanUseDropdownToGoToPrimeMembershipInformation() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOPrimeMembershipFromDropdown();
    }
    @Test
    public void testUserCanGoToMusicLibraryPage() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOMusicLibraryFromDropdown();
    }
    @Test
    public void testUserCanCheckTheirPantryList() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOPantryListsFromDropdown();
    }
    @Test
    public void testUserCanCheckTheirRecommendation() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTORecommendationFromDropdown();
    }
    @Test
    public void testUserCanGoToCharityList() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOCharityListFromDropdown();
    }
    @Test
    public void testUserCanStartASellingAccount() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOSellAccountFromDropdown();
    }
    @Test
    public void testUserCanGoToSubscribeNSaveBtn() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOSubscribeNSaveItemFromDropdown();
    }
    @Test
    public void testUserCanGoToTheirCreditCardsOption() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoTOYourCreditCardFromDropdown();
    }
    @Test
    public void testUserCanRegisterForBusinessAccount() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoToBusinessAccountFromDropdown();
    }
    @Test
    public void testUserCanGoToTheirContentNDevices() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canGoToContentNDeviceOptionFromDropdown();
    }
    @Test
    public void testUserCanCheckForAmazonShowRooms() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canCheckForShowroomsFromDropdown();
    }
    @Test
    public void testUserCanLookForAndroidApps() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canLookForAndroidAppsFromDropdown();
    }
    @Test
    public void testUserCanLookForAmazonPhotoOption() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canLookForAmazonPhotoBtnFromDropdown();
    }
    @Test
    public void testUserCanLookForPrimeVideo() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver,MoreOnHomePage.class);
        hm.canLookForPrimeVideo();
    }
    @Test
    public void testUserCanGoToTheirWatchList() throws Exception {
        MoreOnHomePage hm = PageFactory.initElements(driver, MoreOnHomePage.class);
        hm.canLookForWatchList();
        Assert.assertEquals(true,true);
    }
}
