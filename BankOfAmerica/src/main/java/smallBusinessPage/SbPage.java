package smallBusinessPage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Parameters;

public class SbPage extends CommonAPI{

    @FindBy(how = How.CSS, using ="span.spa-btn")
    public static WebElement openCheckingAcWebElement;

    @FindBy(how=How.XPATH, using="//a[@id='bmhDefaultGetMostFromAccounts' and @class='slide-content ']")
    public static WebElement getMostFromYourCheckingCreditCardWebElement;

    @FindBy(how=How.CSS, using="#bmhDefaultVideosToHelpBusiness > p:nth-child(2)")
    public static WebElement ourVideosCanHelpYouRunWebElement;

    @FindBy(how=How.XPATH, using="//a[@id='bmhDefaultProcessingPayrollBestPractices' and @class='slide-content ']")
    public static WebElement bestPracticesForProcessingPayrollWebElement;

    @FindBy(how=How.XPATH, using="//a[id='bmhSbFinancingSolutions' and @class='slide-content ']")
    public static WebElement needFinancingFindTheRightSolutionWebElement;

    @FindBy(how=How.CSS, using="#yniMeetBusinessAdvantage360Cta")
    public static WebElement meetBusinessAdvantage360WebElement;

    @FindBy(how=How.XPATH, using="//a[@id='sign-in' and @class='spa-btn spa-btn--primary spa-btn--medium']")
    public static WebElement signGoPaperLessWebElement;

    @FindBy(how=How.ID, using="footer_bofa_online_banking_service_agreement")
    public static WebElement onlineBankingServiceAgreementWebElement;


    public String onlineBankingServiceAgreementPageTitle() {
        onlineBankingServiceAgreementClick();
        handleNewTab(driver);
        return driver.getTitle();
    }

    @Parameters({"onlineBankingServiceAgreementUrl"})
    public String onlineBankingServiceAgreementActualTitle(String onlineBankingServiceAgreementUrl) {
        driver.navigate().to(onlineBankingServiceAgreementUrl);
        return driver.getTitle();
    }

    public String signGoPaperLessPageTitle() {
        signGoPaperLessClick();
        return driver.getTitle();
    }

    @Parameters({"signInGoPaperlessUrl"})
    public String signGoPaperLessActualTitle(String signInGoPaperlessUrl) {
        driver.navigate().to(signInGoPaperlessUrl);
        return driver.getTitle();
    }

    public String getMostFromYourCheckingCreditPageTitle() {
        getMostFromYourCheckingCreditClick();
        return driver.getTitle();
    }

    @Parameters({"getMostFromYourCheckingCreditCardAccountsUrl"})
    public String getMostFromYourCheckingCreditActualTitle(String getMostFromYourCheckingCreditCardAccountsUrl) {
        driver.navigate().to(getMostFromYourCheckingCreditCardAccountsUrl);
        return driver.getTitle();
    }

    public String meetBusinessAdvantage360PageTitle() {
        meetBusinessAdvantage360Click();
        return driver.getTitle();
    }

    @Parameters({"meetBusinessAdvantage360Url"})
    public String meetBusinessAdvantage360ActualTitle(String meetBusinessAdvantage360Url) {
        driver.navigate().to(meetBusinessAdvantage360Url);
        return driver.getTitle();
    }

    public String needFinancingFindTheRightSolutionPageTitle() {
        needFinancingFindTheRightSolutionClick();
        return driver.getTitle();
    }

    @Parameters({"needFinancingFindTheRightSolutionUrl"})
    public String needFinancingFindTheRightSolutionActualTitle(String needFinancingFindTheRightSolutionUrl) {
        driver.navigate().to(needFinancingFindTheRightSolutionUrl);
        return driver.getTitle();
    }

    public String bestPracticesForProcessingPayrollPageTitle() {
        bestPracticesForProcessingPayrollClick();
        return driver.getTitle();
    }

    @Parameters({"bestPracticesForProcessingPayrollUrl"})
    public String bestPracticesForProcessingPayrollActualTitle(String bestPracticesForProcessingPayrollUrl) {
        driver.navigate().to(bestPracticesForProcessingPayrollUrl);
        return driver.getTitle();
    }

    public String ourVideosCanHelpYouRunPageTitle() {
        ourVideosCanHelpYouRunClick();
        return driver.getTitle();
    }

    @Parameters({"ourVideosCanHelpYouUrl"})
    public String ourVideosCanHelpYouRunActualTitle(String ourVideosCanHelpYouUrl) {
        driver.navigate().to(ourVideosCanHelpYouUrl);
        return driver.getTitle();
    }

    public void openCheckingClick() {
        openCheckingAcWebElement.click();
    }

    public void getMostFromYourCheckingCreditClick() {
        getMostFromYourCheckingCreditCardWebElement.click();
        waitUntilVisible(By.xpath("//a[@id='bmhDefaultGetMostFromAccounts' and @class='slide-content ']"));
    }

    public void ourVideosCanHelpYouRunClick() {
        ourVideosCanHelpYouRunWebElement.click();
    }

    public void bestPracticesForProcessingPayrollClick() {
        bestPracticesForProcessingPayrollWebElement.click();
    }

    public void needFinancingFindTheRightSolutionClick() {
        needFinancingFindTheRightSolutionWebElement.click();
    }

    public void meetBusinessAdvantage360Click() {
        meetBusinessAdvantage360WebElement.click();
    }

    public void signGoPaperLessClick() {
        signGoPaperLessWebElement.click();
    }

    public void onlineBankingServiceAgreementClick() {
        onlineBankingServiceAgreementWebElement.click();
    }

}
