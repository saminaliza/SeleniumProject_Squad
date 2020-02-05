package findiPad;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindiPad extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Apple iPad')]")
    WebElement ipad;
    @FindBy(how = How.XPATH,using = "//a[@class='_20CgK _20CgK']")
    WebElement chooseSelection;
    @FindBy(how = How.XPATH,using = "//label[2]//div[1]//div[1]")
    WebElement color;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'128 GB')]")
    WebElement memory;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'New')]")
    WebElement condition;
    @FindBy(how = How.XPATH,using = "//button[@id='pricing-options-button']")
    WebElement dropdown;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Full retail price')]")
    WebElement fullPrice;
    @FindBy(how = How.XPATH,using = "//span[contains(@class,'jsx-3468049920 icon-chevron ease mar-l-xxs inline-block rotate90')]")
    WebElement dropDownArrow;
    @FindBy(how =How.XPATH,using = "//button[contains(@class,'btn btn-primary-2 false bg-functional-blue color-ui-white btn-large btn-full-width')]")
    WebElement continuefurther;
    @FindBy(how = How.XPATH,using = "//button[contains(@class,'false btn-large JBIsG btn-primary mar-l-xxs btn-arrow')][contains(text(),'Continue')]")
    WebElement continueFurtherToo;
    @FindBy(how =How.XPATH,using = "//a[contains(text(),'Change')]")
    WebElement changes;
    @FindBy(how = How.XPATH,using = "//label[2]//div[2]")
    WebElement silver;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'32GB')]")
    WebElement memory32;
    @FindBy(how = How.XPATH,using = "/html/body/div[9]/div[2]/div/div/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/div/section/div[1]/div/div/button")
    WebElement updateCard;


    public void clickiPad() throws InterruptedException {
        ipad.click();
        chooseSelection.click();
        color.click();
        memory.click();
        condition.click();
        dropdown.click();
        fullPrice.click();
        dropDownArrow.click();
        continuefurther.click();
        sleepFor(5);
        continueFurtherToo.click();
        sleepFor(2);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", changes);
        silver.click();
        memory32.click();
        updateCard.click();
    }

}
