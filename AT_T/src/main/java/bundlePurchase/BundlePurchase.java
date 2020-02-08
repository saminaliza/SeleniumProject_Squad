package bundlePurchase;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BundlePurchase extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//input[@id='z1-searchfield']")
    WebElement bundleDeals;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'TV & internet bundles')]")
    WebElement deals;
    @FindBy(how = How.XPATH,using = "//a[@class='_20CgK btn-arrow on-dark btn-large btn btn-primary _2NV38']")
    WebElement shopAllOffer;
    @FindBy(how = How.XPATH,using = "//li[3]//div[1]//div[2]//div[5]//span[1]//a[1]")
    WebElement shopAllOfferToo;
    @FindBy(how = How.XPATH,using = "//input[@placeholder='5-digit ZIP Code']")
    WebElement zipCode;
    @FindBy(how = How.XPATH,using = "//input[@placeholder='123 Main st.']")
    WebElement streetAddress;
    @FindBy(how = How.XPATH,using = "//i[@class='Select__arrow styles__att-icon styles__att-icon-down']")
    WebElement chooseFromDropDown;
    @FindBy(how = How.XPATH,using = "//*[@id=\"CheckAvailabilityFormCard_Select_unitType_fullAddress_Option_Apartment\"]/div/span")
    WebElement apt;
    @FindBy(how = How.XPATH,using = "//div[@class='CheckAvailabilityVariantsPanel__beside-right CheckAvailabilityVariantsPanel__width-half']//input[contains(@class,'TextField__text-field')]")
    WebElement aptNumber;
    //@FindBy(how = How.XPATH,using = "//span[contains(@class,'Checkbox__checkmark')]")
    @FindBy(how = How.XPATH,using = "//span[@class='Checkbox__checkmark ']")
    WebElement checkMark;


    public void buyTheTVAndInternet() throws InterruptedException {
        bundleDeals.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", deals);
        shopAllOffer.click();
        shopAllOfferToo.click();
        zipCode.sendKeys("11106");
        sleepFor(4);
        streetAddress.sendKeys("3443 30th St");
        sleepFor(7);
        chooseFromDropDown.click();
        CommonAPI.sleepFor(6);
        apt.click();
        sleepFor(3);
        aptNumber.sendKeys("1A");
        sleepFor(4);
        executor.executeScript("arguments[0].click();",checkMark);




    }













}
