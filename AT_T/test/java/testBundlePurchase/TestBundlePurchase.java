package testBundlePurchase;

import base.CommonAPI;
import bundlePurchase.BundlePurchase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestBundlePurchase extends CommonAPI {

    @Test
    public void buyTvInternetBundle() throws InterruptedException {
        BundlePurchase tvInternet = PageFactory.initElements(driver, BundlePurchase.class);
        tvInternet.buyTheTVAndInternet();
    }

}
