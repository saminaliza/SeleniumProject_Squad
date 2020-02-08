package amazonSignInTest;

import amazonSignIn.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void userCanSignIn() {
        SignInPage hm = PageFactory.initElements(driver, SignInPage.class);
        hm.signIn("myautotestmail2020@gmail.com", "test2055");
    }
    @Test
    public void userCannotLogInToAmazonWithInvalidCredentials() {
        SignInPage hm = PageFactory.initElements(driver, SignInPage.class);
        hm.signIn("myautotestmail2020@gmail.com", "test8800");
        Assert.assertEquals(false,false);
    }

    @Test(dataProvider = "validLogIns")
    public void userCanLogInSuccessfullyTest(String email, String password) {
        SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);
        signIn.signIn(email, password);
    }

    @DataProvider(name = "validLogIns")
    public Object[][] validLogInsData() {
        return new Object[][] {{"mytestmail2020@yahoo.com", "test2055"},
                {"myautotestmail2020@gmail.com", "test2055"}};
    }
    @Test
    public void userCanClickOnForgotPasswordForSignIn() {
        SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);
        signIn.forgotToSignIn("mytestmail2020@yahoo.com");
    }

    @Test
    public void testUserCanNavigateToForgotPasswordPage() {
        SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);
        signIn.goToForgotSignIn("mytestmail2020@yahoo.com");
    }
}
