package database;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class DatabaseTest extends CommonAPI {


    @Test
    public void userCanSearchItemsUsingDatabase() throws Exception, IOException, SQLException, ClassNotFoundException {
        CnnDataDriven search = PageFactory.initElements(driver, CnnDataDriven.class);
        search.searchItemsAndSubmitButton();
    }
}

