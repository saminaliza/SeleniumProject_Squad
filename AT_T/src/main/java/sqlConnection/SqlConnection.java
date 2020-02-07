package sqlConnection;

import base.CommonAPI;
import dataSupply.DataSource;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

public class SqlConnection extends CommonAPI {

    @FindBy(how = How.XPATH,using="//input[@id='z1-searchfield']")
    public static WebElement searchInputWebElement;

    @FindBy(how = How.CSS,using = "btn-search search-active-mobile search-active")
    public static WebElement submitWebElement;

    public static WebElement getSearchInputWebElement()
    {
        return searchInputWebElement;
    }
    public static WebElement getSubmitWebElement(){
        return submitWebElement;
    }
    public void clearInputBox(){

        getSearchInputWebElement().clear();
    }
    public void typeItemName(String value){

        getSearchInputWebElement().sendKeys(value);
    }
    public void clickOnSearch(){
        getSearchInputWebElement().clear();
    }
    public void clearTypeNClickOnSearch(){
        List<String> list = getItems();
        for (int i = 0; i < list.size(); i++){
            clearInputBox();
            typeItemName(list.get(i));
            clickOnSearch();
        }
    }
    public void searchItemsAndSubmitButton() throws Exception {
        List<String> list = DataSource.getItemsListFromDB();
        for(int i = 0; i <list.size(); i++) {
    typeItemName(list.get(i));
    clickOnSearch();
    clearInputBox();
        }
    }
    public static List<String> getItems(){
        List<String> itemsList =new ArrayList<>();
        //itemsList.add("apple watch");
        //itemsList.add("iphone");
        //itemsList.add("iphone case");
        return itemsList;
    }
}



