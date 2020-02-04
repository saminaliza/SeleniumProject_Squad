package amazonTodaysDeal;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage extends CommonAPI {
    @FindBy(linkText = "Amazon Devices")
    WebElement amazonDevice;



    public void goToTodaysDeal(){
        clickOnElement("//*[@id=\"nav-xshop\"]/a[1]");
    }
    public void shopDeviceFromTodaysDeal(){
        goToTodaysDeal();
        amazonDevice.click();
    }
}
