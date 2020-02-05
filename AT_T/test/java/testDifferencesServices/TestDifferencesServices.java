package testDifferencesServices;

import base.CommonAPI;
import differencesServices.DifferencesServices;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestDifferencesServices extends CommonAPI {
    @Test
    public void differenentVideos() throws InterruptedException {
        DifferencesServices ds = PageFactory.initElements(driver,DifferencesServices.class);
        ds.findDifferenences();

    }
}
