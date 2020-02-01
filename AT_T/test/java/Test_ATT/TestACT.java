package Test_ATT;

import base.CommonAPI;
import homePage_AT_T.Buy_Items;
import homePage_AT_T.Creat_ACCT;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestACT extends CommonAPI {
    @Test(priority = 1)
    public void testAcct() throws InterruptedException {
        Creat_ACCT acct = PageFactory.initElements(driver,Creat_ACCT.class);
        acct.clickAcct();
        Thread.sleep(100);
    }

    @Test(priority = 2)
    public void testSignIn() throws InterruptedException {
        Creat_ACCT sign_In = PageFactory.initElements(driver,Creat_ACCT.class);
        sign_In.clicksign();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void testcreateaccount() throws InterruptedException {
        Creat_ACCT creat_account = PageFactory.initElements(driver,Creat_ACCT.class);
        creat_account.clickCreateAccount();
        Thread.sleep(1000);
    }
    @Test(priority =4)
    public void testPhoneNumber() throws InterruptedException {
        Creat_ACCT phone_Number = PageFactory.initElements(driver,Creat_ACCT.class);
        phone_Number.enterPhoneNumber();
        Thread.sleep(1000);
    }
    @Test(priority = 5)
    public void testAcctNumber() throws InterruptedException {
        Creat_ACCT phone_Number = PageFactory.initElements(driver,Creat_ACCT.class);
        phone_Number.enterAccountNumber();
        Thread.sleep(1000);
    }
    @Test(priority = 6)
    public void testZipCode() throws InterruptedException {
        Creat_ACCT zip_Code = PageFactory.initElements(driver,Creat_ACCT.class);
        zip_Code.enterZipCode();
        Thread.sleep(1000);
    }
    @Test(priority = 7)
    public void testContinueBTN() throws InterruptedException {
        Creat_ACCT continue_BTN = PageFactory.initElements(driver,Creat_ACCT.class);
        continue_BTN.clickContinueBTN();
        Thread.sleep(10000);
    }
    @Test(priority =8)
    public void TestCancel() throws InterruptedException {
        Creat_ACCT cancel2 = PageFactory.initElements(driver,Creat_ACCT.class);
        cancel2.clickCancel();
        Thread.sleep(10000);
    }
    @Test(priority = 9)
    public void testContinueWTSignIn() throws InterruptedException {
        Creat_ACCT wtSign = PageFactory.initElements(driver,Creat_ACCT.class);
        wtSign.clickContinueWTSignIn();
        Thread.sleep(1000);
    }

    @Test(priority = 10)
    public void testPh() throws InterruptedException {
        Creat_ACCT ph1 = PageFactory.initElements(driver,Creat_ACCT.class);
        ph1.enterPh();
        Thread.sleep(1000);
    }
    @Test(priority =11)
    public void TestAcctNumber2() throws InterruptedException {
        Creat_ACCT num2 = PageFactory.initElements(driver,Creat_ACCT.class);
        num2.enterAcctNumber2();
        Thread.sleep(1000);
    }

    @Test(priority = 12)
    public void test_ZipCode2() throws InterruptedException {
        Creat_ACCT zip2 = PageFactory.initElements(driver,Creat_ACCT.class);
        zip2.enter_ZipCode2();
        Thread.sleep(1000);
    }
    @Test(priority = 13)
    public void test_Robot() throws InterruptedException {
        Creat_ACCT robot = PageFactory.initElements(driver,Creat_ACCT.class);
        robot.click_Robot();
        Thread.sleep(3000);
    }
    @Test(priority = 14)
    public void testContinue_btn2() throws InterruptedException {
        Creat_ACCT continue2 = PageFactory.initElements(driver,Creat_ACCT.class);
        continue2.clickContinue_btn2();
        Thread.sleep(1000);
    }
















}





























