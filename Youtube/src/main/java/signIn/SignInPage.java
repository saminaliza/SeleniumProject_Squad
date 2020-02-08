package signIn;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends CommonAPI {

    @FindBy(xpath="//paper-button[@id='button' and @class='style-scope ytd-button-renderer style-suggestive size-small']")
    WebElement signInTopRightWebElement;

    @FindBy(id="identifierId")
    WebElement textBoxEmailOrPhoneWebElement;

    @FindBy(id="identifierNext")
    WebElement nextButtonEmailWebElement;

    @FindBy(xpath="//input[@class='whsOnd zHQkBf' and @type='password']")
    WebElement textBoxPasswordWebElement;

    @FindBy(css="#passwordNext > span:nth-child(3)")
    WebElement nextButtonPasswordWebElement;


    public void signInTopRightClick() {
        signInTopRightWebElement.click();
    }

    public void textBoxEmailOrPhoneFeedValue(String value) {
        textBoxEmailOrPhoneWebElement.sendKeys(value);
    }

    public void nextAfterEmailValueClick() {
        nextButtonEmailWebElement.click();
    }

    public void textBoxPasswordFeedValue(String value) {
        textBoxPasswordWebElement.sendKeys(value, Keys.ENTER);
    }

    public void nextAfterPasswordClick() {
        nextButtonPasswordWebElement.click();
    }

    public void wrongPasswordSignIn() {
        signInTopRightClick();
        textBoxEmailOrPhoneFeedValue("quyummd@gmail.com");
        nextAfterEmailValueClick();
        textBoxPasswordFeedValue("wrongPassword");
        //nextAfterPasswordClick();
    }

    public void capsEmailSignIn() {
        signInTopRightClick();
        textBoxEmailOrPhoneFeedValue("Quyummd@gmail.com");
        nextAfterEmailValueClick();
        textBoxPasswordFeedValue("wrongPasswordAgain");
       // nextAfterPasswordClick();
    }

    public void wrongEmailSignIn() {
        signInTopRightClick();
        textBoxEmailOrPhoneFeedValue("wrongEmail@yahoo.com");
    }

}
