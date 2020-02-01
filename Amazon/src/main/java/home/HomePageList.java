package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePageList extends CommonAPI {
    @FindBy(id = "nav-link-accountList")
    WebElement signInBtn;
    @FindBy(linkText = "Start here.")
    WebElement signInLink;
    @FindBy (linkText = "Create a List")
    WebElement listlink;
    @FindBy (linkText = "Find a Gift")
    WebElement findGiftlink;
    @FindBy(linkText = "Explore Idea Lists")
    WebElement ideaListLink;
    @FindBy(linkText = "Discover")
    WebElement discoverLink;
    @FindBy(linkText = "Your Orders")
    WebElement ordersLink;
    @FindBy(linkText = "Your Prime Membership")
    WebElement primeMembershipLink;
    @FindBy(linkText = "Your Music Library")
    WebElement musicLibraryBtn;
    @FindBy(linkText = "Pantry Lists")
    WebElement pantryListsBtn;
    @FindBy(linkText = "Your Recommendations")
    WebElement recommendationsBtn;
    @FindBy(linkText = "AmazonSmile Charity Lists")
    WebElement charityListBtn;
    @FindBy(linkText = "Start a Selling Account")
    WebElement sellingAccountBtn;
    @FindBy(linkText = "Your Subscribe & Save Items")
    WebElement subscribeNSaveBtn;
    @FindBy(linkText = "Your Amazon Credit Cards")
    WebElement creditCardsBtn;
    @FindBy(linkText = "Register for a Business Account")
    WebElement businessAccountBtn;
    @FindBy(linkText = "Your Content and Devices")
    WebElement contentNDeviceBtn;
    @FindBy(linkText = "Explore Showroom")
    WebElement showRoomBtn;
    @FindBy(linkText = "Your Android Apps & Devices")
    WebElement androidAppsBtn;
    @FindBy(linkText = "Your Amazon Photos")
    WebElement amazonPhotoBtn;
    @FindBy(linkText = "Your Prime Video")
    WebElement primeVideoBtn;
    @FindBy(linkText = "Your Watchlist")
    WebElement watchListBtn;

    public void selectCreateAListFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(listlink).perform();
        actions.click().build().perform();
    }
    public void selectFindGiftFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(findGiftlink).perform();
        actions.click().build().perform();
    }
    public void selectIdeaListFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(ideaListLink).perform();
        actions.click().build().perform();
    }
    public void canDiscoverOptionsFromMouseHover() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(discoverLink).perform();
        actions.click().build().perform();
    }
    public void cancheckOrderListOptionsFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(ordersLink).perform();
        actions.click().build().perform();
    }
    public void canGoTOPrimeMembershipFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(primeMembershipLink).perform();
        actions.click().build().perform();
    }
    public void canGoTOMusicLibraryFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(musicLibraryBtn).perform();
        actions.click().build().perform();
    }
    public void canGoTOPantryListsFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(pantryListsBtn).perform();
        actions.click().build().perform();
    }
    public void canGoTORecommendationFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(recommendationsBtn).perform();
        actions.click().build().perform();
    }
    public void canGoTOCharityListFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(charityListBtn).perform();
        actions.click().build().perform();
    }
    public void canGoTOSellAccountFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(sellingAccountBtn).perform();
        actions.click().build().perform();
    }
    public void canGoTOSubscribeNSaveItemFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(subscribeNSaveBtn).perform();
        actions.click().build().perform();
    }
    public void canGoTOYourCreditCardFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(creditCardsBtn).perform();
        actions.click().build().perform();
    }
    public void canGoToBusinessAccountFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(businessAccountBtn).perform();
        actions.click().build().perform();
    }
    public void canGoToContentNDeviceOptionFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(contentNDeviceBtn).perform();
        actions.click().build().perform();
    }
    public void canCheckForShowroomsFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(showRoomBtn).perform();
        actions.click().build().perform();
    }
    public void canLookForAndroidAppsFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(androidAppsBtn).perform();
        actions.click().build().perform();
    }
    public void canLookForAmazonPhotoBtnFromDropdown() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(amazonPhotoBtn).perform();
        actions.click().build().perform();
    }
    public void canLookForPrimeVideo() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(primeVideoBtn).perform();
        actions.click().build().perform();
    }
    public void canLookForWatchList() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(watchListBtn).perform();
        actions.click().build().perform();
    }

}
