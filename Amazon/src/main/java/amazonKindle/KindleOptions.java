package amazonKindle;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KindleOptions extends CommonAPI {

    @FindBy(id = "nav-hamburger-menu")
    WebElement hamburgerIcon;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[34]/li[7]/a")
    WebElement kindleBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[1]/a")
    WebElement mainMenuBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[3]/a")
    WebElement allKindleKidsEdBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[4]/a")
    WebElement kindleOptionBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[5]/a")
    WebElement kindlePprWhiteBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[11]/a")
    WebElement kindleBookBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[12]/a")
    WebElement magazinesBtn;

    @FindBy(xpath = "//*[@id=\"hmenu-content\"]/ul[6]/li[13]/a")
    WebElement newsPapersBtn;

    public void navigateBackToHamburgerOptions() {
        hamburgerIcon.click();
        kindleBtn.click();
        mainMenuBtn.click();
    }

    public void allKidsKindleEdition() {
        hamburgerIcon.click();
        kindleBtn.click();
        allKindleKidsEdBtn.click();
    }

    public void clickKindleOption() {
        hamburgerIcon.click();
        kindleBtn.click();
        kindleOptionBtn.click();
    }

    public void clickKindlePaperWhiteOption() {
        hamburgerIcon.click();
        kindleBtn.click();
        kindlePprWhiteBtn.click();
    }

    public void clickKindleBookOption() {
        hamburgerIcon.click();
        kindleBtn.click();
        kindleBookBtn.click();
    }

    public void clickMagazinesOption() {
        hamburgerIcon.click();
        kindleBtn.click();
        magazinesBtn.click();
    }

    public void clickNewsPapersOption() {
        hamburgerIcon.click();
        kindleBtn.click();
        newsPapersBtn.click();
    }
}
