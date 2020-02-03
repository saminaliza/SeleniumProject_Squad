package differencesServices;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DifferencesServices extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//div[@class='slick-slide slick-active slick-current']//div//a[@class='_20CgK _13I3D link-tertiary-large link-arrow aa934d82-9e1e-3fa1-b0e8-8ba93d1e0e4a'][contains(text(),'Make a Difference')]")
    WebElement video;
    @FindBy(how = How.XPATH,using = "//input[@id='search']")
    WebElement search;
    public void findDifferenences() throws InterruptedException {
        sleepFor(4);
        video.click();
        sleepFor(4);
        search.sendKeys("Selenium");

    }

}
