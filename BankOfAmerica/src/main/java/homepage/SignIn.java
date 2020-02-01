package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn {

    @FindBy(how =How.CSS, using = "#onlineId1")
    public static WebElement onlineIDTextBoxWebElement;

    @FindBy(how =How.CSS, using = "#passcode1")
    public static WebElement passCodeTextBoxWebElement;

    @FindBy(how =How.CSS, using = "#signIn")
    public static WebElement signInButtonWebElement;

}
