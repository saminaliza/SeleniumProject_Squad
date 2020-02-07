package signInTests;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import signIn.SignInPage;

public class NegativeTestsSignIn extends CommonAPI{

    @Test
    public void wrongPasswordTest(){
        SignInPage sip =PageFactory.initElements(driver, SignInPage.class);
        sip.wrongPasswordSignIn();
    }

    @Test
    public void capsEmailSignInTest(){
        SignInPage sip =PageFactory.initElements(driver, SignInPage.class);
        sip.capsEmailSignIn();
    }
    @Test
    public void wrongEmailSignInTest(){
        SignInPage sip =PageFactory.initElements(driver, SignInPage.class);
        sip.wrongEmailSignIn();
    }
}
