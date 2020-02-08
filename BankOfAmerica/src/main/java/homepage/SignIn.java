package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.annotations.Parameters;

public class SignIn extends CommonAPI{

    @FindBy(how =How.CSS, using = "#onlineId1")
    public static WebElement onlineIDTextBoxWebElement;

    @FindBy(how =How.CSS, using = "#passcode1")
    public static WebElement passCodeTextBoxWebElement;

    @FindBy(how =How.CSS, using = "#saveOnlineId")
    public static WebElement saveOnlineIDCheckBoxWebElement;

    @FindBy(how =How.CSS, using = "#signIn")
    public static WebElement signInButtonWebElement;

    @FindBy(how =How.CSS, using = "#forgot-oid-pwd")
    public static WebElement forgotIdPasscodeWebElement;

    @FindBy(how =How.CSS, using = "#security")
    public static WebElement securityHelpWebElement;

    @FindBy(how =How.CSS, using = "#enroll")
    public static WebElement enrollWebElement;

    @FindBy(how =How.CSS, using = "#open")
    public static WebElement openAnAccountWebElement;

    @Parameters({"onlineID"})
    public void onlineIdTextBoxInput(String onlineID) {
        typeOnElement("#onlineId1", onlineID);
        takeScreenShot();
    }
    @Parameters({"passcode"})
    public void passcodeTextBoxInput(String passcode){
        typeOnElement("#passcode1", passcode);
        takeScreenShot();
    }
    public void saveOnlineIdCheckBoxSelect (){
        saveOnlineIDCheckBoxWebElement.click();
        takeScreenShot();
    }
    @Parameters({"forgotOnlineIdUrl"})
    public void forgotIdPasscodeClick(String forgotOnlineIdUrl) {
        driver.navigate().to(forgotOnlineIdUrl);
        String forgotOnlineIdPageTitleDriver = driver.getTitle();
        driver.navigate().back();
        forgotIdPasscodeWebElement.click();
        Assert.assertEquals(driver.getTitle(), forgotOnlineIdPageTitleDriver);
    }
    public void securityNHelpClick(){
        securityHelpWebElement.click();
    }
    @Parameters({"enrollUrl"})
    public void enrollClick(String enrollUrl) {
        driver.navigate().to(enrollUrl);
        String enrollTitledriver = driver.getTitle();
        driver.navigate().back();
        enrollWebElement.click();
        Assert.assertEquals(driver.getTitle(), enrollTitledriver);
    }
    @Parameters({"openAccUrl"})
    public void openAccClick(String openAccUrl) {
        driver.navigate().to(openAccUrl);
        String openAccTitledriver = driver.getTitle();
        driver.navigate().back();
        openAnAccountWebElement.click();
        Assert.assertEquals(driver.getTitle(), openAccTitledriver);
    }
    @Parameters({"onlineID", "passcode", "forgotOnlineIdUrl"})
    public void signInNegativeTest(String onlineID, String passcode, String forgotOnlineIdUrl){
        typeOnElement("#onlineId1", onlineID);
        typeOnElement("#passcode1", passcode);
        signInButtonWebElement.click();
        WebElement help = driver.findElement(By.cssSelector("div.fsd-ll-skin:nth-child(1) > h2:nth-child(1)"));
        Assert.assertEquals(help.isDisplayed(), true);
    }



}
