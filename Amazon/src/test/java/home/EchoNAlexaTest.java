package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EchoNAlexaTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToEchoOptionsAndNavigateBackToHamburgerOptions() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.navigateBackToHamburgerOptions();
    }
    @Test
    public void testUserCanNavigateToEchoShow5Page() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickEchoShow5();
    }
    @Test
    public void testUserCanNavigateToEchoShow8Page() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickEchoShow8();
    }
    @Test
    public void testUserCanNavigateToEchoShowPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoShow();
    }
    @Test
    public void testUserCanNavigateToEchoFlexPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoFlex();
    }
    @Test
    public void testUserCanNavigateToEchoDotPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoDot();
    }
    @Test
    public void testUserCanNavigateToAmazonSmartPlugPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnAmazonSmartPlug();
    }
    @Test
    public void testUserCanNavigateToAmazonSmartOvenPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnAmazonSmartOven();
    }
    @Test
    public void testUserCanNavigateToEchoGlowPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoGlow();
    }
    @Test
    public void testUserCanNavigateToAllSmartHomeDevicesPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnAllSmartHomeDevices();
    }
    @Test
    public void testUserCanNavigateToMeetAlexaPage() throws Exception {
        EchoNAlexaPage echoNAlexaUse= PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnMeetAlexa();
    }
}
