package test;

import amazonHomePage.SubscribeCnn;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SubscribeTest extends CommonAPI {
    @Test
    public void goToSubNews() {
        SubscribeCnn aw = PageFactory.initElements(driver, SubscribeCnn.class);
        aw.signUpNewsletterButton("abc@yahoo.com");

    }

    @Test
    public void goToCnn() {
        SubscribeCnn aw = PageFactory.initElements(driver, SubscribeCnn.class);
        aw.navigateToCnn();

    }

    @Test
    public void readPrivacy() {
        SubscribeCnn aw = PageFactory.initElements(driver, SubscribeCnn.class);
        aw.goToPrivacy();
    }
}