package signInPanel;

import base.CommonAPI;
import homepage.SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class negativeSignIn extends CommonAPI{

    @Parameters({"onlineID"})
    @Test ( enabled = false)
    // checks if the onlineId text box takes in values
    public void onlineIdTextBoxFunctionality(String onlineID){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
    SignIn si = PageFactory.initElements(driver, SignIn.class);
    typeOnElement("#onlineId1", onlineID);
    takeScreenShot();
}
    @Parameters({"passcode"})
    @Test ( enabled = false)
    // checks if the passcode text box takes in values
    public void passcodeTextBoxFunctionality(String passcode){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        typeOnElement("#passcode1", passcode);
        takeScreenShot();
    }
    @Test ( enabled = false)
    //checks if the check-box is selectable and takes a screenShot
    public void saveOnlineIdCheckBox (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        si.saveOnlineIDCheckBoxWebElement.click();
        takeScreenShot();
    }
    @Parameters({"forgotOnlineIdUrl"})
    @Test ( enabled = false )
    //checks if the forgot password takes user to the proper page
    public void forgotIdPasscodeFunctionality(String forgotOnlineIdUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        driver.navigate().to(forgotOnlineIdUrl);
        String forgotOnlineIdPageTitledriver = driver.getTitle();
        driver.navigate().back();
        si.forgotIdPasscodeWebElement.click();
        Assert.assertEquals(driver.getTitle(), forgotOnlineIdPageTitledriver);
    }
    @Test ( enabled = false )
    public void securityNHelpFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        si.securityHelpWebElement.click();
        isPopUpWindowDisplayed(driver, ".spa-dialog" );
    }
    @Parameters({"enrollUrl"})
    @Test ( enabled = false )
    public void enrollFunctionality(String enrollUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        driver.navigate().to(enrollUrl);
        String enrollTitledriver = driver.getTitle();
        driver.navigate().back();
        si.enrollWebElement.click();
        Assert.assertEquals(driver.getTitle(), enrollTitledriver);
    }
    @Parameters({"openAccUrl"})
    @Test ( enabled = false )
    //checks if the open account takes user to the account opening page
    public void openAccFunctionality(String openAccUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        driver.navigate().to(openAccUrl);
        String openAccTitledriver = driver.getTitle();
        driver.navigate().back();
        si.openAnAccountWebElement.click();
        Assert.assertEquals(driver.getTitle(), openAccTitledriver);
    }
    @Parameters({"onlineID", "passcode", "forgotOnlineIdUrl"})
    @Test (enabled = false)
    //checks if the application takes the user to the forgotId/Passcode page on wrong onlineID and passcode values.
    public void signInNegativeTest(String onlineID, String passcode, String forgotOnlineIdUrl){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        typeOnElement("#onlineId1", onlineID);
        typeOnElement("#passcode1", passcode);
        si.signInButtonWebElement.click();
        WebElement help = driver.findElement(By.cssSelector("div.fsd-ll-skin:nth-child(1) > h2:nth-child(1)"));
        Assert.assertEquals(help.isDisplayed(), true);
    }
}

