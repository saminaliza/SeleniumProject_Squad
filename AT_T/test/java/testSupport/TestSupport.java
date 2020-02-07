package testSupport;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import support.Support;

public class TestSupport extends CommonAPI {
    @Test
    public void findSupportInfo() throws InterruptedException {
    Support sp = PageFactory.initElements(driver,Support.class);
    sp.findSupport();
    }

}
