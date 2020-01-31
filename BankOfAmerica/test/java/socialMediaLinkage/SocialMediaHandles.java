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
        sleepFor(4);
        bhp.followFacebookWebElement.click();
        sleepFor(3);
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

}
