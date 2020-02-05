package feedback;

import base.CommonAPI;
import homepage.BoaHomePage;
import homepage.CommentCard;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class ContactUsCommentCard extends CommonAPI {


    private String sucessfulSubmissionTitle = "Your submission has been received.";

    public String getSucessfulSubmissionTitle() {
        return sucessfulSubmissionTitle;
    }

    public String actualSucessfulSubmissionTitlePage(String searchBarValue3) throws InterruptedException {
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue3);
        waitUntilVisible(By.className("results-heading"));
        bhp.helpSearchBarClick();
        bhp.feedbackWebElement.click();
        handleNewTab(driver);
        CommentCard cc=PageFactory.initElements(driver, CommentCard.class);
        cc.contentRadio4Click();
        cc.layoutRadio5Click();
        cc.easeOfUseRadio4Click();
        cc.overallUseRadio5Click();
        typeOnElement(".large", "Good site, easy to fetch informations.");
        cc.submitClick();
        String actualSuccessfulSubmissionTitle=driver.getTitle();
        cc.closeWindowClick();
        return actualSuccessfulSubmissionTitle;
    }
}
