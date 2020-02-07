package test;


import CnnHomePageTest.CnnHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void goToPoliticsPage() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.goToPolitics();
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
    public void healthTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnHealthTab();
    }

    @Test
    public void entertainmentTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnEntertainmentTab();
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
    public void sportsTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnSportsTab();
    }

    @Test
    public void videoTab() {
        CnnHomePage cnnHomePage = PageFactory.initElements(driver, CnnHomePage.class);
        cnnHomePage.clickOnVideoTab();
    }



/*
    @Test
    public void TestDropDown() {
        CnnHomePage aw = PageFactory.initElements(driver, CnnHomePage.class);
        aw.useDropDownButton();
    }*/

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
