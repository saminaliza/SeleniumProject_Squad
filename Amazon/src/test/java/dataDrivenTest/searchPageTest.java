package dataDrivenTest;

import amazonDataDriven.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class searchPageTest extends CommonAPI {
    @Test
    public void userCanSearchItemsUsingDatabase() throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.searchItemsAndSubmitButton();
    }

}
