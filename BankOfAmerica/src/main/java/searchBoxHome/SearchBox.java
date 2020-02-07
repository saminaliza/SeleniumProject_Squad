package searchBoxHome;

import base.CommonAPI;
import dataSupply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.util.List;

public class SearchBox extends CommonAPI {

    @FindBy(xpath="//input[@id='nav-search-query' and @class='search-query']")
    public static WebElement searchInputWebElement;

    @FindBy(css=".submit")
    public static WebElement submitWebElement;

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
        DataSource data =PageFactory.initElements(driver, DataSource.class);
        List<String> list=data.getItems();
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



