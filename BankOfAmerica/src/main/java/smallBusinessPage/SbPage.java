package smallBusinessPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SbPage extends CommonAPI{

    @FindBy(how = How.CSS, using ="span.spa-btn")
    public static WebElement openCheckingAcWebElement;
}
