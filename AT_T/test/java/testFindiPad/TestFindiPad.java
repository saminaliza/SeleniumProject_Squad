package testFindiPad;

import base.CommonAPI;
import findiPad.FindiPad;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestFindiPad extends CommonAPI {
    @Test
    public void ipadSelection() throws InterruptedException {
        FindiPad fip = PageFactory.initElements(driver,FindiPad.class);
        fip.clickiPad();




    }
}
