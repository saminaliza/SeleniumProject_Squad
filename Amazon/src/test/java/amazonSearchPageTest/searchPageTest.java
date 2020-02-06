package amazonSearchPageTest;

import amazonSearch.SearchPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class searchPageTest extends CommonAPI {
    @Test
    public void searchItems() throws Exception, IOException, SQLException, ClassNotFoundException {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.searchItemsAndSubmitButton();
    }

    @Test
    public void userSearchMultipleItemsTest() {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.getItems();
    }
}
