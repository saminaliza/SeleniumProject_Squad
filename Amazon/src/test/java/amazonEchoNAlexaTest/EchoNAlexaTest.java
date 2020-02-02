package amazonEchoNAlexaTest;

import amazonEchoNAlexa.EchoNAlexaPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EchoNAlexaTest extends CommonAPI {
    @Test
    public void userCanNavigateToEchoOptionsAndNavigateBackToHamburgerOptionsTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.navigateBackToHamburgerOptions();
    }

    @Test
    public void userCanNavigateToEchoShow5PageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickEchoShow5();
    }

    @Test
    public void userCanNavigateToEchoShow8PageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickEchoShow8();
    }

    @Test
    public void userCanNavigateToEchoShowPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoShow();
    }

    @Test
    public void userCanNavigateToEchoFlexPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoFlex();
    }

    @Test
    public void userCanNavigateToEchoDotPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoDot();
    }

    @Test
    public void userCanNavigateToAmazonSmartPlugPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnAmazonSmartPlug();
    }

    @Test
    public void userCanNavigateToAmazonSmartOvenPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnAmazonSmartOven();
    }

    @Test
    public void userCanNavigateToEchoGlowPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnEchoGlow();
    }

    @Test
    public void userCanNavigateToAllSmartHomeDevicesPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnAllSmartHomeDevices();
    }

    @Test
    public void userCanNavigateToMeetAlexaPageTest() throws Exception {
        EchoNAlexaPage echoNAlexaUse = PageFactory.initElements(driver, EchoNAlexaPage.class);
        echoNAlexaUse.clickOnMeetAlexa();
    }
}
