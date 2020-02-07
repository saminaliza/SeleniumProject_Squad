package Test_ATT;

import base.CommonAPI;
import homePage_AT_T.CreatACCT;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestACT extends CommonAPI {

    @Test(priority = 1)
    public void testAcct() throws InterruptedException {
        CreatACCT acct = PageFactory.initElements(driver, CreatACCT.class);
        acct.createCccountPayBalance();
        Thread.sleep(100);
    }

}





























