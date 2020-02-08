package amazonMakeMoneyWithUs;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeMoneyOptionPage extends CommonAPI {

    @FindBy(linkText = "Sell on Amazon")
    WebElement sellOnAmazon;

    @FindBy(linkText = "Sell Under Amazon Accelerator")
    WebElement sellUnderAccelerator;

    @FindBy(linkText = "Sell on Amazon Handmade")
    WebElement sellOnAmazonHandmade;

    @FindBy(linkText = "Sell Your Services on Amazon")
    WebElement sellServicesOnAmazon;

    @FindBy(linkText = "Sell on Amazon Business")
    WebElement sellOnAmazonBusiness;

    @FindBy(linkText = "Sell Your Apps on Amazon")
    WebElement sellAppOnAmazon;

    @FindBy(linkText = "Become an Affiliate")
    WebElement amazonAffiliate;

    @FindBy(linkText = "Advertise Your Products")
    WebElement advertiseYourProducts;

    @FindBy(linkText = "Self-Publish with Us")
    WebElement selfPublishWithUs;

    public void sellOnAmazon() {
        sellOnAmazon.click();
    }

    public void sellUnderAmazonAccelerator() {
        sellUnderAccelerator.click();
    }

    public void sellOnAmazonHandmade() {
        sellOnAmazonHandmade.click();
    }

    public void sellServicesOnAmazon() {
        sellServicesOnAmazon.click();
    }

    public void sellOnAmazonBusiness() {
        sellOnAmazonBusiness.click();
    }

    public void sellAppsOnAmazon() {
        sellAppOnAmazon.click();
    }

    public void becomeAmazonAffiliate() {
        amazonAffiliate.click();
    }

    public void advertiseProductOnAmazon() {
        advertiseYourProducts.click();
    }

    public void selfPublishWithAmazon() {
        selfPublishWithUs.click();
    }
}
