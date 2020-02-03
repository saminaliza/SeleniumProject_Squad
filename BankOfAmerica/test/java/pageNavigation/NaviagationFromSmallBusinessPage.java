package pageNavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;
import smallBusinessPage.SbPage;

public class NaviagationFromSmallBusinessPage extends CommonAPI{
    @BeforeMethod
    public void navigate (){
        driver.get("https://www.bankofamerica.com/smallbusiness/");
    }

    @Test (enabled = false)
    //Tests if the checking account tab takes the user to the checking account page
    public void smallBusinessFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SbPage si = PageFactory.initElements(driver, SbPage.class);
        si.openCheckingAcWebElement.click();
    }
}
