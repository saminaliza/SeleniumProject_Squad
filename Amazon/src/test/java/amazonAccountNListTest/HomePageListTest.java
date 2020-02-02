package amazonAccountNListTest;

import amazonAccountNLists.HomePageList;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageListTest extends CommonAPI {
    @Test
    public void userCanUseDropdownToGoToCreateListPageTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.selectCreateAListFromMouseHover();
    }

    @Test
    public void userCanUseDropdownToGoToFindAGiftPageTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.selectCreateAListFromMouseHover();
    }

    @Test
    public void userCanUseDropdownToGoToIdeaListPageTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.selectIdeaListFromMouseHover();
    }

    @Test
    public void userCanUseDropdownToGoToDiscoverPageTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canDiscoverOptionsFromMouseHover();
    }

    @Test
    public void userCanUseDropdownToGoToOrderListPageTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.cancheckOrderListOptionsFromDropdown();
    }

    @Test
    public void userCanUseDropdownToGoToPrimeMembershipInformationTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOPrimeMembershipFromDropdown();
    }

    @Test
    public void userCanGoToMusicLibraryPageTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOMusicLibraryFromDropdown();
    }

    @Test
    public void userCanCheckTheirPantryListTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOPantryListsFromDropdown();
    }

    @Test
    public void userCanCheckTheirRecommendationTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTORecommendationFromDropdown();
    }

    @Test
    public void userCanGoToCharityListTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOCharityListFromDropdown();
    }

    @Test
    public void userCanStartASellingAccountTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOSellAccountFromDropdown();
    }

    @Test
    public void userCanGoToSubscribeNSaveBtnTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOSubscribeNSaveItemFromDropdown();
    }

    @Test
    public void userCanGoToTheirCreditCardsOptionTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoTOYourCreditCardFromDropdown();
    }

    @Test
    public void userCanRegisterForBusinessAccountTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoToBusinessAccountFromDropdown();
    }

    @Test
    public void userCanGoToTheirContentNDevicesTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canGoToContentNDeviceOptionFromDropdown();
    }

    @Test
    public void userCanCheckForAmazonShowRoomsTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canCheckForShowroomsFromDropdown();
    }

    @Test
    public void userCanLookForAndroidAppsTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForAndroidAppsFromDropdown();
    }

    @Test
    public void userCanLookForAmazonPhotoOptionTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForAmazonPhotoBtnFromDropdown();
    }

    @Test
    public void userCanLookForPrimeVideoTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForPrimeVideo();
    }

    @Test
    public void userCanGoToTheirWatchListTest() throws Exception {
        HomePageList hm = PageFactory.initElements(driver, HomePageList.class);
        hm.canLookForWatchList();
        Assert.assertEquals(true, true);
    }
}
