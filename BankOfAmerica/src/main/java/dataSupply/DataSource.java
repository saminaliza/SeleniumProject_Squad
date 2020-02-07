package dataSupply;

import base.CommonAPI;
import databases.ConnectToSqlDB;
import homepage.BoaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import reporting.TestLogger;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataSource extends CommonAPI{
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


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

    @Parameters({"searchBarValue2", "searchBarValue3", "searchBarValue4", "searchBarValue"})
    public void repetitiveSearches(String searchBarValue2, String searchBarValue3, String searchBarValue, String searchBarValue4) throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
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

    //Database
    public static List<String> getItemsListFromDB()throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("bankOfAmerica", "cardType");
        return list;
    }
    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException{
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("bankOfAmerica", "cardType");
        System.out.println(list.get(0));
    }
}
