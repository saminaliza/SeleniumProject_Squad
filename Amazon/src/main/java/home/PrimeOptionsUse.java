package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PrimeOptionsUse extends CommonAPI {
    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerIcon;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[34]/li[2]/a")
    WebElement primeBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[3]/a")
    WebElement prmVideoBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[4]/a")
    WebElement includedWPrimeBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[5]/a")
    WebElement videoChnlsBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[6]/a")
    WebElement rentBuyBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")
    WebElement watchListBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a")
    WebElement videoLibBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[9]/a")
    WebElement watchAnywhereBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[10]/a")
    WebElement getnStrtdBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a")
    WebElement originalsBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[14]/a")
    WebElement kidsBtn;
    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a")
    WebElement nvgtToPrimeBtn;
    @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[1]/a")
    WebElement mainMenuBtn;
    public void navigateBackToHamburgerOptions()  {
        hamburgerIcon.click();
        primeBtn.click();
        mainMenuBtn.click();
    }
    public void clickPrimeVideoOption(){
        hamburgerIcon.click();
        primeBtn.click();
        prmVideoBtn.click();
    }
    public void clickForIncludedWithPrimeOption(){
        hamburgerIcon.click();
        primeBtn.click();
        includedWPrimeBtn.click();
    }
    public void clickForVideoChannelOption(){
        hamburgerIcon.click();
        primeBtn.click();
        videoChnlsBtn.click();
    }
    public void clickForRentOrBuyOption(){
        hamburgerIcon.click();
        primeBtn.click();
        rentBuyBtn.click();
    }
    public void clickForWatchListOption(){
        hamburgerIcon.click();
        primeBtn.click();
        watchListBtn.click();
    }
    public void clickForVideoLibraryOption(){
        hamburgerIcon.click();
        primeBtn.click();
        videoLibBtn.click();
    }
    public void clickForWatchAnyWhereOption(){
        hamburgerIcon.click();
        primeBtn.click();
        watchAnywhereBtn.click();
    }
    public void clickForGettingStartedOption(){
        hamburgerIcon.click();
        primeBtn.click();
        getnStrtdBtn.click();
    }
    public void clickForAmazonOriginalsOption(){
        hamburgerIcon.click();
        primeBtn.click();
        originalsBtn.click();
    }
    public void clickForKidsOption(){
        hamburgerIcon.click();
        primeBtn.click();
        kidsBtn.click();
    }
    public void clickForNavigateToPrimeOption(){
        hamburgerIcon.click();
        primeBtn.click();
        nvgtToPrimeBtn.click();
    }
}
