package amazonTodaysDealTest;

import amazonTodaysDeal.TodaysDealPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TodaysDealPageTest extends CommonAPI {

    @Test
    public void userCanCheckTodaysDealItems(){
        TodaysDealPage deal = PageFactory.initElements(driver,TodaysDealPage.class);
        deal.goToTodaysDeal();
    }

}
