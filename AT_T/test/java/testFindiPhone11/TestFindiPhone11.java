package testFindiPhone11;

import base.CommonAPI;
import findiphone11.FindiPhone11;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFindiPhone11 extends CommonAPI {
    @Test
    public void iPhoneEleven() throws InterruptedException {
        FindiPhone11 fip = PageFactory.initElements(driver,FindiPhone11.class);
        fip.findiphone11();

    }
}
