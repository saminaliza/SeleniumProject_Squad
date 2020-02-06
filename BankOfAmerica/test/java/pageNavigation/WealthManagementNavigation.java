package pageNavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import wealthManagement.WealthManagementPage;

public class WealthManagementNavigation extends CommonAPI {

    @BeforeMethod
    public void navigate() {
        driver.get("https://www.ml.com/wealthmanagement.html");
    }

    @Test (enabled = false)
    public void merrillPageTitleAssert() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        Assert.assertEquals(wmp.merrillActualPageTitle(), wmp.merrillActualPageTitle());
    }
    @Test (enabled = false)
    public void privateBankPageTitleAssert() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        Assert.assertEquals(wmp.privateBankPageTitle(), wmp.privateBankActualPageTitle());
    }
    @Test (enabled = false)
    public void privateBankPageTitleFetch() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        wmp.privateBankPageTitle();
    }
    @Test (enabled = false)
    public void merrillPageTitleFetch() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        wmp.merrillPageTitle();
    }

    @Test (enabled = false)
    public void merrillLearnMoreClickable() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        wmp.merrillLearnMoreClick();
    }
    @Test (enabled = false)
    public void privateBankClickable() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        wmp.privateBankClick();
    }
    @Test (enabled = false)
    public void merrilLearnMore2Clickable() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        wmp.merrilLearnMore2Click();
    }
    @Test (enabled = false)
    public void privateBank2Clickable() throws InterruptedException {
        WealthManagementPage wmp =PageFactory.initElements(driver, WealthManagementPage.class);
        wmp.privateBank2Click();
    }

}
