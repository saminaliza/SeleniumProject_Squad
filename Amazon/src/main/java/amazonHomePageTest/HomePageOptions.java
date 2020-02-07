package amazonHomePageTest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageOptions extends CommonAPI {

    @FindBy(linkText = "Careers")
    WebElement careersLink;

    @FindBy(linkText = "Blog")
    WebElement blogLink;

    @FindBy(linkText = "Press Center")
    WebElement pressCenterLink;

    @FindBy(linkText = "Investor Relations")
    WebElement investorRelationsLink;

    @FindBy(linkText = "Sell on Amazon")
    WebElement sellLink;

    @FindBy(linkText = "Sell on Amazon Handmade")
    WebElement amazonHandMadeLink;

    @FindBy(linkText = "Become an Affiliate")
    WebElement affiliateLink;

    @FindBy(linkText = "Self-Publish with Us")
    WebElement selfPublishLink;

    @FindBy(linkText = "Advertise Your Products")
    WebElement advertisementLink;

    @FindBy(linkText = "Sell Your Apps on Amazon")
    WebElement sellAppsLink;

    public void clickOnCareer() {
        careersLink.click();
    }

    public void canClickOnBlogLink() {
        blogLink.click();
    }

    public void canGoToPressCenterOption() {
        pressCenterLink.click();
    }

    public void canGoToInvestorsRelationsOption() {
        investorRelationsLink.click();
    }

    public void canGoToSellsLinkOption() {
        sellLink.click();
    }

    public void canGoToAmazonHomeMadeOption() {
        amazonHandMadeLink.click();
    }

    public void canGoToAffiliateOption() {
        affiliateLink.click();
    }

    public void canGoToSelfPublishOption() {
        selfPublishLink.click();
    }

    public void canGoToAdvertiseProductOption() {
        advertisementLink.click();
    }

    public void canGoToSellingAppsOption() {
        sellAppsLink.click(); //need to check locator
    }

}