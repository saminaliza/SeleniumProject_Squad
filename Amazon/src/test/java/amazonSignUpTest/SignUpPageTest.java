package amazonSignUpTest;

import amazonSignUp.SignUpPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignUpPageTest extends CommonAPI {
    @Test
    public void userCanGoToSignUp() {
        SignUpPage signUp = PageFactory.initElements(driver, SignUpPage.class);
        signUp.canGoToSignUpPage();
    }

    @Test
    public void userCanCreateNewAmazonAccount() {
        SignUpPage signUp = PageFactory.initElements(driver, SignUpPage.class);
        signUp.createAccount("John Doe", "myautotestmail2020@gmail.com", "test2055");
    }
}

