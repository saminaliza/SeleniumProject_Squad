package amzonSignInTest;

import amazonHomePageTest.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends CommonAPI {

    @Test
    public void testUserCanClickGoToSignInPage() {
        HomePage hm = PageFactory.initElements(driver, HomePage.class);
        hm.signIn("samshopping27@gmail.com", "sam1ocked");
    }

}
