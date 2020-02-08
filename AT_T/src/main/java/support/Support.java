package support;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Support extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//span[@class='z1-support-text']")
    WebElement support;
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Check for outages')]")
    WebElement checkOutages;
    //@FindBy(how = How.XPATH,using = "//i[@class='Select__arrow styles__att-icon styles__att-icon-down']")
    @FindBy(how = How.XPATH,using = "//div[@class='Select__selected-value-container']")
    WebElement dropDownArrow;
    @FindBy(how =How.XPATH,using = "//div[contains(@class,'Label__label-parent')]//span[contains(text(),'Internet')]")
    WebElement internet;
    @FindBy(how=How.XPATH,using = "//*[@id=\"buttonForZip\"]/button")
    WebElement checkOutage;
    @FindBy(how = How.XPATH,using = "//*[@id=\"fsrInvite\"]/section[3]/button[2]")
    WebElement blockPopUp;
    @FindBy(how = How.XPATH,using = "//input[@placeholder='Enter your Zip Code']")
    WebElement zipCode;
    @FindBy(how =How.XPATH,using = "//body[@class='attgn-page']")
    WebElement robot;
    @FindBy(how = How.XPATH,using = "//div[@class='ZipSearch__zipSearchBtn']")
    WebElement checkOutageToo;

    public void findSupport() throws InterruptedException {
        support.click();
        checkOutages.click();
        sleepFor(4);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dropDownArrow);
        executor.executeScript("arguments[0].click()",internet);
        executor.executeScript("arguments[0].click()",checkOutage);
       //blockPopUp.click();       // at the beginning
        zipCode.sendKeys("11102");
        sleepFor(3);
        //robot.click();
        executor.executeScript("arguments[0].click()",robot);
        sleepFor(4);
        executor.executeScript("arguments[0].click()",checkOutageToo);

        // All Tests Passed FEB 3,2020
        //checkOutageToo.click();


    }




}
