package teststoreLocation;

import base.CommonAPI;
import storeLocation.StoreLocation;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestStoreLocation extends CommonAPI {
    @Test
    public void getInfoLocation() throws InterruptedException {
        StoreLocation bp = PageFactory.initElements(driver, StoreLocation.class);
        bp.learBundels();



    }
}
