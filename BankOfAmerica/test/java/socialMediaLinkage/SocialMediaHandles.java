package socialMediaLinkage;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SocialMediaHandles extends CommonAPI {

    @Test ( enabled=false )
    //Checks if confirmation window pops up on clicking the Facebook follow icon
    public void facebookFollowIcon() throws InterruptedException {
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followFbClick();
        sleepFor(6);
        isPopUpWindowDisplayed(driver,"#boaSocialModal_link > h3:nth-child(1)");
    }
    @Test ( enabled=false )
    //Checks if confirmation window pops up on clicking the Instagram follow icon
    public void instagramFollowIcon() throws InterruptedException {
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        sleepFor(2);
        bhp.followInstagramWebElement.click();
        waitUntilClickAble(By.cssSelector("#boaSocialModal_link_Continue"));
        isPopUpWindowDisplayed(driver,".spa-close-x");
    }

    @Test//(enabled = false)
    public void followFbClickTest(){
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followFbClick();
    }
    @Test(enabled = false)
    public void followInstagaramClickTest(){
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followInstagramClick();
    }
    @Test(enabled = false)
    public void followLinkedIdClickTest(){
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followLinkedInClick();
    }
    @Test(enabled = false)
    public void followTwitterClickTest(){
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followTwitterClick();
    }
    @Test (enabled = false)
    public void followPinterestClickTest(){
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followPinterestClick();
    }
    @Test(enabled = false)
    public void followYouTubeClickTest(){
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.followYouTubeClick();
    }

}
