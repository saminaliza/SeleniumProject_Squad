package amazonTodaysDealTest;

import amazonTodaysDeal.TodaysDealPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TodaysDealPageTest extends CommonAPI {

    @Test
    public void userCanCheckTodaysDealItems() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.goToTodaysDeal();
    }

    @Test
    public void userCanShopFromDeviceDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.shopDeviceFromTodaysDeal();
    }

    @Test
    public void userCanShopFromElectronicsDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findElectronicsDeal();
    }

    @Test
    public void userCanShopFromComputerNAccessoriesDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findComputerAccessoriesDeal();
    }

    @Test
    public void userCanShopFromFashionDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findFashionDeal();
    }

    @Test
    public void userCanShopFromToysNGamesDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findToysDeal();
    }

    @Test
    public void userCanShopFromBeautyDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findBeautyDeal();
    }

    @Test
    public void userCanShopFromSportsItemDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findSportsDeal();
    }

    @Test
    public void userCanShopFromHomeDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findHomeDeal();
    }

    @Test
    public void userCanShopFromKitchenDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findKitchenDeal();
    }

    @Test
    public void userCanShopFromLawnNGardenDeals() {
        TodaysDealPage deal = PageFactory.initElements(driver, TodaysDealPage.class);
        deal.findLawnNGardenDeal();
    }
}
