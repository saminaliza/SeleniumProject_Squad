package browserstack;

import CnnPageTest.CnnHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
/*
import test.CnnTest;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrowserStackTest extends CnnHomePage {

    public static final String USERNAME = "abdulbhuiya1";
    public static final String AUTOMATE_KEY = "8CSWxiodgQC4xXmzqgSK";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    public static void main(String[] args) throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browser", "Chrome");
        caps.setCapability("browser_version", "80.0 beta");
        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "8.1");
        caps.setCapability("resolution", "1024x768");
        caps.setCapability("name", "Bstack-[Java] Sample Test");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.cnn.com");
        WebElement element = driver.findElement(By.name("q"));
    }
    @Test
    public void goToSubNews() throws InterruptedException {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.signUpNewsletterButton("abc123@gmail.com");
        Thread.sleep(5000);
    }


    @Test
    public void useTheSearchBox() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.searchClick("iphone");
    }

    @Test
    public void goToUsNews() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        driver.manage().window().maximize();
        aw.usNews();
    }

    @Test
    public void cnnHomePageTitle() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        Assert.assertEquals(driver.getTitle(), "CNN - Breaking News, Latest News and Videos");
    }


    @Test
    public void goToWorldPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.worldNews();
    }
    @Test
    public void goOpinionPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getOpinionWebElement();
    }
    @Test
    public void goHealthPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getHealthWebElement();}

    @Test
    public void test1USlink()throws Exception {
        driver.findElement(By.xpath("//*[@id=\"footer-nav-container\"]/div[1]/div/form/button/div[1]"));
        Thread.sleep(5000);
    }
    @Test
    public void testSearchlink() throws Exception{
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[2]/a"));
        Thread.sleep(5000);

    }
    @Test
    public void testLogolink()throws Exception{
        //driver.findElement(By.cssSelector("#logo")) ;
        Thread.sleep(5000);
    }
    @Test
    public void testWorldlink()throws Exception {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[2]"));
        Thread.sleep(5000);
    }
    @Test
    public void testHealthLink() throws Exception{
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[6]/a"));
        Thread.sleep(5000);
    }
    @Test
    public void testTravelLink() throws Exception{
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[9]/a"));
        Thread.sleep(5000);
    }
    @Test
    public void testLiveTvLink()throws Exception{
        // driver.findElements(By.cssSelector("#nav-mobileTV"));
        Thread.sleep(5000);
    }


    @Test
    public void clickOnLiveTv() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.liveTvOptions();
    }


    @Test
    public void goToBusPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.useBusPage();
    }


    @Test
    public void checkLogoButton() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.checkLogoButton();
    }

    @Test
    public void opinionTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnOpinionTab();
    }

    @Test
    public void testHealthTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnHealthTab();
    }

    @Test
    public void testEntertainmentTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnEntertainmentTab();
    }


    @Test
    public void TestInvokeCNNPage() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.InvokeCNN();

    }

    @Test
    public void TestClickSearchIcon() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.Clicksearch_icon();
    }

    @Test
    public void TestExitSearchBut() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        //  hp.Exitsearch_icon();
    }

    @Test
    public void TestMedia() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.clickMedia();
    }

    @Test
    public void testopinion() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnOpinionTab();
    }

    @Test
    public void testhealth() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnHealthTab();
    }

    @Test
    public void testEntertainment() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnEntertainmentTab();
    }

    @Test
    public void testStyle() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnStyleTab();
    }

    @Test
    public void testTravel() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnTravelTab();
    }

    @Test
    public void testSports() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnSportsTab();
    }

    @Test
    public void testVideo() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnVideoTab();
    }

    @Test
    public void TestSearchAmerica() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.searchAmericaPage();
    }

    @Test
    public void styleTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnStyleTab();
    }

    @Test
    public void travelTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnTravelTab();
    }

    @Test
    public void testScrollRight() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.scrollRight();
    }

    @Test
    public void TestHealthButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.HealthButton();
    }

    @Test
    public void TestEntertainmentButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.EntertainButton();
    }

    @Test
    public void TestStyleButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.StyleButton();
    }

    @Test
    public void TestTravelButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.TravelButton();
    }

   */
/* @Test
    public void TestAllCNNButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.AllCNNButton();*//*


*/
/*    @Test
    public void randomText() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.randomText();*//*


    @Test
    public void TestStoriesTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.StoriesTab();
    }


    @Test
    public void TestVideosTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.VideosTab();
    }

    @Test
    public void TestPhotosTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.PhotosTab();
    }

    @Test
    public void testScrollLeft() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.scrollLLeft();
    }

    @Test
    public void sportsTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnSportsTab();
    }


    @Test
    public void videoTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnVideoTab();
    }

    @Test
    public void testMultipleItem() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        List<String> items = new ArrayList<>();
        items.add("iphone");
        items.add("kobe");
        items.add("ny");
        for (String item : items) {
            aw.searchItem(item);
            System.out.println(item);
        }





    }
}



*/
