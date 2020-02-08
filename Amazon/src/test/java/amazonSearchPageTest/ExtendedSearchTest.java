package amazonSearchPageTest;

import amazonSearch.ExtendedSearch;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ExtendedSearchTest extends CommonAPI {

    @Test
    public void userCanSearchForMultipleItems() {
        ExtendedSearch search = PageFactory.initElements(driver, ExtendedSearch.class);
        search .navigateToAmazonHomePage();
        List<String> items = new ArrayList<>();
        items.add("backpack");
        items.add("dream catcher");
        items.add("mandala");
        items.add("ear buds");
        for (String item : items) {
            search .searchItem(item);
            search .clearItem();
        }
    }

}
