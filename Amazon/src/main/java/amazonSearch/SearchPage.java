package amazonSearch;

import base.CommonAPI;
import datasuply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {

    @FindBy(css = "#twotabsearchtextbox")
    public static WebElement searchInputWebElement;

    @FindBy(css = ".nav-input")
    public static WebElement submitWebElement;

    public static WebElement getSearchInputWebElement() {
        return searchInputWebElement;
    }

    public static WebElement getSubmitWebElement() {
        return submitWebElement;
    }

    public void clearInputBox() {
        getSearchInputWebElement().clear();
    }

    public void typeItemName(String value) {
        getSearchInputWebElement().sendKeys(value);
    }

    public void clickOnSearch() {
        getSubmitWebElement().click();
    }

    public void clearTypeNClickOnSearch() {
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++) {
            clearInputBox();
            typeItemName(list.get(i));
            clickOnSearch();
        }
    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
        }
    }

    public List<String> getItems() {
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("ear buds");
        itemsList.add("iPhone");
        itemsList.add("keyboard");
        itemsList.add("mouse");

        return itemsList;
    }
}
