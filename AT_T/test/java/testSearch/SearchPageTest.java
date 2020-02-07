package testSearch;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import searchPage.SearchPage;


public class SearchPageTest extends CommonAPI {
    @Test(priority = 1)
    public void userCanSearchForItems() {
        SearchPage search = PageFactory.initElements(driver, SearchPage.class);
        search.searchIphone();
    }
    @Test(priority = 2)
    public void userCanSearchiPad() {
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchIpad();
    }
    @Test(priority = 3)
    public void userCanSearchHeadPhones() {
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchHeadphone();
    }
    @Test(priority = 4)
    public void userCanSearchWallCharger(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchWallCharger();
    }
    @Test(priority = 5)
    public void userCanSearchForWirelessCharger(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchWallCharger();
    }
    @Test(priority = 6)
    public void userCanSearchForPencil(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchApplePencil();
    }
    @Test(priority = 7)
    public void userCanSearchForKeyBoard(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchIpadKeyboard();
    }
    @Test(priority = 8)
    public void userCanSearchForKeyBoardToo(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchIpad12KeyBoard();
    }
    @Test(priority = 9)
    public void userCanSearchForCase(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchIphoneCaseSaddleBrown();
    }
    @Test(priority = 10)
    public void userCanSearchClearCase(){
        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
        search.searchIphoneClearCase();
    } }
//    @Test(priority = 11)
//    public void userCanSearchForSiliconCase(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPhone 11 Pro Silicone Case - Pink Sand");
//    }
//    @Test(priority = 12)
//    public void userCanSearchForProCase(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Speck Black Presidio Pro Case - iPhone X");
//    }
//    @Test(priority = 13)
//    public void specialCharger(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("AT&T Game of Thrones(TM) Limited Edition Wireless Charging Iron Throne - Silver");
//    }
//      @Test(priority =14 )
//    public void searchForiPad(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad 10.2-inch");
//    }
//    @Test(priority = 15 )
//    public void searchForiPadminit(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad mini");
//    }
//    @Test(priority = 16 )
//    public void searchForIpadPro(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Pro 12.9-inch");
//    } @Test(priority = 17 )
//    public void searchForiPadAir(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Air");
//    } @Test(priority = 18 )
//    public void searchForiPadProtoo(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Pro 11-inch");
//    } @Test(priority = 19 )
//    public void searchipad11(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Pro 11-inch - 64GB - Space Gray");
//    } @Test(priority = 20)
//    public void searchiPad1TB(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Pro 11-inch - 1TB - Silver");
//    } @Test(priority = 21 )
//    public void searchiPad512GB(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Pro 11-inch - 512GB - Silver");
//    } @Test(priority = 22 )
//    public void searchGrayiPad(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple iPad Pro 12.9-inch (3rd generation) - 256GB - Space Gray");
//    }
//
//    @Test(priority =23 )
//    public void searchWatch(){
//      SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//      search.searchForItem("Apple Watch Series 3 - 38mm - Silver Aluminum - White Sport");
//   }
//    @Test(priority =24 )
//    public void searchBlackWatch(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 - 40mm - Space Black Stainless - Black Sport");
//    }
//    @Test(priority = 25)
//    public void searchGrayWatch(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 44mm - Space Gray Aluminum - Black Sport");
//    }
//    @Test(priority = 26 )
//    public void searchGoldWatch(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 40mm - Gold Aluminum - Pink Sand Sport");
//    }
//    @Test(priority = 27 )
//    public void searchSilverWatch(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 44mm - Silver Aluminum - White Sport");
//    }
//    @Test(priority = 28 )
//    public void searchStoneSport(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 40mm - Gold Stainless- Stone Sport");
//    }
//    @Test(priority = 29 )
//    public void searchWhiteSport(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 40mm - Silver Aluminum - White Sport");
//    } @Test(priority = 30 )
//    public void searchBlackMilanese(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 44mm - Space Black Stainless - Black Milanese");
//    } @Test(priority = 31)
//    public void searchBlackSport(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 5 40mm - Space Gray Aluminum - Black Sport");
//    } @Test(priority = 32)
//    public void searchPlatinumBlack(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Nike Series 5 - 44mm - Silver Aluminum - Platinum Black");
//    }
//    @Test(priority = 33 )
//    public void searchAnthraciteBlack(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Nike Series 5 - 44mm - Space Gray Aluminum - Anthracite Black");
//    }
//
//
//    @Test(priority = 34)
//    public void searchBlackSportBand(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple Watch Series 3 - 42mm - Space Gray Aluminum - Black Sport Band");
//    }
//    @Test(priority = 35)
//    public void searchAnthraciteSport(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Apple¿Watch Series¿3 Nike+ - 38mm - Space Gray Aluminum - Anthracite Sport");
//    }
//    @Test(priority = 36 )
//    public void searchTravelStand(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Belkin Travel Stand for Apple Watch - Black");
//    }
//    @Test(priority = 37 )
//    public void searchChargingStation(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Scosche BaseLynx Watch Apple Watch Charging Station - Black");
//    }
//    @Test(priority = 38)
//    public void searchChargingCable(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("AT&T Braided Charging Cable - Apple Watch");
//    }
//    @Test(priority = 39)
//    public void searchRoseGoldCable(){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Belkin DuraTek Apple Watch Charge Cable - Rose Gold");
//    }
//    @Test(priority = 40)
//    public void searchDockPlusCharging (){
//        SearchPage search = PageFactory.initElements(driver,SearchPage.class);
//        search.searchForItem("Belkin White Wireless Charging Dock Plus Apple Watch Charge");
//    }
//
//}



