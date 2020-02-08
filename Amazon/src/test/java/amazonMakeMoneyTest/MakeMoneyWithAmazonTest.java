package amazonMakeMoneyTest;

import amazonMakeMoneyWithUs.MakeMoneyOptionPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MakeMoneyWithAmazonTest extends CommonAPI {
    @Test
    public void userCanCheckSellOptionOnAmazon() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.sellOnAmazon();
    }

    @Test
    public void userCanCheckSellUnderOnAmazon() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.sellUnderAmazonAccelerator();
    }

    @Test
    public void userCanCheckSellOnAmazonHandmade() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.sellOnAmazonHandmade();
    }

    @Test
    public void userCanCheckSellServicesOnAmazon() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.sellServicesOnAmazon();
    }

    @Test
    public void userCanCheckSellOnAmazonBusiness() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.sellOnAmazonBusiness();
    }

    @Test
    public void userCanCheckSellAppsOnAmazon() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.sellAppsOnAmazon();
    }

    @Test
    public void userCanCheckAmazonAffiliate() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.becomeAmazonAffiliate();
    }

    @Test
    public void userCanCheckSelfPublishOnAmazon() {
        MakeMoneyOptionPage makeMoney = PageFactory.initElements(driver, MakeMoneyOptionPage.class);
        makeMoney.selfPublishWithAmazon();
    }

}
