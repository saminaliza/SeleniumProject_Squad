package amazonMakeMoneyWithUs;

import amazonKindle.KindleOptions;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class MakeMoneyOptionPage extends CommonAPI {

    @FindBy(linkText = "Sell on Amazon")
    WebElement sellOnAmazon;

    @FindBy(linkText = "Sell Under Amazon Accelerator")
    WebElement sellUnderAccelerator;

    @FindBy(linkText = "Sell on Amazon Handmade")
    WebElement SellOnAmazonHandmade;

    @FindBy(linkText = "Sell Your Services on Amazon")
    WebElement SellServicesOnAmazon;

    @FindBy(linkText = "Sell on Amazon Business")
    WebElement sellOnAmazonBusiness;

    @FindBy(linkText = "Sell Your Apps on Amazon")
    WebElement sellAppOnAmazon;

    @FindBy(linkText = "Become an Affiliate")
    WebElement amazonAffiliate;

    @FindBy(linkText = "Advertise Your Products")
    WebElement advertiseYourProducts;

    @FindBy(linkText = "Self-Publish with Us")
    WebElement selfPublishWithUs;

//    public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }
//    public void sellUnderAmazonAccelerator(){
//        sellUnderAccelerator.click();
//    }public void sellOnAmazonHandmade(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }public void sellOnAmazon(){
//        sellOnAmazon.click();
//    }


}
