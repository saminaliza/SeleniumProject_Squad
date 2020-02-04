package findiphone11;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FindiPhone11 extends CommonAPI {

    @FindBy(how = How.XPATH,using = "//li[@id='LINKFARM11items10']//span[contains(@class,'')][contains(text(),'Apple iPhone 11')]")
    WebElement iphone11;
    @FindBy(how = How.XPATH,using = "//label[4]//div[1]//div[1]")
    WebElement color;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'64 GB')]")
    WebElement memory;
    @FindBy(how = How.XPATH,using = "//div[contains(@class,'head-room false')]//div[3]//div[1]//label[1]")
    WebElement condition;
    @FindBy(how = How.XPATH,using = "//button[contains(@class,'btn btn-primary-2 false bg-functional-blue color-ui-white btn-large btn-full-width')]")
    WebElement continueFurther;
    @FindBy(how =How.XPATH,using = "//button[contains(@class,'false btn-large JBIsG btn-primary mar-l-xxs btn-arrow')][contains(text(),'Continue')]")
    WebElement continueFurtherToo;

    public void findiphone11() throws InterruptedException {
        iphone11.click();
        color.click();
        sleepFor(2);
        memory.click();
        condition.click();
        continueFurther.click();
        sleepFor(2);
        continueFurtherToo.click();
    }

}
