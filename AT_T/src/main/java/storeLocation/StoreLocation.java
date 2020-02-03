package storeLocation;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class StoreLocation extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//a[@class='_20CgK btn btn-primary-2 btn-arrow d47744b9-f2e7-3936-ae23-0ab336030053']")
    WebElement learnMore;
    @FindBy(how = How.XPATH,using = "//a[@class='_20CgK btn btn-primary-2 btn-arrow mar-t-xs e5590ca9-002c-31a3-b3f4-4f5dfd9bf057']")
    WebElement learMoreToo;
    @FindBy(how =How.XPATH,using = "//*[@id=\"fsrInvite\"]/section[3]/button[2]")
    WebElement popUp;
    @FindBy(how =How.XPATH,using = "//div[@id='z5-ftr-col1']//li[1]//a[1]")
    WebElement findStore;
    @FindBy(how = How.XPATH,using = "//p[@class='stateName']//a[@class='ng-binding'][contains(text(),'New York')]")
    WebElement location;
    @FindBy(how =How.XPATH,using = "//span[contains(text(),'Astoria')]")
    WebElement queensLocation;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Broadway Astoria')]")
    WebElement astoriaLocation;

    public void learBundels() throws InterruptedException {
        learnMore.click();
        sleepFor(2);
        learMoreToo.click();
        popUp.click();
        sleepFor(5);
        findStore.click();
        sleepFor(4);
        location.click();
        sleepFor(4);
        queensLocation.click();
        astoriaLocation.click();


    }




}


// ClickOnLogInButton(driver1);
//        CommonAPI.handleNewTab(driver1);
//        TypeUserName(driver);
//        typePassword(driver);
//        ClickOnAuthenticate(driver);