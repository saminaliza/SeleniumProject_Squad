package homePage_AT_T;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CreatACCT extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//i[@class='icon-down']")
    WebElement account;
    @FindBy(how=How.XPATH,using = "//a[contains(text(),'Sign in')]")
    WebElement signIn;
    @FindBy(how=How.XPATH,using = "//a[@id='createOneNowLink']")
    WebElement createAccount;
    @FindBy(how=How.XPATH,using = "//input[@id='phoneNum']")
    WebElement phoneNumber;
    @FindBy(how=How.XPATH,using = "//input[@id='accountNum']" )
    WebElement accountNUmber;
    @FindBy(how=How.XPATH,using = "//input[@id='zipcode']")
    WebElement zipcode;
    @FindBy(how=How.XPATH,using = "//*[@id=\'wrapper\']/div[2]/div/div/div/section[2]/div/div/form/div/div/div[9]/div/button[1]")
    WebElement continueBTN;
    @FindBy(how=How.XPATH,using = "//button[@class='btn btn-secondary btn-clear btn-medium ng-scope']")
    WebElement cancel;
    @FindBy(how=How.XPATH,using = "//a[contains(text(),'Continue without signing in')]")
    WebElement continueWTSignIn;
    @FindBy(how=How.XPATH,using = "//input[@name='Active AT&T phone number']")
    WebElement phone_Number2;
    @FindBy(how=How.XPATH,using = "//input[@name='Active account number']")
    WebElement account_Number2;
    @FindBy(how=How.XPATH,using = "//input[@placeholder='5-digit ZIP code']")
    WebElement zip_Code2;
    @FindBy(how = How.CSS,using="//button[contains(text(),'Cancel')]")
    WebElement clickCancel;

    public void createCccountPayBalance() throws InterruptedException {
        account.click();
        signIn.click();
        createAccount.click();
        phoneNumber.sendKeys("7189561604");
        accountNUmber.sendKeys("123456789");
        zipcode.sendKeys("11101");
        continueBTN.click();
        Thread.sleep(1000);
        cancel.click();
        continueWTSignIn.click();
        phone_Number2.sendKeys("7189561602");
        account_Number2.sendKeys("AC_23456789");
        zip_Code2.sendKeys("11104");
        clickCancel.click();

    }
}


