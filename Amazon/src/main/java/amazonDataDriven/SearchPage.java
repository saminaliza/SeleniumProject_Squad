package amazonDataDriven;

import base.CommonAPI;
import datasuply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.sql.SQLException;
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

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = DataSource.getItemsListFromDB();
        for (int i = 0; i < list.size(); i++) {
            typeItemName(list.get(i));
            clickOnSearch();
            clearInputBox();
        }
    }

}
