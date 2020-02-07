package wealthManagement;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WealthManagementPage extends CommonAPI {

    @FindBy (xpath = "//a[@class='t-track-teaser-cta cta__anchor cta__anchor--buttonbase  t-track-teaser-cta ']")
    WebElement merrilLearnMoreWebElement;

    @FindBy (xpath = "//a[@class='t-track-teaser-cta cta__anchor cta__anchor--buttonbase  t-track-teaser-cta ']")
    WebElement privateBankWebElement;

    @FindBy(xpath = "//a[@class='t-track-teaser-cta cta__anchor cta__anchor--buttonbase  t-track-teaser-cta ']")
    WebElement merrilLearnMore2WebElement;

    @FindBy(xpath = "//a[@class='t-track-teaser-cta cta__anchor cta__anchor--buttonbase  t-track-teaser-cta ']")
    WebElement privateBank2WebElement;


    public void merrillLearnMoreClick() throws InterruptedException {
        Thread.sleep(3500);
        merrilLearnMoreWebElement.click();
    }

    public void privateBankClick() throws InterruptedException {
        Thread.sleep(3500);
        privateBankWebElement.click();
    }
    public void merrilLearnMore2Click() throws InterruptedException {
        Thread.sleep(3500);
        merrilLearnMore2WebElement.click();
    }
    public void privateBank2Click() throws InterruptedException {
        Thread.sleep(3500);
        privateBank2WebElement.click();
    }
    public void merrillPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        merrilLearnMoreWebElement.click();
        driver.getTitle();
    }
    public String privateBankPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        privateBankWebElement.click();
        return driver.getTitle();
    }
    public String  privateBankActualPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        driver.navigate().to("https://www.merrill.com/");
       return  driver.getTitle();
    }
    public String  merrillActualPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        driver.navigate().to("https://www.merrill.com/");
        return  driver.getTitle();
    }


}
