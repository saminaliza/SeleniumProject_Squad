package CnnPageTest;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.Random;

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
    @FindBy(xpath = "//*[@id=\"footer-nav-container\"]/div[4]/div/div/div[2]/div/ul/li[1]/a/svg")
    WebElement followButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[5]/a")
    WebElement opinionWebElement;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='health'][contains(text(),'Health')]")
    WebElement healthWebElement;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='entertainment'][contains(text(),'Entertainment')]")
    WebElement entertainmentWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[8]/a")
    WebElement styleWebElement;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='travel'][contains(text(),'Travel')]")
    WebElement travelWebElement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[10]/a")
    WebElement sportsWebElement;

    @FindBy(how = How.XPATH, using = "//li[@class='nav-linksstyles__SectionTitle-sc-1tike8v-3 hNYoQv']//a[@name='videos'][contains(text(),'Videos')]")
    WebElement videosWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[4]/a/span")
    WebElement liveTvWebElement;
    @FindBy(how = How.XPATH, using = "//*[@id=\"edition-picker-toggle-desktop\"]/svg")
    WebElement editionDropDown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"edition-picker-desktop\"]/div[2]/ul/li[3]/a")
    WebElement chooseArabicDropDown;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/button/svg")
    WebElement menuBar;
    @FindBy(how = How.XPATH, using = "//*[@id=\"header-nav-container\"]/div/div[1]/div/div[1]/a/svg/path")
    WebElement cnnLogo;
    @FindBy(how = How.XPATH, using = "//*[@id=\"footer-nav-container\"]/div[1]/div/form/button/div[3]/svg")
    WebElement submitBut;

    public void navigateToCnn() {
        driver.get("https://www.cnn.com/");
    }

    public void searchClick(String NewsName) {
        this.navigateToCnn();
        searchBox.click();
        searchButton2.sendKeys(NewsName);
        searchButton3.click();

    }

    public void usNews() {
        usNewsButton.click();

    }

    public void followCnn() {
        followButton.click();
    }

    public void worldNews() {
        worldNewsButton.click();
    }

    public void clickMenu() {
        menuBar.click();
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


    public void searchItem(String news) {
        searchBox2.sendKeys(news, Keys.ENTER);
        searchBox2.clear();

    }

    public void signNewsletterButton(String email) {
        subscribeButton.click();
        emailField.sendKeys(email);
        subButton.click();


    }

    public void getOpinionWebElement() {
        opinionWebElement.click();
    }

    public void getHealthWebElement() {
        healthWebElement.click();
    }

    public void getcnnWebElement() {
        logoButton.click();
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

    public void HealthButton() {
        driver.findElement(By.xpath("//li[7]//label[1]")).click();
    }

    public void EntertainButton() {
        driver.findElement(By.xpath("//li[8]//label[1]")).click();
    }

    public void StyleButton() {
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[8]/a")).click();
    }

    public void signUpNewsletterButton(String email) {
        subscribeButton.click();
        emailField.sendKeys(email);
        subButton.click();

    }

    public void TravelButton() {
        driver.findElement(By.xpath("//label[contains(text(),'Travel')]")).click();
    }

    public void AllCNNButton() {
        //driver.findElement(By.xpath("//label[contains(text(),'All CNN')]")).click();
    }

    public void StoriesTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Stories')]")).click();
    }

    public void VideosTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Videos')]")).click();
    }

    public void PhotosTab() {
        driver.findElement(By.xpath("//label[contains(text(),'Photos')]")).click();
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

    public void invokeCNN() {
        driver.get("https://www.cnn.com/");
        driver.manage().window().maximize(); // comment
    }

    public void clicksearch_icon(String news) {
        searchItem(news);
    }

    public void exitsearch_icon() {
        driver.findElement(By.className("close-icon")).click();
    }

    public void clickMedia() {
        liveTvWebElement.click();
    }

    public void searchAmericaPage() {
        driver.findElement(By.className("search-icon")).click();
        driver.findElement(By.xpath("//input[@id='header-search-bar']")).sendKeys("Kobe");
        driver.findElement(By.xpath("//div[@class='Box-sc-1fet97o-0 iKQPmQ']//button[@class='Flex-sc-1sqrs56-0 search-barstyles__Button-yoe3fw-2 kxpkSG']")).click();
    }

    public void scrollRight() {
        driver.findElement(By.className("owl-next")).click();
        driver.findElement(By.className("owl-next")).click();
        driver.findElement(By.className("owl-next")).click();
    }

    public String randomText() {

        String[] words = new String[11];
        words[0] = "politics";
        words[1] = "money";
        words[2] = "new york";
        words[3] = "world";
        words[4] = "economy";


        String text = "";
        Random random = new Random();
        int randomText = random.nextInt(4) + 1;
        for (int i = 0; i < words.length; i++) {
            text = words[randomText];
            randomText = random.nextInt(4) + 1;
        }
        return text;
    }

    public void scrollLLeft() {
        driver.findElement(By.className("owl-prev")).click();
        driver.findElement(By.className("owl-prev")).click();
        driver.findElement(By.className("owl-prev")).click();

    }

    public void changeLanguage() {
        changeLanguage();
        editionDropDown.click();
        chooseArabicDropDown.click();

    }

    public void searchThenClick(String newsName) {
        searchBox.sendKeys(newsName);
        subButton.click();
    }

    public void searchGames() {
        searchBox2.sendKeys("games");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?q=games";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchUsa() {
        searchBox2.sendKeys("usa");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=usa";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchKobeBryant() {
        searchBox2.sendKeys("kobe Bryant");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=kobe%20bryant";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchBrooklyn() {
        searchBox2.sendKeys("Brooklyn");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=brooklyn";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchNewYork() {
        searchBox2.sendKeys("new york");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=new%20york";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchQueens() {
        searchBox2.sendKeys("queens");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=queens";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }

    public void searchManhattan() {
        searchBox2.sendKeys("manhattan");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=manhattan";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    public void searchStatenIsland() {
        searchBox2.sendKeys("staten island");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=statenisland";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    public void searchFootball() {
        searchBox2.sendKeys("football");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=football";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchBasketball() {
        searchBox2.sendKeys("basketball");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=basketball";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchSoccer() {
        searchBox2.sendKeys("soccer");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=soccer";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchCricket() {
        searchBox2.sendKeys("cricket");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=cricket";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchHockey() {
        searchBox2.sendKeys("hockey");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=hockey";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);


    }

    public void searchPoker() {
        searchBox2.sendKeys("poker");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=poker";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchRugby() {
        searchBox2.sendKeys("rugby");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=rugby";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    public void searchLacrosse() {
        searchBox2.sendKeys("lacrosse");
        submitBut.click();
        String expectedUrl = "https://www.cnn.com/search?size=10&q=lacrosse";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
}