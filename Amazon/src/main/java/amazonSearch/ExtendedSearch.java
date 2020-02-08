package amazonSearch;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExtendedSearch extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(xpath = "//input[@class='nav-input' and @type='submit']")
    private WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"nav-signin-tooltip\"]/a/span")
    private WebElement signInButton;

    public void navigateToAmazonHomePage() {
        driver.get("https://www.amazon.com/");
    }

    public void searchItem(String item) {
        this.searchBar.sendKeys(item, Keys.ENTER);
    }

    public void clearItem() {
        this.searchBar.clear();
    }


}
