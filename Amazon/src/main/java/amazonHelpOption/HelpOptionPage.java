package amazonHelpOption;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpOptionPage extends CommonAPI {

    @FindBy(linkText = "Your Account")
    WebElement yourAccountLink;

    @FindBy(linkText = "Your Orders")
    WebElement ordersLink;

    @FindBy(linkText = "Shipping Rates & Policies")
    WebElement shippingRateLink;

    @FindBy(linkText = "Amazon Prime")
    WebElement primeLink;

    @FindBy(linkText = "Returns & Replacements")
    WebElement returnLink;

    @FindBy(linkText = "Manage Your Content and Devices")
    WebElement contentNDeviceLink;

    @FindBy(linkText = "Amazon Assistant")
    WebElement amazonAssistantLink;

    @FindBy(linkText = "Help")
    WebElement helpLink;

    @FindBy(linkText = "See More")
    WebElement moreOptionLink;

    public void accountLinkOptions() {
        yourAccountLink.click();
    }

    public void ordersLinkOptions() {
        ordersLink.click();
    }

    public void shippingRateOptions() {
        ordersLink.click();
    }

    public void primeLinkOptions() {
        primeLink.click();
    }

    public void returnNReplacementOptions() {
        primeLink.click();
    }

    public void contentNDeviceLinkOptions() {
        contentNDeviceLink.click();
    }

    public void amazonAssistantLinkOptions() {
        amazonAssistantLink.click();
    }

    public void helpLinkOptions() {
        helpLink.click();
    }

    public void seeMoreLink() {
        moreOptionLink.click();
    }
}
