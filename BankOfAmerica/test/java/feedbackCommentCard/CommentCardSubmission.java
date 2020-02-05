package feedbackCommentCard;

import base.CommonAPI;
import feedback.ContactUsCommentCard;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CommentCardSubmission extends CommonAPI{

    @Parameters({"searchBarValue3"})
    @Test ( enabled=false )
    //Positive checks the feedback submission card
    public void contactUsFromCommentCard(String searchBarValue3)throws InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        ContactUsCommentCard cuc = PageFactory.initElements(driver, ContactUsCommentCard.class);
        Assert.assertEquals(cuc.actualSucessfulSubmissionTitlePage(searchBarValue3), cuc.getSucessfulSubmissionTitle() );
    }
}
