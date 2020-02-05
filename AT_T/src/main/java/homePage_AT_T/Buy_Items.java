package homePage_AT_T;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.security.Key;

public class Buy_Items extends CommonAPI {
    @FindBy(how = How.XPATH, using = "//i[@id='ge5p-menu-active']")
    WebElement Hamburgerlink;
    @FindBy(how = How.XPATH,using ="//li[@id='HEADBAND00']//img[contains(@class,'_32CgZ')]")
    WebElement deals;

    @FindBy(how=How.XPATH,using = "//a[contains(@class,'_20CgK _1hxmk')]//span[contains(@class,'')][contains(text(),'Phones')]")
    WebElement phones;

    @FindBy(how = How.XPATH,using = "//span[@class='gn-z2-Navstrip-Menutext show-unauth'][contains(text(),'Bring your own')]")
    WebElement findownPhone;

    @FindBy(how=How.XPATH,using = "//a[contains(@class,'_20CgK _1hxmk')]//span[contains(@class,'')][contains(text(),'Accessories')]")
    WebElement findAccessories;

    @FindBy(how=How.XPATH,using = "//span[contains(text(),'Wireless deals')]")
    WebElement wirelessDeals;

    @FindBy(how=How.XPATH,using = "//a[contains(text(),'Get started')]")
    WebElement getStarted;

    @FindBy(how=How.XPATH,using = "//*[@id='Combined-Shape']")
    WebElement closepopup;

//  Testing to buy a cell phone
    @FindBy(how=How.XPATH,using = "//a[@class='_20CgK btn-secondary btn btn-secondary 28ee680b-117f-3ec1-aed8-25ecffa9cfec']")
    WebElement shopNow;

    @FindBy(how=How.XPATH,using = "//label[1]//div[1]//div[1]")
    WebElement chooseColor;

    @FindBy(how = How.XPATH,using = "//span[contains(text(),'128 GB')]")
    WebElement chooseMemory;

    @FindBy(how=How.XPATH,using = "//span[contains(text(),'New')]")
    WebElement chooseCondition;

    @FindBy(how=How.XPATH,using = "//*[@id='pricing-options-button']")
    WebElement pickPlanFromDropDown;

    @FindBy(how=How.XPATH,using = "//*[@id='next-checkbox']")
    WebElement addPlan;

    @FindBy(how=How.XPATH,using = "//button[contains(@class,'btn btn-primary-2 false bg-functional-blue color-ui-white btn-large btn-full-width')]")
    WebElement clickContinue;

     public void clickhamburger() throws InterruptedException {
        Hamburgerlink.click();
        //Hamburgerlink.click();
        System.out.println(driver.getCurrentUrl());
    }
    public void findDeals() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", deals);
    }
    public void findPhones() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", phones);
    }
    public void bringOwnPhone() throws InterruptedException {
        findownPhone.click();
    }
    public void clickAccessories(){
        findAccessories.click();
    }
    public void clickWirelessDeals() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", wirelessDeals);
    }
    public void clickCases(){
        getStarted.click();
        driver.navigate().back();
//        Alert alert =  driver.switchTo().alert();
//        alert.dismiss();
        //closepopup.click();
    }
    public void clickShopnow(){
        shopNow.click();
    }
    public void clickColor(){

         chooseColor.click();
    }
    public void clickMemory(){
        chooseMemory.click();
    }
    public void clickCondition(){
        chooseCondition.click();
    }
    public void planForDropDown(){
        pickPlanFromDropDown.click();
        Actions drpdown = new Actions(driver);
        drpdown.sendKeys(Keys.DOWN, Keys.ENTER).perform();

    }
    public void clickAddPlan(){
        addPlan.click();
    }
    public void buttonContinue(){
        clickContinue.click();
    }












}
