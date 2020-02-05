package pageNavigation;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NavigationFromHomePageFooter extends CommonAPI {
    @Parameters({"locationsUrl"})
    @Test (enabled=false)
    //Checks if the locations link on the footer of the page navigates to locations page.
    public void locationFunctionality(String locationsUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.locationPageTitle(locationsUrl);
    }

    @Parameters({"contactUsUrl"})
    @Test (enabled=false)
    //Checks if the contactUs link on the footer of the page navigates to contact us page.
    public void contactUsFooterFunctionality(String contactUsUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.contactUsFooterWebElement.click();
        bhp.contactUsFooterPageTitle(contactUsUrl);
    }

    @Parameters({"helpUrl"})
    @Test (enabled=false)
    public void helpFooterFunctionality(String helpurl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpFooterPageTitle(helpurl);
    }

    @Parameters({"accessibleBankingUrl"})
    @Test (enabled=false)
    public void accessibleBankingFunctionality(String accessibleBankingUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.accessibleBankingFooterPageTitle(accessibleBankingUrl);
    }

    @Parameters({"careersUrl"})
    @Test(enabled=false)
    //checks if the career tab on the footer of the homepage navigates to the proper career page.
    public void careersFunctionality(String careersUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        driver.navigate().to(careersUrl);
        String careersTitle=driver.getTitle();
        driver.navigate().back();
        BoaHomePage.carrearsFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), careersTitle);
    }

    @Parameters ({"privacySecurityUrl"})
    @Test(enabled=false)
    public void privacySecurityFunctionality(String privacySecurityUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        driver.navigate().to(privacySecurityUrl);
        String privacySecurityTitle=driver.getTitle();
        driver.navigate().back();
        BoaHomePage.privacySecurityFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), privacySecurityTitle);
    }

    @Parameters({"mcafeeUrl"})
    @Test (enabled=false)
    //checks if the mcafee tab on the footer of the page navigates to the expected page.
    public void mcafeeFunctionality(String mcafeeUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        driver.navigate().to(mcafeeUrl);
        String mcafeeTitle=driver.getTitle();
        driver.navigate().back();
        BoaHomePage.mcafeeFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), mcafeeTitle);
    }

    @Parameters({"sitemapUrl"})
    @Test (enabled=false)
    public void sitemapFunctionality(String sitemapUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        driver.navigate().to(sitemapUrl);
        String sitemapTitle=driver.getTitle();
        driver.navigate().back();
        BoaHomePage.sitemapFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), sitemapTitle);
    }

    @Test (enabled=false)
    public void advertisingPracticeFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.advertisingPracticeFooterWebElement.click();
        waitUntilClickAble(By.id(String.valueOf(BoaHomePage.advertisingPracticeFooterWebElement)));
        isPopUpWindowDisplayed(driver, "#WebsiteAdPractices_OptOut");
    }

    @Parameters({"feedbackFooterUrl"})
    @Test (enabled=false)
    public void feedbackFooterFunctionality(String feedbackFooterUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.feedbackFooterWebElement.click();
        handleNewTab(driver);
        Assert.assertEquals(driver.getCurrentUrl(), feedbackFooterUrl);
    }

    @Parameters({"onlineBanking"})
    @Test ( enabled=false )
    //checks if the online banking tab on the footer navigates to the online banking page
    public void onlineBankingFunctionality(String onlineBanking) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        driver.navigate().to(onlineBanking);
        String onlineBankingPageTitle=driver.getTitle();
        driver.navigate().back();
        BoaHomePage.onlineBankingLinkrWebElement.click();
        Assert.assertEquals(driver.getTitle(), onlineBankingPageTitle);
    }
}