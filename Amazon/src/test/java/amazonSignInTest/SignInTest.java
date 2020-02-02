package amazonSignInTest;

import amazonSignIn.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void userCanSignIn() {
        SignInPage hm = PageFactory.initElements(driver, SignInPage.class);
        hm.signIn("samshopping27@gmail.com", "sam1ocked");
    }
}
