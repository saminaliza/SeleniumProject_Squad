package prePaidPhone;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BuyPrePaidPhone extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[@id='z1-pullMenu-open']")
    WebElement hamburgerlink;
    @FindBy(how = How.XPATH,using = "//span[@class='auth-pull-left'][contains(text(),'Prepaid')]")
    WebElement buyPhone;
    @FindBy(how =How.XPATH,using = "//span[contains(text(),'Explore AT&T PREPAID')]")
    WebElement exploreAt;
    @FindBy(how = How.XPATH,using ="//a[contains(@class,'btn btn-primary mar-t-xs _2NV38')]" )
    WebElement shopNow;
    @FindBy(how = How.XPATH,using = "//div[contains(@class,'Carousel__children-container')]//div[1]//div[2]//div[1]//div[1]//div[1]//div[6]//div[1]//button[1]")
    WebElement selectPlan;
    @FindBy(how = How.XPATH,using = "//body[contains(@class,'attgn-page')]/div[@id='root']/div/div[contains(@class,'Canvas__canvas')]/div[contains(@class,'Offer__canvas-content')]/div/div/div[contains(@class,'WirelessConsole__wireless-console')]/div[contains(@class,'WirelessConsole__wireless-container WirelessConsole__buyflow-container')]/div[contains(@class,'Console__console')]/div/div/div/div/div/div/div[contains(@class,'DeviceContainer__device-container')]/div[@id='deviceCarousel']/div/div[contains(@class,'Carousel__carousel-container Carousel__overflowed')]/div[contains(@class,'')]/div[contains(@class,'')]/div[contains(@class,'')]/div[contains(@class,'Carousel__children-container')]/div[1]/div[3]/div[2]/div[1]")
    WebElement chosePlan;
    @FindBy(how =How.XPATH,using = "//div[contains(@class,'DeviceConfig__desktop-and-mobile')]//div[contains(@class,'DeviceConfig__pad-components')]//section[contains(@class,'DeviceConfig__device-cta')]//div//div//button[contains(@class,'')][contains(text(),'Select')]")
    WebElement select;
    @FindBy(how=How.XPATH,using = "//div[contains(@class,'PriceBarDesktop__price-bar-button')]")
    WebElement goToCart;
    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Check out')]")
    WebElement checkOut;

    public void buyPhone() throws InterruptedException {
        CommonAPI.sleepFor(5);
        hamburgerlink.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", buyPhone);
        executor.executeScript("arguments[0].click();", exploreAt);
        CommonAPI.sleepFor(5);
        executor.executeScript("arguments[0].click();", shopNow);
        selectPlan.click();
        CommonAPI.sleepFor(3);
        chosePlan.click();
        select.click();
        CommonAPI.sleepFor(5);
        goToCart.click();
        CommonAPI.sleepFor(6);
        checkOut.click();
        System.out.println(driver.getTitle());
        }

    }

