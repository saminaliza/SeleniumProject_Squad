package amazonTodaysDeal;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDealPage extends CommonAPI {

    @FindBy(linkText = "Amazon Devices")
    WebElement amazonDevice;

    @FindBy(linkText = "Computers & Accessories")
    WebElement computerNAccessories;

    @FindBy(linkText = "Electronics")
    WebElement electronics;

    @FindBy(linkText = "Beauty")
    WebElement beauty;

    @FindBy(linkText = "Toys & Games")
    WebElement toysNgames;

    @FindBy(linkText = "Fashion")
    WebElement fashion;

    @FindBy(linkText = "Home")
    WebElement home;

    @FindBy(linkText = "Sports & Outdoors")
    WebElement sportsNOutdoors;

    @FindBy(linkText = "Kitchen")
    WebElement kitchen;

    @FindBy(linkText = "Lawn & Garden")
    WebElement lawnNGarden;

    public void goToTodaysDeal() {
        clickOnElement("//*[@id=\"nav-xshop\"]/a[1]");
    }

    public void shopDeviceFromTodaysDeal() {
        goToTodaysDeal();
        amazonDevice.click();
    }

    public void findComputerAccessoriesDeal() {
        goToTodaysDeal();
        computerNAccessories.click();
    }

    public void findElectronicsDeal() {
        goToTodaysDeal();
        electronics.click();
    }

    public void findBeautyDeal() {
        goToTodaysDeal();
        beauty.click();
    }

    public void findToysDeal() {
        goToTodaysDeal();
        toysNgames.click();
    }

    public void findFashionDeal() {
        goToTodaysDeal();
        fashion.click();
    }

    public void findSportsDeal() {
        goToTodaysDeal();
        sportsNOutdoors.click();
    }

    public void findHomeDeal() {
        goToTodaysDeal();
        home.click();
    }

    public void findKitchenDeal() {
        goToTodaysDeal();
        kitchen.click();
    }

    public void findLawnNGardenDeal() {
        goToTodaysDeal();
        lawnNGarden.click();
    }
}
