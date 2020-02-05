package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;
    @FindBy(css = "input[class='nav-input']")
    WebElement submitBtn;
    public void navigateToAmazon() {
        driver.get("https://www.amazon.com/");
    }
    public void searchNClick(String itemName) {
        this.navigateToAmazon();
        searchBox.sendKeys("name");
        submitBtn.click();
    }

}
