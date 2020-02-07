package businessVoice;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BusinessVoice extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//i[@class='icon-right-arrow']")
    WebElement business;
    @FindBy(how =How.XPATH,using = "//span[@class='top-action-button'][contains(text(),'Voice')]")
    WebElement voice;
    public void businessDeal() throws InterruptedException {
        business.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", voice);
        sleepFor(2);
    }







}
