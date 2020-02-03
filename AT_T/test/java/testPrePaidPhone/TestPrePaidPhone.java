package testPrePaidPhone;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import prePaidPhone.BuyPrePaidPhone;

public class TestPrePaidPhone extends CommonAPI {

    @Test
    public void buyPrePaidPhone() throws InterruptedException {
        BuyPrePaidPhone bph = PageFactory.initElements(driver,BuyPrePaidPhone.class);
        bph.buyPhone();
    }
}
