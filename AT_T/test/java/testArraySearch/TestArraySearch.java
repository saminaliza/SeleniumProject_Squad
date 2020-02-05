package testArraySearch;

import arraySearch.ArraySearch;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPage.SearchPage;

public class TestArraySearch extends CommonAPI {
    @Test
    public void searchItemsUsingArrayList() throws InterruptedException {
        ArraySearch search = PageFactory.initElements(driver,ArraySearch.class);
        search.searchItemsArray();
    }
    }



