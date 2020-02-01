package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EchoNAlexaUseTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToEchoOptionsAndNavigateBackToHamburgerOptions() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.navigateBackToHamburgerOptions();
    }
    @Test
    public void testUserCanNavigateToEchoShow5Page() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickEchoShow5();
    }
    @Test
    public void testUserCanNavigateToEchoShow8Page() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickEchoShow8();
    }
    @Test
    public void testUserCanNavigateToEchoShowPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnEchoShow();
    }
    @Test
    public void testUserCanNavigateToEchoFlexPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnEchoFlex();
    }
    @Test
    public void testUserCanNavigateToEchoDotPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnEchoDot();
    }
    @Test
    public void testUserCanNavigateToAmazonSmartPlugPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnAmazonSmartPlug();
    }
    @Test
    public void testUserCanNavigateToAmazonSmartOvenPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnAmazonSmartOven();
    }
    @Test
    public void testUserCanNavigateToEchoGlowPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnEchoGlow();
    }
    @Test
    public void testUserCanNavigateToAllSmartHomeDevicesPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnAllSmartHomeDevices();
    }
    @Test
    public void testUserCanNavigateToMeetAlexaPage() throws Exception {
        EchoNAlexaUse echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaUse.class);
        echoNAlexaUse.clickOnMeetAlexa();
    }
}
