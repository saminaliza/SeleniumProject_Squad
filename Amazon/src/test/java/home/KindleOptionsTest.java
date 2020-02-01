package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class KindleOptionsTest extends CommonAPI {

    @Test
    public void testUserCanNavigateToPrimeOptionsAndNavigateBackToHamburgerOptions() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.navigateBackToHamburgerOptions();
    }
    @Test
    public void testUserCanNavigateToAllKidsKindleEditionPage() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.allKidsKindleEdition();
    }
    @Test
    public void testUserCanNavigateToKindlePage() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.clickKindleOption();
    }
    @Test
    public void testUserCanNavigateToKindlePaperWhitePage() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.clickKindlePaperWhiteOption();
    }
    @Test
    public void testUserCanNavigateToKindleBookPage() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.clickKindleBookOption();
    }
    @Test
    public void testUserCanNavigateToMagazinesPage() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.clickMagazinesOption();
    }
    @Test
    public void testUserCanNavigateToNewsPapersPage() throws Exception {
        KindleOptions kindleOptions = PageFactory.initElements(driver,KindleOptions.class);
        kindleOptions.clickNewsPapersOption();
    }
}
