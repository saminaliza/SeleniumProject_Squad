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
    public void searchIphone() {
        searchForItem("iPhone");
    }
    public void  searchIpad(){
        searchForItem("ipad");
    }
    public void searchHeadphone() {
        searchForItem("headPhones");
    }
    public void searchWallCharger() {
        searchForItem("Wall Charger");
    }
    public void searchWirelessCharger() {
        searchForItem("Wireless Charger");
    }
    public void searchApplePencil(){
        searchForItem("Apple Pencil for iPad");
    }
    public void searchIpadKeyboard(){
        searchForItem("Logitech Slim Folio Pro 11 - inch Keyboard - Black");
    }
    public void searchIpad12KeyBoard () {
        searchForItem("ALogitech Slim Folio Pro 12.9 - inch Keyboard - Black");
    }
    public void searchIphoneCaseSaddleBrown(){
        searchForItem("Apple iPhone 11 Pro Max Leather Case - Saddle Brown");
    }
    public void searchIphoneClearCase(){
        searchForItem("Apple iPhone 11 Pro Max Clear Case");
    }


















        // CommonAPI.selectOptionByVisibleText(searchBar , "Sajad"); This is how we pick up the values from dropdown
        //driver.navigate().back();
        // driver.navigate().forward();
        // driver.navigate().refresh();


    }