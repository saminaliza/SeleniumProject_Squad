package searchBar;

import base.CommonAPI;
import homepage.BoaHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;
import searchBoxHome.SearchBox;

import java.io.IOException;
import java.sql.SQLException;

public class searchBarFunctionality extends CommonAPI{

    @Test ( enabled=false )
    //Checks if the suggestions window pops-up on clicking the text field.
    public void searchBarTextFieldClickFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.helpSearchBarWebElement.click();
        isPopUpWindowDisplayed(driver, ".search-container");
    }
    @Parameters({"searchBarValue"})
    @Test ( enabled=false )
    //Checks if the help search bar takes in values and displays the suggestions in a pop-up window
    public void helpSearchBarFunctionality(String searchBarValue){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        typeOnElement("#nav-search-query", searchBarValue);
        clickOnElement(".submit");
        isPopUpWindowDisplayed(driver, ".search-container");
    }
   @Parameters({"searchBarValue2", "searchBarValue3", "searchBarValue4", "searchBarValue"})
    @Test ( enabled=false )
   //Checks if the search bar popup suggestion box dynamically picks up searched values one after the other.
    public void helpSearchBarRepetitiveSearches(String searchBarValue2, String searchBarValue3, String searchBarValue, String searchBarValue4) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
       BoaHomePage.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", searchBarValue2);
        sleepFor(2);
        clearInput("#nav-search-query");
       BoaHomePage.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", searchBarValue3);
        sleepFor(2);
        clearInput("#nav-search-query");
       BoaHomePage.helpSearchBarWebElement.click();
        typeOnElement("#nav-search-query", searchBarValue4);
        sleepFor(2);
         clearInput("#nav-search-query");
       BoaHomePage.helpSearchBarWebElement.click();
       typeOnElement("#nav-search-query", searchBarValue);
       isPopUpWindowDisplayed(driver, ".search-container");
    }
    @Parameters({"searchBarValue3"})
    @Test ( enabled=false )
    //Checks if the first suggestion takes to a relevant page. Compares searched value to the page-title
    public void searchBarResultRelevance(String searchBarValue3) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue3);
        sleepFor(3);
        waitUntilVisible(By.className("results-heading"));
        clickByXpath("//a[@name='Search Module - Search Results - Result 2']");
        System.out.println(searchBarValue3);
        System.out.println(driver.getTitle() );
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(searchBarValue3.toLowerCase() ) );
    }
    @Parameters({"searchBarValue", "searchPageUrl"})
    @Test ( enabled=false )
    //Checks if the "View all search" text from he popup takes to the actual search page.
    public void searchPageNavigationFromSearchPopUp(String searchBarValue, String searchPageUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        BoaHomePage.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue);
        waitUntilVisible(By.className("results-heading"));
        BoaHomePage.viewAllSearchWebElement.click();
        Assert.assertEquals(getCurrentPageUrl(),searchPageUrl);
        }
        @Parameters({"searchBarValue2", "feedbackPageUrl"})
        @Test ( enabled=false )
        //checks weather a new window for FeedBack appears on clicking the feedback web element.
    public void feedbackWebElementBringsNewWindow(String searchBarValue2, String feedbackPageUrl){
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
            BoaHomePage.helpSearchBarWebElement.click();
            typeOnInputBox("#nav-search-query", searchBarValue2);
            waitUntilVisible(By.className("results-heading"));
            BoaHomePage.feedbackWebElement.click();
            handleNewTab(driver);
            Assert.assertEquals(driver.getCurrentUrl(), feedbackPageUrl);
        }

    @Test ( enabled=false )
    //checks if the search box takes in values from the data source
    public void searchItems() throws Exception {
        // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchBox sb = PageFactory.initElements(driver, SearchBox.class);
        sb.clearTypeNClickOnSearch();
    }

    @Test ( enabled=false )
    //Takes in values from sql database and puts them on the search bar.
    public void searchFromDataBaseSql() throws Exception {
        SearchBox sb = PageFactory.initElements(driver, SearchBox.class);
        sb.searchItemsAndSubmit();
    }


    }




