package searchPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends CommonAPI {
    @FindBy(name = "q")
    WebElement searchBar;
    @FindBy(css = "button[class='btn-search search-active-mobile search-active']")
    WebElement searchBtn;
    public void searchForItem(String item)  {
        searchBar.sendKeys(item);
        searchBtn.click();
    }

}




















       // CommonAPI.selectOptionByVisibleText(searchBar , "Sajad"); This is how we pick up the values from dropdown
        //driver.navigate().back();
       // driver.navigate().forward();
       // driver.navigate().refresh();


