package amazonKindleOptionTest;

import amazonKindle.KindleOptions;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KindleOptionsTest extends CommonAPI {

    @Test
    public void userCAnNavigateBackToHamburgerOptionsTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.navigateBackToHamburgerOptions();
    }

    @Test
    public void userCanNavigateToAllKidsKindleEditionPageTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.allKidsKindleEdition();
    }

    @Test
    public void userCanNavigateToKindlePageTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.clickKindleOption();
    }

    @Test
    public void userCanNavigateToKindlePaperWhitePageTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.clickKindlePaperWhiteOption(); //need to check
    }

    @Test
    public void userCanNavigateToKindleBookPageTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.clickKindleBookOption();
    }

    @Test
    public void userCanNavigateToMagazinesPageTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.clickMagazinesOption();
    }

    @Test
    public void userCanNavigateToNewsPapersPageTest() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver, KindleOptions.class);
        kindleOptions.clickNewsPapersOption();
    }
}
