package searchBar;

import base.CommonAPI;
import dataSupply.DataSource;
import homepage.BoaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;
import searchBoxHome.SearchBox;

public class searchBarFunctionality extends CommonAPI {

    @Test//(enabled=false)
    //Checks if the suggestions window pops-up on clicking the text field.
    public void searchBarTextFieldClickFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.searchBarPopUp();
    }

    @Parameters({"searchBarValue"})
    @Test//(enabled=false)
    //Checks if the help search bar takes in values and displays the suggestions in a pop-up window
    public void helpSearchBarFunctionality(String searchBarValue) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.searchBarSuggestionWindow(searchBarValue);
    }

    @Parameters({"searchBarValue2", "searchBarValue3", "searchBarValue4", "searchBarValue"})
    @Test//(enabled=false)
    //Checks if the search bar popup suggestion box dynamically picks up searched values one after the other.
    public void helpSearchBarRepetitiveSearches(String searchBarValue2, String searchBarValue3, String searchBarValue, String searchBarValue4) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        DataSource ds = PageFactory.initElements(driver, DataSource.class);
        ds.repetitiveSearches(searchBarValue2, searchBarValue3, searchBarValue4, searchBarValue);
    }

    @Parameters({"searchBarValue2"})
    @Test//(enabled=false)
    //Checks if the first suggestion takes to a relevant page. Compares searched value to the page-title
    public void searchBarResultRelevance(String searchBarValue2) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.searchBarResultCheck(searchBarValue2);
    }

    @Parameters({"searchBarValue", "searchPageUrl"})
    @Test//(enabled=false)
    //Checks if the "View all search" text from he popup takes to the actual search page.
    public void searchPageNavigationFromSearchPopUp(String searchBarValue, String searchPageUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.viewAllSearchPageFromSearchPopUp(searchBarValue,searchPageUrl);
    }

    @Parameters({"searchBarValue2", "feedbackPageUrl"})
    @Test//(enabled=false)
    //checks weather a new window for FeedBack appears on clicking the feedback web element.
    public void feedbackNewWindowAssertion(String searchBarValue2, String feedbackPageUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.feedbackWebElementBringsNewWindow(searchBarValue2,feedbackPageUrl);
    }

    @Test//(enabled=false)
    //checks if the search box takes in values from the data source
    public void searchItems() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        SearchBox sb=PageFactory.initElements(driver, SearchBox.class);
        sb.clearTypeNClickOnSearch();
    }

    @Test//(enabled=false)
    //Takes in values from sql database and puts them on the search bar.
    public void searchFromDataBaseSql() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        SearchBox sb=PageFactory.initElements(driver, SearchBox.class);
        sb.searchItemsAndSubmit();
    }



}




