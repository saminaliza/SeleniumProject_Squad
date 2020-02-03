package Test_ATT;

import homePage_AT_T.OrderInternet;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Order_Internet extends OrderInternet {

    @Test(priority = 1)
    public void wireLess_Order() throws InterruptedException {
        OrderInternet order = PageFactory.initElements(driver, OrderInternet.class);
        order.wire_Less();
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void upgradePh() throws InterruptedException {
        OrderInternet upG = PageFactory.initElements(driver, OrderInternet.class);
        upG.clickUpGrade();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void clickShop_Now() throws InterruptedException {
        OrderInternet shp = PageFactory.initElements(driver, OrderInternet.class);
        shp.clickShopNow();
        Thread.sleep(2000);
    }
    @Test(priority = 4)
    public void clickContinueWithOutSigning() throws InterruptedException {
        OrderInternet cwos =PageFactory.initElements(driver, OrderInternet.class);
        cwos.clickContinueWIthOutSigning();
        Thread.sleep(2000);
    }


    @Test (priority = 5)
        public void supportClick() throws InterruptedException {
        OrderInternet sp = PageFactory.initElements(driver, OrderInternet.class);
        sp.clickSupport();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void viewBill() throws InterruptedException {
        OrderInternet vw = PageFactory.initElements(driver, OrderInternet.class);
        vw.clickViewBill();
        Thread.sleep(2000);
    }
    @Test(priority = 7)
    public void Business_Click() throws InterruptedException {
        OrderInternet bs = PageFactory.initElements(driver, OrderInternet.class);
        bs.clickBusiness();
        Thread.sleep(2000);
    }
    @Test(priority = 8)
    public void direct_TV() throws InterruptedException {
        OrderInternet dr = PageFactory.initElements(driver, OrderInternet.class);
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
        OrderInternet dtv = PageFactory.initElements(driver, OrderInternet.class);
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
        OrderInternet res = PageFactory.initElements(driver, OrderInternet.class);
        res.chooseRes();
        Thread.sleep(4000);
    }
    @Test(priority = 11)
    public void addCart() throws InterruptedException {
        OrderInternet cart = PageFactory.initElements(driver, OrderInternet.class);
        cart.clickToAdd();
        Thread.sleep(2000);
    }
    @Test(priority = 12)
    public void cart_2() throws InterruptedException {
        OrderInternet ct = PageFactory.initElements(driver, OrderInternet.class);
        ct.cart_Add();
        Thread.sleep(3000);
    }

    }







