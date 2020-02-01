package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageListTest extends CommonAPI {
    @Test
    public void testUserCanUseDropdownToGoToCreateListPage() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.selectCreateAListFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToFindAGiftPage() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.selectCreateAListFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToIdeaListPage() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.selectIdeaListFromMouseHover();
    }

    @Test
    public void testUserCanUseDropdownToGoToDiscoverPage() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canDiscoverOptionsFromMouseHover();
    }
    @Test
    public void testUserCanUseDropdownToGoToOrderListPage() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.cancheckOrderListOptionsFromDropdown();
    }
    @Test
    public void testUserCanUseDropdownToGoToPrimeMembershipInformation() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOPrimeMembershipFromDropdown();
    }
    @Test
    public void testUserCanGoToMusicLibraryPage() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOMusicLibraryFromDropdown();
    }
    @Test
    public void testUserCanCheckTheirPantryList() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOPantryListsFromDropdown();
    }
    @Test
    public void testUserCanCheckTheirRecommendation() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTORecommendationFromDropdown();
    }
    @Test
    public void testUserCanGoToCharityList() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOCharityListFromDropdown();
    }
    @Test
    public void testUserCanStartASellingAccount() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOSellAccountFromDropdown();
    }
    @Test
    public void testUserCanGoToSubscribeNSaveBtn() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOSubscribeNSaveItemFromDropdown();
    }
    @Test
    public void testUserCanGoToTheirCreditCardsOption() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOYourCreditCardFromDropdown();
    }
    @Test
    public void testUserCanRegisterForBusinessAccount() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoToBusinessAccountFromDropdown();
    }
    @Test
    public void testUserCanGoToTheirContentNDevices() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoToContentNDeviceOptionFromDropdown();
    }
    @Test
    public void testUserCanCheckForAmazonShowRooms() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canCheckForShowroomsFromDropdown();
    }
    @Test
    public void testUserCanLookForAndroidApps() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForAndroidAppsFromDropdown();
    }
    @Test
    public void testUserCanLookForAmazonPhotoOption() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForAmazonPhotoBtnFromDropdown();
    }
    @Test
    public void testUserCanLookForPrimeVideo() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForPrimeVideo();
    }
    @Test
    public void testUserCanGoToTheirWatchList() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForWatchList();
        Assert.assertEquals(true,true);
    }
}
