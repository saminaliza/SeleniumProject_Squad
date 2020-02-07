package testSqlConnection;

import base.CommonAPI;
import org.openqa.grid.internal.cli.CommonCliOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPage.SearchPage;
import sqlConnection.SqlConnection;

public class TestSqlConnection extends CommonAPI {
    @Test
    public void searchItems() throws Exception {
        SqlConnection sqlPage = PageFactory.initElements(driver,SqlConnection.class);
        sqlPage.searchItemsAndSubmitButton();
    }

//    @Test
//    public void testuserCanSearchItemsAfterItemFromAList(){
//        SqlConnection sqlConnection = PageFactory.initElements(driver,SqlConnection.class);
//        sqlConnection.se();
//    }



}
