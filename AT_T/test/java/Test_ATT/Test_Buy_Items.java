package Test_ATT;

import homePage_AT_T.BuyItems;
import homePage_AT_T.CreatACCT;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Buy_Items extends CreatACCT {

    @Test(priority = 1)
    public void testHomePage() throws InterruptedException {
        BuyItems hp = PageFactory.initElements(driver, BuyItems.class);
        hp.clickhamburger();
        hp.findDeals();
        hp.findPhones();
        hp.bringOwnPhone();
        hp.clickAccessories();
        hp.clickWirelessDeals();
        hp.clickCases();
        Thread.sleep(3000);
    }
}








//    @Test(priority = 8)
//    public void testShopNow() throws InterruptedException {
//        Buy_Items shpnw = PageFactory.initElements(driver, Buy_Items.class);
//        shpnw.clickShopnow();
//        Thread.sleep(500);
//    }
//    @Test(priority = 9)
//    public void testColor() throws InterruptedException {
//        Buy_Items color = PageFactory.initElements(driver, Buy_Items.class);
//        color.clickColor();
//        Thread.sleep(100);
//    }
//    @Test(priority = 10)
//    public void testMemory() throws InterruptedException {
//        Buy_Items memory = PageFactory.initElements(driver, Buy_Items.class);
//        memory.clickMemory();
//        Thread.sleep(100);
//    }
//    @Test(priority = 11)
//    public void testCondition() throws InterruptedException {
//        Buy_Items condition = PageFactory.initElements(driver, Buy_Items.class);
//        condition.clickCondition();
//        Thread.sleep(100);
//    }
//    //    @Test(priority = 12)
////    public void testDropDown() throws InterruptedException {
////        Create_ACT dpdplan = PageFactory.initElements(driver,Create_ACT.class);
////        dpdplan.planForDropDown();
////        Thread.sleep(100);
////    }
//    @Test(priority = 13)
//    public void testPlan() throws InterruptedException {
//        Buy_Items plan = PageFactory.initElements(driver, Buy_Items.class);
//        plan.clickAddPlan();
//        Thread.sleep(1000);
//    }
//    @Test(priority = 14)
//    public void testContinuebtn() throws InterruptedException {
//        Buy_Items btnContinue = PageFactory.initElements(driver, Buy_Items.class);
//        btnContinue.buttonContinue();
//        Thread.sleep(1000);
//    }



