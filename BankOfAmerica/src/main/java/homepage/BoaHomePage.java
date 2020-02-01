package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class BoaHomePage extends CommonAPI{

    @FindBy(how = How.ID, using = "NAV_PERSONAL")
    public static WebElement personalWebElement;

    @FindBy(how = How.CSS, using = "#NAV_BUSINESS_ADVANTAGE")
    public static WebElement smallBusinessWebElement;

    @FindBy(how = How.CSS, using = "#NAV_WEALTH_MANAGEMENT")
    public static WebElement wealthManagemetWebElement;

    @FindBy(how = How.CSS, using = "#NAV_BUSINESS_INSTITUTIONS")
    public static WebElement businessInstitutionWebElement;

    @FindBy(how = How.ID, using = "NAV_SECURITY")
    public static WebElement securityWebElement;

    @FindBy(how = How.LINK_TEXT, using = "About Us")
    public static WebElement aboutUsWebElement;

    @FindBy(how = How.CSS, using = "#NAV_EN_ES")
    public static WebElement enEspanolWebElement;

    @FindBy(how = How.CSS, using = "#NAV_CONTACT_US")
    public static WebElement contactUsWebElement;

    @FindBy(how = How.CSS, using = "#NAV_HELP")
    public static WebElement helpnWebElement;

    @FindBy(how = How.XPATH, using = "//input[@id='nav-search-query' and @class='search-query']")
    public static WebElement helpSearchBarWebElement;

    @FindBy(how = How.CSS, using = ".submit")
    public static WebElement helpSearchButtonWebElement;

    @FindBy(how = How.XPATH, using = "//a[@class='track-me' and @name='Search Module - Top Result - See More Search Results']")
    public static WebElement viewAllSearchWebElement;

    @FindBy(how = How.CSS, using = ".search-form")
    public static WebElement popUpHelpSuggestionsWebElement;

    @FindBy(how = How.CSS, using = "a[name='Search Module - Feedback']")
    public static WebElement feedbackWebElement;


    @FindBy(how = How.LINK_TEXT, using ="Locations")
    public static WebElement locationFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Contact Us")
    public static WebElement contactUsFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Help")
    public static WebElement helpFooterWebElement;

    @FindBy(how = How.XPATH, using ="//*[@id=footer_bofa_careers]")
    public static WebElement accessibleBankingFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_careers")
    public static WebElement carrearsFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_privacy_and_security")
    public static WebElement privacySecurityFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_mcafee_internet_security")
    public static WebElement mcafeeFooterWebElement;

    @FindBy(how = How.ID, using ="footer_bofa_sitemap")
    public static WebElement sitemapFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Advertising Practices")
    public static WebElement advertisingPracticeFooterWebElement;

    @FindBy(how = How.XPATH, using ="//*[@id=footer_bofa_feedback]")
    public static WebElement feedbackFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using ="View Full Online Banking Site")
    public static WebElement onlineBankingLinkrWebElement;


    @FindBy(how = How.CSS, using ="#social_follow_facebook_link > svg:nth-child(1) > g:nth-child(1) > path:nth-child(1)")
    public static WebElement followFacebookWebElement;

    @FindBy(how = How.XPATH, using ="//a[@id='social_follow_instagram_link' and @class='boa-social--network boa-social--instagram']")
    public static WebElement followInstagramWebElement;

    @FindBy(how = How.CSS, using ="#social_follow_linkedin_link")
    public static WebElement followLinkedinWebElement;

    @FindBy(how = How.CSS, using ="#social_follow_pinterest_link")
    public static WebElement followPinterestWebElement;

    @FindBy(how = How.CSS, using ="#social_follow_twitter_link")
    public static WebElement followTwitterWebElement;

    @FindBy(how = How.CSS, using ="#social_follow_youtube_link")
    public static WebElement followYoutubeWebElement;

    @FindBy(how = How.CSS, using =".equalhousing-container")
    public static WebElement equalHousingWebElement;

    public void helpSearchBarClick(){
        helpSearchBarWebElement.click();
    }



    public WebElement getHelpSearchButtonWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return helpSearchButtonWebElement;
    }
}
