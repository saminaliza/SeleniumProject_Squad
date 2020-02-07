package amazonSignUp;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends CommonAPI {

    @FindBy(id = "nav-link-accountList")
    WebElement signInBtn;

    @FindBy(linkText = "Start here.")
    WebElement signInLink;

    @FindBy(id = "ap_customer_name")
    WebElement userNameBox;

    @FindBy(id = "ap_email")
    WebElement emailBox;

    @FindBy(id = "ap_password")
    WebElement passwordBox;

    @FindBy(id = "ap_password_check")
    WebElement reenterPasswordBox;

    @FindBy(id = "continue")
    WebElement createAccountBtn;

    @FindBy(xpath = "//*[@id=\"auth-passwordCheck-missing-alert\"]/div/div")
    WebElement errorMessage;

    @FindBy(css = "input[class='a-input-text a-span12 cvf-widget-input cvf-widget-input-code']")
    WebElement codeEntryBox;

    @FindBy(xpath = "//*[@id=\"a-autoid-0\"]/span/input")
    WebElement submitBtn;

    @FindBy(css = "a[class='a-popover-trigger a-declarative']")
    WebElement sameEmailBtn;

    @FindBy(linkText = "Create a new account anyway")
    WebElement newAccountLink;

    public void canGoToSignUpPage() {
        Actions actions = new Actions(driver);
        actions.moveToElement(signInBtn).perform();
        actions.moveToElement(signInLink).perform();
        actions.click().build().perform();
    }

    public void createAccount(String name, String email, String password) {
        canGoToSignUpPage();
        userNameBox.sendKeys(name);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        reenterPasswordBox.sendKeys(password);
        createAccountBtn.click();
    }

    public void createAccountError(String name, String email, String password) {
        canGoToSignUpPage();
        userNameBox.sendKeys(name);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        createAccountBtn.click();
    }

    public void createAccountPartWithVerificationCode(String name, String email, String password, String code) {
        canGoToSignUpPage();
        userNameBox.sendKeys(name);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        reenterPasswordBox.sendKeys(password);
        createAccountBtn.click();
        codeEntryBox.sendKeys(code);
        submitBtn.click();
    }

    public void createAccountWithSameEmail(String name, String email, String password) {
        canGoToSignUpPage();
        userNameBox.sendKeys(name);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        reenterPasswordBox.sendKeys(password);
        createAccountBtn.click();
        sameEmailBtn.click();
        newAccountLink.click();

    }

    public void createAccount3(String name, String email, String password) throws InterruptedException {
        canGoToSignUpPage();
        userNameBox.sendKeys(name);
        emailBox.sendKeys(email);
        passwordBox.sendKeys(password);
        reenterPasswordBox.sendKeys(password);
        createAccountBtn.click();
        sameEmailBtn.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        alert.dismiss();

    }
}
