package Test_ATT;

import base.CommonAPI;
import com.sun.org.apache.xpath.internal.operations.Or;
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
    @Test(priority = 8)
    public void direct_TV() throws InterruptedException {
        Order_Internet dr = PageFactory.initElements(driver,Order_Internet.class);
        dr.clickDirectTV();
        Thread.sleep(2000);
    }
//    @Test(priority = 9)
//    public void pop_Up(){
//        Order_Internet pp = PageFactory.initElements(driver,Order_Internet.class);
//        pp.clickPopUp();
//    }
    @Test(priority = 9)
    public void shopDT() throws InterruptedException {
        Order_Internet dtv = PageFactory.initElements(driver,Order_Internet.class);
//        dtv.wire_Less();
//        dtv.clickUpGrade();
//        dtv.clickShopNow();
//        dtv.clickContinueWIthOutSigning();
//        dtv.clickSupport();
//        dtv.clickViewBill();
//        dtv.clickBusiness();
//        dtv.clickDirectTV();
        dtv.shpTV();
        Thread.sleep(2000);
    }
    @Test(priority = 10)
    public void pickRestaurant() throws InterruptedException {
        Order_Internet res = PageFactory.initElements(driver,Order_Internet.class);
        res.chooseRes();
        Thread.sleep(4000);
    }
    @Test(priority = 11)
    public void addCart() throws InterruptedException {
        Order_Internet cart = PageFactory.initElements(driver,Order_Internet.class);
        cart.clickToAdd();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void cart_2() throws InterruptedException {
        Order_Internet ct = PageFactory.initElements(driver,Order_Internet.class);
        ct.cart_Add();
        Thread.sleep(3000);
    }

    }







