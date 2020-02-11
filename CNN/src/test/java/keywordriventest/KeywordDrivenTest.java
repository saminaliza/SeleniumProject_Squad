package keywordriventest;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class KeywordDrivenTest extends CommonAPI {


    @Test
    public void testKeyWord() throws InterruptedException, IOException {
        Features features = PageFactory.initElements(driver, Features.class);
        features.selectFeatures(driver);
    }

    @Test
    public void testSearch() throws InterruptedException {
        Features features = PageFactory.initElements(driver, Features.class);
        features.searchForNews(driver);

    }
}