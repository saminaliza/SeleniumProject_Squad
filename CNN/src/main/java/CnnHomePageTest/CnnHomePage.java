package CnnHomePageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CnnHomePage extends CommonAPI {

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[5]/button[1]/*")
    WebElement searchBox;
    @FindBy(id = "footer-search-bar")
    WebElement searchBox2;
    @FindBy(xpath = "//*[@id=\"footer-nav-container\"]/div[2]/div/div/nav/ul/li[14]/ul/li[6]/a")
    WebElement subscribeButton;
    @FindBy(xpath = "//*[@id=\"footer-nav-container\"]/div[1]/div/form/button/div[1]")
    WebElement usNewsButton;
    @FindBy(xpath = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[2]/a")
    WebElement worldNewsButton;
    @FindBy(name = "politics")
    WebElement politicsButton;
    @FindBy(xpath = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[4]/a/span")
    WebElement tvMenu;
    @FindBy(xpath = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[4]/a/span")
    WebElement busButton;
    @FindBy(xpath = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[4]/a")
    WebElement logoButton;
    @FindBy(xpath = "//*[@class='menu-icon']")
    WebElement dropDownButton;
    @FindBy(id = "header-search-bar")
    WebElement searchButton2;
    @FindBy(xpath = "//*[@id=\"header-nav-container\"]/div/div[2]/div/div[1]/form/button/div[1]")
    WebElement searchButton3;
    @FindBy(id = "subEmail")
    WebElement emailField;
    @FindBy(xpath = "/html/body/div[6]/section[1]/div[4]/div[1]/div/button/span")
    WebElement subButton;
    //-----------------------------------------------------------------------------------------------------
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a")
    WebElement opinionWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[6]/a")
    WebElement healthWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[7]/a")
    WebElement entertainmentWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[8]/a")
    WebElement styleWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[9]/a")
    WebElement travelWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[10]/a")
    WebElement sportsWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[11]/a")
    WebElement videosWebElement;

    public void navigateToCnn() {
        driver.get("https://www.cnn.com/");
    }

    public void searchClick(String itemName)  {
        this.navigateToCnn();
        searchBox.click();
        searchButton2.sendKeys(itemName);
        searchButton3.click();

    }

    public void usNews() {
        usNewsButton.click();

    }

    public void worldNews() {
        worldNewsButton.click();
    }

    public void goToPolitics() {
        politicsButton.click();
    }

    public void liveTvOptions() {
        tvMenu.click();

    }

    public void useBusPage() {
        busButton.click();
    }

    public void checkLogoButton() {
        logoButton.click();
    }


    public void searchItem(String item) {
        searchBox2.sendKeys(item, Keys.ENTER);
        searchBox2.clear();

    }
    public void signUpNewsletterButton(String email) {
        subscribeButton.click();
        emailField.sendKeys(email);
        subButton.click();


}
    public  void getOpinionWebElement() {
        opinionWebElement.click();
    }

    public void getHealthWebElement() {
        healthWebElement.click();
    }

    public void getEntertainmentWebElement() {
        entertainmentWebElement.click();
    }

    public void getStyleWebElement() {
        styleWebElement.click();
    }

    public void getTravelWebElement() {
        travelWebElement.click();
    }

    public void getSportsWebElement() {
        sportsWebElement.click();
    }

    public void getVideosWebElement() {
        videosWebElement.click();
    }

    public void clickOnOpinionTab() {
        opinionWebElement.click();
    }

    public void clickOnHealthTab() {
        healthWebElement.click();
    }

    public void clickOnEntertainmentTab() {
        entertainmentWebElement.click();
    }

    public void clickOnStyleTab() {
       styleWebElement.click();
    }

    public void clickOnTravelTab() {
        travelWebElement.click();
    }

    public void clickOnSportsTab() {
        sportsWebElement.click();
    }

    public void clickOnVideoTab() {
        videosWebElement.click();
    }
    public void InvokeCNN() {
        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize(); // comment
    }

    public void Clicksearch_icon() {
        driver.findElement(By.className("search-icon")).click();
    }

    public void Exitsearch_icon() {
        driver.findElement(By.className("close-icon")).click();
    }

    public void clickMedia() {
        driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-0 cn-container_0338BCBB-" +
                "776B-F168-D79B-ED35F5FB6488']//a//img[@class='media__image media__image--responsive']")).click();
    }

    public void searchAmerica() {
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("Kobe");
        driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']")).click();
    }
}

