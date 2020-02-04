package Test_ATT;

import base.CommonAPI;
import homePage_AT_T.Buy_Items;
import homePage_AT_T.Creat_ACCT;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_Buy_Items extends Creat_ACCT {
    @Test(priority = 1)
    public void testhamburger1() throws InterruptedException {
        Buy_Items hp = PageFactory.initElements(driver, Buy_Items.class);
        hp.clickhamburger();
        Thread.sleep(3000);
    }
    @Test(priority = 2)
    public void testdeals() throws InterruptedException {
        Buy_Items deals = PageFactory.initElements(driver, Buy_Items.class);
        deals.findDeals();  // creates the object of(Create_ACT) class and then create the reference variable(deals) then using rv(reference variable) we can call the methods from our pageobjet class
        Thread.sleep(3000);
    }
    @Test(priority = 3)
    public void testphoes() throws InterruptedException {
        Buy_Items phones = PageFactory.initElements(driver, Buy_Items.class);
        phones.findPhones();
        Thread.sleep(10);
    }
    @Test(priority = 4)
    public void testFindOwnPhone() throws InterruptedException {
        Buy_Items findPhone = PageFactory.initElements(driver, Buy_Items.class);
        findPhone.bringOwnPhone();
        Thread.sleep(10);
    }
    @Test(priority = 5)
    public void testAccessories() throws InterruptedException {
        Buy_Items accessories = PageFactory.initElements(driver, Buy_Items.class);
        accessories.clickAccessories();
        Thread.sleep(100);
    }
    @Test(priority = 6)
    public void testFindDeals() throws InterruptedException {
        Buy_Items wireless = PageFactory.initElements(driver, Buy_Items.class);
        wireless.clickWirelessDeals();
        Thread.sleep(1000);
    }
    @Test(priority = 7)
    public void testCases() throws InterruptedException {
        Buy_Items cases = PageFactory.initElements(driver, Buy_Items.class);
        cases.clickCases();
        Thread.sleep(100);
    }
    @Test(priority = 8)
    public void testShopNow() throws InterruptedException {
        Buy_Items shpnw = PageFactory.initElements(driver, Buy_Items.class);
        shpnw.clickShopnow();
        Thread.sleep(500);
    }
    @Test(priority = 9)
    public void testColor() throws InterruptedException {
        Buy_Items color = PageFactory.initElements(driver, Buy_Items.class);
        color.clickColor();
        Thread.sleep(100);
    }
    @Test(priority = 10)
    public void testMemory() throws InterruptedException {
        Buy_Items memory = PageFactory.initElements(driver, Buy_Items.class);
        memory.clickMemory();
        Thread.sleep(100);
    }
    @Test(priority = 11)
    public void testCondition() throws InterruptedException {
        Buy_Items condition = PageFactory.initElements(driver, Buy_Items.class);
        condition.clickCondition();
        Thread.sleep(100);
    }
    //    @Test(priority = 12)
//    public void testDropDown() throws InterruptedException {
//        Create_ACT dpdplan = PageFactory.initElements(driver,Create_ACT.class);
//        dpdplan.planForDropDown();
//        Thread.sleep(100);
//    }
    @Test(priority = 13)
    public void testPlan() throws InterruptedException {
        Buy_Items plan = PageFactory.initElements(driver, Buy_Items.class);
        plan.clickAddPlan();
        Thread.sleep(1000);
    }
    @Test(priority = 14)
    public void testContinuebtn() throws InterruptedException {
        Buy_Items btnContinue = PageFactory.initElements(driver, Buy_Items.class);
        btnContinue.buttonContinue();
        Thread.sleep(1000);
    }





}

