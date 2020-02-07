package signInPanel;

import base.CommonAPI;
import homepage.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class negativeSignIn extends CommonAPI{

    @Parameters({"onlineID"})
    @Test //( enabled = false)
    // checks if the onlineId text box takes in values
    public void onlineIdTextBoxFunctionality(String onlineID){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
    SignIn si = PageFactory.initElements(driver, SignIn.class);
    si.onlineIdTextBoxInput(onlineID);
    }
    @Parameters({"passcode"})
    @Test //( enabled = false)
    // checks if the passcode text box takes in values
    public void passcodeTextBoxFunctionality(String passcode){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
       si.passcodeTextBoxInput(passcode);
    }
    @Test// ( enabled = false)
    //checks if the check-box is selectable and takes a screenShot
    public void saveOnlineIdCheckBox (){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        si.saveOnlineIdCheckBoxSelect();
    }
    @Parameters({"forgotOnlineIdUrl"})
    @Test //( enabled = false )
    //checks if the forgot password takes user to the proper page
    public void forgotIdPasscodeFunctionality(String forgotOnlineIdUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
       si.forgotIdPasscodeClick(forgotOnlineIdUrl);
    }
    @Test// ( enabled = false )
    public void securityNHelpFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        si.securityNHelpClick();
    }
    @Parameters({"enrollUrl"})
    @Test //( enabled = false )
    public void enrollFunctionality(String enrollUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
      si.enrollClick(enrollUrl);
    }
    @Parameters({"openAccUrl"})
    @Test //( enabled = false )
    //checks if the open account takes user to the account opening page
    public void openAccFunctionality(String openAccUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
        si.openAccClick(openAccUrl);
    }
    @Parameters({"onlineID", "passcode", "forgotOnlineIdUrl"})
    @Test //(enabled = false)
    //checks if the application takes the user to the forgotId/Passcode page on wrong onlineID and passcode values.
    public void signInNegativeTestAssert(String onlineID, String passcode, String forgotOnlineIdUrl){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName() ));
        SignIn si = PageFactory.initElements(driver, SignIn.class);
      si.signInNegativeTest(onlineID, passcode, forgotOnlineIdUrl);
    }
}

