package amazonHelpOptionTest;

import amazonHelpOption.HelpOptionPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HelpOptionTest extends CommonAPI {
    @Test
    public void userCanNavigateToRewardVisaSignatureCardTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.accountLinkOptions();
    }

    @Test
    public void userCanNavigateToTheirOrdersListTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.ordersLinkOptions();
    }

    @Test
    public void userCanNavigateToShippingRatePageTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.shippingRateOptions();
    }

    @Test
    public void userCanNavigateToAmazonPrimePageTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.primeLinkOptions();
    }

    @Test
    public void userCanNavigateToReturnNReplacementPageTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.returnNReplacementOptions();
    }

    @Test
    public void userCanNavigateToManageTheirContentNDevicePageTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.contentNDeviceLinkOptions();
    }

    @Test
    public void userCanNavigateToAmazonAssistantPageTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.amazonAssistantLinkOptions();
    }

    @Test
    public void userCanNavigateToHelpPageTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.helpLinkOptions();
    }

    @Test
    public void userCanClickOnSeeMoreForAdditionalFeatureTest() {
        HelpOptionPage help = PageFactory.initElements(driver, HelpOptionPage.class);
        help.seeMoreLink();
    }
}
