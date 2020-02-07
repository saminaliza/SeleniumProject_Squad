package pageNavigation;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class NavigationFromHomePage extends CommonAPI {

@Parameters({"smallBusinessUrl"})
@Test( enabled=false )
//This test checks weather the 'Small Business' element takes the user to the small business page
    public void smallBusinessTabFunctionality(String smallBusinessUrl) throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
    bhp.smallBusinessPageTitle(smallBusinessUrl);
}

@Parameters({"wealthManagementUrl"})
    @Test ( enabled=false )
//This test checks weather the 'Wealth Management' element takes the user to the wealth management page
    public void wealthManagementTabFunctionality(String wealthManagementUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.wealthManagementPageTitle(wealthManagementUrl);
}
    @Parameters({"businessInstitutionUrl"})
    @Test ( enabled=false )
//This test checks weather the 'Business and Institution' element takes the user to the business and institution page
    public void businessNInstitutionTabFunctionality(String businessInstitutionUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.businessNInstitutionPageTitle(businessInstitutionUrl);
    }
    @Parameters({"securityUrl"})
    @Test ( enabled=false )
//This test checks weather the 'Security' element takes the user to the security page
    public void securityTabFunctionality(String securityUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.securityPageTitle(securityUrl);
    }
    @Parameters({"aboutUsUrl"})
    @Test ( enabled=false )
    //This test checks weather the 'About Us' element takes the user to the about us page
    public void aboutUsTabFunctionality(String aboutUsUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.aboutUsPageTitle(aboutUsUrl);
    }
    @Parameters({"enEspanolUrl"})
    @Test ( enabled=false )
    //This test checks weather the 'En español' element takes the user to the spanish page
    public void EnEspañolTabFunctionality(String enEspanolUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.EnEspañolPageTitle(enEspanolUrl);
}
    @Parameters({"contactUsUrl"})
    @Test ( enabled=false )
    //This test checks weather the 'Contact Us' element takes the user to the contact us page
    public void contactUsTabFunctionality(String contactUsUrl) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.contactUsPageTitle(contactUsUrl);
    }
    @Test //( enabled=false )
    //Checks if the pop-up window for state selection appears on clicking the help element
    public void helpTabFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpTabPopUp();
    }
    @Test ( enabled=false )
        public void checkingFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.checkingClick();
    }
}
