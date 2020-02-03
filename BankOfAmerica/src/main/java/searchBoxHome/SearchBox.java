package searchBoxHome;

import base.CommonAPI;
import dataSupply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class SearchBox extends CommonAPI {

    @FindBy(xpath="//input[@id='nav-search-query' and @class='search-query']")
    public static WebElement searchInputWebElement;

    @FindBy(css=".submit")
    public static WebElement submitWebElement;


    public List<String> getItems() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> itemsList=new ArrayList<String>();
        itemsList.add("debit card");
        itemsList.add("fixed deposit");
        itemsList.add("short term loan");
        itemsList.add("home loan");
        itemsList.add("travellers card");
        itemsList.add("cash deposit");

        return itemsList;
    }

    public void typeItemName(String value) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName() + ": " + value));
        getSearchInputWebElement().sendKeys(value);
    }

    public WebElement getSearchInputWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return searchInputWebElement;
    }

    public void clickOnSearch() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSubmitWebElement().click();
    }

    public WebElement getSubmitWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        return submitWebElement;
    }

    public void clearInputBox() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearchInputWebElement().clear();
    }

    public void clearTypeNClickOnSearch() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list=getItems();
        for (int i=0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
        }
    }

        public void searchItemsAndSubmit() throws Exception {
           // TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
            List<String> list2=DataSource.getItemsListFromDB();

            for (int i=0; i < list2.size(); i++) {
                typeItemName(list2.get(i));
                clickOnSearch();
                clearInputBox();
            }
        }

    }



