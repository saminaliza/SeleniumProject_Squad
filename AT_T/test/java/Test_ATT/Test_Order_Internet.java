package Test_ATT;

import base.CommonAPI;
import homePage_AT_T.Order_Internet;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Order_Internet extends Order_Internet {

    @Test(priority = 1)
    public void wireLess_Order() throws InterruptedException {
        Order_Internet order = PageFactory.initElements(driver,Order_Internet.class);
        order.wire_Less();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void upgradePh() throws InterruptedException {
        Order_Internet upG = PageFactory.initElements(driver,Order_Internet.class);
        upG.clickUpGrade();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void clickShop_Now() throws InterruptedException {
        Order_Internet shp = PageFactory.initElements(driver,Order_Internet.class);
        shp.clickShopNow();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void clickContinueWithOutSigning() throws InterruptedException {
        Order_Internet cwos =PageFactory.initElements(driver,Order_Internet.class);
        cwos.clickContinueWIthOutSigning();
        Thread.sleep(2000);
    }
    @Test (priority = 5)
            public void supportClick() throws InterruptedException {
        Order_Internet sp = PageFactory.initElements(driver, Order_Internet.class);
        sp.clickSupport();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void viewBill() throws InterruptedException {
        Order_Internet vw = PageFactory.initElements(driver,Order_Internet.class);
        vw.clickViewBill();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void Business_Click() throws InterruptedException {
        Order_Internet bs = PageFactory.initElements(driver,Order_Internet.class);
        bs.clickBusiness();
        Thread.sleep(2000);
    }






}
