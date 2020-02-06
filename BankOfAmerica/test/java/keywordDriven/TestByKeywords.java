package keywordDriven;

import base.CommonAPI;
import keyword.Features;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestByKeywords extends CommonAPI {

    @Test//(enabled = false)
    public void testKeyWord()throws InterruptedException, IOException {
        Features features = PageFactory.initElements(driver, Features.class);
        features.selectFeatures(driver);
    }
}
