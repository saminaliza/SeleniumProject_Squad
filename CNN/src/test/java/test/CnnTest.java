package test;


import CnnPageTest.CnnHomePage;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class CnnTest extends CommonAPI {


    @Test
    public void goToSubNews() throws InterruptedException {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.signUpNewsletterButton("abc123@gmail.com");
        Thread.sleep(5000);
    }

    @Test
    public void testCnnLogo() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.checkLogoButton();
        String actualURL = "https://www.cnn.com/";
        String expectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectedURL);
    }

    @Test
    public void useTheSearchBox() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.searchClick("epidemic");
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
    public void testIfCnnLogoClicks() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.checkLogoButton();
        String actualURL = "https://www.cnn.com/";
        String expectectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectectedURL);
    }

    @Test
    public void searchInSearchBox() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.searchClick("new york city");

    }

    @Test
    public void goOpinionPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getOpinionWebElement();
    }

    @Test
    public void goHealthPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getHealthWebElement();
    }

    @Test
    public void goMenu() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.clickMenu();
    }


    @Test
    public void test1USlink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"footer-nav-container\"]/div[1]/div/form/button/div[1]"));
        Thread.sleep(5000);
    }

    @Test
    public void testSearchlink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[2]/a"));
        Thread.sleep(5000);

    }

    @Test
    public void testLogolink() throws Exception {
        //driver.findElement(By.cssSelector("#logo")) ;
        Thread.sleep(5000);
    }

    @Test
    public void testWorldlink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"nav\"]/div[2]/div[2]/a[2]"));
        Thread.sleep(5000);
    }

    @Test
    public void testHealthLink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[6]/a"));
        Thread.sleep(5000);
    }

    @Test
    public void testTravelLink() throws Exception {
        driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[9]/a"));
        Thread.sleep(5000);
    }

    @Test
    public void testLiveTvLink() throws Exception {
        // driver.findElements(By.cssSelector("#nav-mobileTV"));
        Thread.sleep(5000);
    }

    @Test
    public void useSearchBox() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.searchClick("weather");
    }

    @Test
    public void goTolink() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        driver.manage().window().maximize();
        aw.getSportsWebElement();

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
    public void testFollowTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.followCnn();
    }


    @Test
    public void testInvokeCNNPage() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.invokeCNN();

    }

    @Test
    public void TestClickSearchIcon() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.searchAmericaPage();

    }

    @Test
    public void testIfItClicks() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getHealthWebElement();
    }

    @Test
    public void testToWorldPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.worldNews();
    }

    @Test
    public void testOpinionPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getOpinionWebElement();
    }

    @Test
    public void testHealthPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getHealthWebElement();
    }

    @Test
    public void testMenu() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.clickMenu();
    }


    @Test
    public void TestMedia() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.clickMedia();
    }

    @Test
    public void testOpinion() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnOpinionTab();
    }

    @Test
    public void testHealth() {
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
    public void tryOpinionTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnOpinionTab();
    }

    @Test
    public void tryHealthTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnHealthTab();
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
    public void testSearchAmerica() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.usNews();

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
    public void testHealthButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getHealthWebElement();
    }

    @Test
    public void testEntertainmentButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.EntertainButton();
    }

    @Test
    public void testStyleButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.EntertainButton();
    }

    @Test
    public void changeLangTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.changeLanguage();
    }

    @Test
    public void testTravelButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.TravelButton();
    }

    @Test
    public void TestAllCNNButton() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.AllCNNButton();
    }

    @Test
    public void randomText() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.randomText();
    }

    @Test
    public void testHealthsTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getHealthWebElement();
    }

    @Test
    public void tesTravelTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getTravelWebElement();
    }

    @Test
    public void tesSportsTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getSportsWebElement();
    }

    @Test
    public void tesStyleTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getStyleWebElement();
    }

    @Test
    public void testCnnTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getcnnWebElement();
    }

    @Test
    public void goToSubscribeNews() throws InterruptedException {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.signUpNewsletterButton("abc123@gmail.com");
        Thread.sleep(5000);
    }

    @Test
    public void goTCnnLogo() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.checkLogoButton();
        String actualURL = "https://www.cnn.com/";
        String expectectedURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL, expectectedURL);
    }

    @Test
    public void searchBox() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.searchClick("donald trump");
    }

    @Test
    public void clickToUsNews() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        driver.manage().window().maximize();
        aw.usNews();
    }

    @Test
    public void getHomePageTitle() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        Assert.assertEquals(driver.getTitle(), "CNN - Breaking News, Latest News and Videos");
    }


    @Test
    public void clickGoToWorldPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.worldNews();
    }

    @Test
    public void clickOpinionPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getOpinionWebElement();
    }

    @Test
    public void clickHealthPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.getHealthWebElement();
    }


    @Test
    public void testVideosTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.clickOnVideoTab();
    }

    @Test
    public void testPhotosTab() {
        CnnHomePage hp = PageFactory.initElements(driver, CnnHomePage.class);
        hp.getVideosWebElement();
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
        List<String> news = new ArrayList<>();
        news.add("iphone");
        news.add("kobe");
        news.add("ny");
        for (String item : news) {
            aw.searchItem(item);
            System.out.println(item);
        }
        return;
    }

    @Test
    public void clickBusPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.useBusPage();
    }


    @Test
    public void clickLogoButton() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.checkLogoButton();
    }

    @Test
    public void clickVideosTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnOpinionTab();
    }

    @Test
    public void clickTestMarketsTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnHealthTab();
    }

    @Test
    public void ClickTestEnterTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnEntertainmentTab();

    }

    @Test
    public void clickNSearchTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.searchThenClick("weather");

    }

    @Test
    public void searchGames() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchGames();
    }

    @Test
    public void searchUsa() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchUsa();

    }

    @Test
    public void searchKobe() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchKobeBryant();
    }

    @Test
    public void searchBK() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchBrooklyn();
    }

    @Test
    public void searchNY() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchNewYork();
    }

    @Test
    public void searchQns() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchQueens();

    }

    @Test
    public void searchMan() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchManhattan();
    }

    @Test
    public void searchSI() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchStatenIsland();

    }

    @Test
    public void signUpforSubNews() throws InterruptedException {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.signUpNewsletterButton("abc@gmail.com");
        Thread.sleep(5000);
    }

    @Test
    public void searchFootball() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchFootball();
    }

    @Test
    public void searchBasketball() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchBasketball();
    }

    @Test
    public void searchCricket() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchCricket();
    }

    @Test
    public void searchHockey() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchHockey();
    }

    @Test
    public void searchRugby() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchRugby();
    }

    @Test
    public void searcLacrosse() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchLacrosse();
    }

    @Test
    public void searchSoccer() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchSoccer();
    }

    @Test
    public void searchPoker() {
        CnnHomePage Search = PageFactory.initElements(driver, CnnHomePage.class);
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Search.searchPoker();

    }
}