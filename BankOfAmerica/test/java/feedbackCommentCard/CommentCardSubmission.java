package feedbackCommentCard;

import base.CommonAPI;
import homepage.BoaHomePage;
import homepage.CommentCard;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CommentCardSubmission extends CommonAPI{
    @Parameters({"searchBarValue3"})
    @Test //( enabled=false )
    //Positive checks the feedback submission card
    public void contactUsFromCommentCard(String searchBarValue3)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomePage bhp =PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue3);
        waitUntilVisible(By.className("results-heading"));
        bhp.helpSearchBarClick();
        handleNewTab(driver);
        CommentCard cc = PageFactory.initElements(driver, CommentCard.class);
        cc.contentRadio4Click();
        cc.layoutRadio5Click();
        cc.easeOfUseRadio4Click();
        cc.overallUseRadio5Click();
        typeOnElement(".large", "Good site, easy to fetch informations.");
        cc.submitClick();
        Assert.assertEquals(driver.getTitle(), cc.getSucessfulSubmissionTitle() );
        cc.closeWindowClick();
    }


}
