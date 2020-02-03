package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HelpOptionsTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToRewardVisaSignatureCard(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.accountLinkOptions();
    }
    @Test
    public void testUserCanNavigateToTheirOrdersList(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.ordersLinkOptions();
    }
    @Test
    public void testUserCanNavigateToShippingRatePage(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.shippingRateOptions();
    }
    @Test
    public void testUserCanNavigateToAmazonPrimePage(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.primeLinkOptions();
    }
    @Test
    public void testUserCanNavigateToReturnNReplacementPage(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.returnNReplacementOptions();
    }
    @Test
    public void testUserCanNavigateToManageTheirContentNDevicePage(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.contentNDeviceLinkOptions();
    }
    @Test
    public void testUserCanNavigateToAmazonAssistantPage(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.amazonAssistantLinkOptions();
    }
    @Test
    public void testUserCanNavigateToHelpPage(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.helpLinkOptions();
    }
    @Test
    public void testUserCanClickOnSeeMoreForAdditionalFeature(){
        HelpOptions helpOptions = PageFactory.initElements(driver,HelpOptions.class);
        helpOptions.seeMoreLink();
    }
}
