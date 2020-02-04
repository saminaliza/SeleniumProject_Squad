package pageNavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;
import smallBusinessPage.SbPage;

public class NaviagationFromSmallBusinessPage extends CommonAPI {
    @BeforeMethod
    public void navigate() {
        driver.get("https://www.bankofamerica.com/smallbusiness/");
    }

    @Parameters({"onlineBankingServiceAgreementUrl"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void onlineBankingServiceAgreementNavigationFunctionality(String onlineBankingServiceAgreementUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.onlineBankingServiceAgreementPageTitle(), si.onlineBankingServiceAgreementActualTitle(onlineBankingServiceAgreementUrl));
    }

    @Parameters({"signInGoPaperlessUrl"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void signGoPaperLessNavigationFunctionality(String signInGoPaperlessUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.signGoPaperLessPageTitle(), si.signGoPaperLessActualTitle(signInGoPaperlessUrl));
    }

    @Parameters({"getMostFromYourCheckingCreditCardAccountsUrl"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void getMostFromYourCheckingCredit0NavigationFunctionality(String getMostFromYourCheckingCreditCardAccountsUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.getMostFromYourCheckingCreditPageTitle(), si.getMostFromYourCheckingCreditActualTitle(getMostFromYourCheckingCreditCardAccountsUrl));
    }

    @Parameters({"meetBusinessAdvantage360Url"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void meetBusinessAdvantage360NavigationFunctionality(String meetBusinessAdvantage360Url) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.meetBusinessAdvantage360PageTitle(), si.meetBusinessAdvantage360ActualTitle(meetBusinessAdvantage360Url));
    }

    @Parameters({"needFinancingFindTheRightSolutionUrl"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void needFinancingFindTheRightSolutionNavigationFunctionality(String needFinancingFindTheRightSolutionUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.needFinancingFindTheRightSolutionPageTitle(), si.needFinancingFindTheRightSolutionActualTitle(needFinancingFindTheRightSolutionUrl));
    }

    @Parameters({"bestPracticesForProcessingPayrollUrl"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void bestPracticesForProcessingPayrollNavigationFunctionality(String bestPracticesForProcessingPayrollUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.bestPracticesForProcessingPayrollPageTitle(), si.bestPracticesForProcessingPayrollActualTitle(bestPracticesForProcessingPayrollUrl));
    }

    @Parameters({"ourVideosCanHelpYouUrl"})
    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void ourVideosCanHelpYouRunNavigationFunctionality(String ourVideosCanHelpYouUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        Assert.assertEquals(si.ourVideosCanHelpYouRunPageTitle(), si.ourVideosCanHelpYouRunActualTitle(ourVideosCanHelpYouUrl));
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void onlineBankingServiceAgreementPageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.onlineBankingServiceAgreementPageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void signGoPaperLessPageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.signGoPaperLessPageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void getMostFromYourCheckingCreditPageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.getMostFromYourCheckingCreditPageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void meetBusinessAdvantage360PageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.meetBusinessAdvantage360PageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void needFinancingFindTheRightSolutionPageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.needFinancingFindTheRightSolutionPageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void bestPracticesForProcessingPayrollPageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.bestPracticesForProcessingPayrollPageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void ourVideosCanHelpYouRunPageTitleFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.ourVideosCanHelpYouRunPageTitle();
    }

    @Test(enabled=false)
    //Tests if the 'online Banking Service Agreement' tab is clickable.
    public void onlineBankingServiceAgreementClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.onlineBankingServiceAgreementClick();
    }

    @Test(enabled=false)
    //Tests if the 'sign Go Paper Less' tab is clickable.
    public void signGoPaperLessClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.signGoPaperLessClick();
    }

    @Test(enabled=false)
    //Tests if the 'meet Business Advantage360' tab is clickable.
    public void meetBusinessAdvantage360ClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.meetBusinessAdvantage360Click();
    }

    @Test(enabled=false)
    //Tests if the 'need Financing Find The Right Solution' tab is clickable.
    public void needFinancingFindTheRightSolutionClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.needFinancingFindTheRightSolutionClick();
    }

    @Test(enabled=false)
// Tests if the 'best Practices For Processing Payroll' tab is clickable.
    public void bestPracticesForProcessingPayrollClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.bestPracticesForProcessingPayrollClick();
    }

    @Test(enabled=false)
    //Tests if the 'our Videos Can Help You Run' tab is clickable.
    public void ourVideosCanHelpYouRunClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.ourVideosCanHelpYouRunClick();
    }

    @Test(enabled=false)
    //Tests if the 'get Most From Your Checking Credit' tab is clickable.
    public void getMostFromYourCheckingCreditClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.getMostFromYourCheckingCreditClick();
    }

    @Test(enabled=false)
    //Tests if the checking account tab takes the user to the checking account page
    public void openCheckingAccountClickFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        SbPage si=PageFactory.initElements(driver, SbPage.class);
        si.openCheckingClick();
    }
}
