package amazonEchoNAlexa;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EchoNAlexaPage extends CommonAPI {
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerIcon;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[1]/a")
    WebElement mainMenuBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[34]/li[4]/a")
    WebElement echoNAlexaBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[3]/a")
    WebElement echoShow5Btn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[4]/a")
    WebElement echoShow8Btn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[5]/a")
    WebElement echoShowBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[6]/a")
    WebElement echoFlexBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[7]/a")
    WebElement echoDotBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[19]/a")
    WebElement amazonSmartPlugBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[20]/a")
    WebElement amazonSmrtOvenBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[21]/a")
    WebElement echoGlowBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[22]/a")
    WebElement smartHomeBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[3]/li[26]/a")
    WebElement meetAlexaBtn;
    public void navigateBackToHamburgerOptions()  {
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        mainMenuBtn.click();
    }
    public void clickEchoShow5(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        echoShow5Btn.click();
    }
    public void clickEchoShow8(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        echoShow8Btn.click();
    }
    public void clickOnEchoShow(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        echoShowBtn.click();
    }
    public void clickOnEchoFlex(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        echoFlexBtn.click();
    }
    public void clickOnEchoDot(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        echoDotBtn.click();
    }
    public void clickOnAmazonSmartPlug(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        amazonSmartPlugBtn.click();
    }
    public void clickOnAmazonSmartOven(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        amazonSmrtOvenBtn.click();
    }
    public void clickOnEchoGlow(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        echoGlowBtn.click();
    }
    public void clickOnAllSmartHomeDevices(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        smartHomeBtn.click();
    }
    public void clickOnMeetAlexa(){
        hamburgerIcon.click();
        echoNAlexaBtn.click();
        meetAlexaBtn.click();
    }
}
