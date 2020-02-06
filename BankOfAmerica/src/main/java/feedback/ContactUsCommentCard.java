package feedback;

import base.CommonAPI;
import homepage.BoaHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsCommentCard extends CommonAPI {


    private String sucessfulSubmissionUrl="https://secure.opinionlab.com/ccc01/comment_card_d.asp";

    public String getSucessfulSubmissionUrl() {
        return sucessfulSubmissionUrl;
    }

    @FindBy(xpath="//input[@id='overall_3' and @name='overall']")
    WebElement overAllExperience4WebElement;

    @FindBy(css="input[id='overall_4']")
    WebElement overAllExperience5WebElement;

    @FindBy(xpath="//*[@id=comment_box]")
    WebElement commentBoxWebElement;

    @FindBy(xpath="//*[@id=submit_button]")
    WebElement submitButtonWebElement;


    public String actualSucessfulSubmissionPageUrl(String searchBarValue3) throws InterruptedException {
        BoaHomePage bhp=PageFactory.initElements(driver, BoaHomePage.class);
        bhp.helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue3);
        //waitUntilVisible(By.className("results-heading"));
        bhp.helpSearchBarClick();
        sleepFor(6);
        bhp.feedbackWebElement.click();
        handleNewTab(driver);
        //CommentCard cc=PageFactory.initElements(driver, CommentCard.class);
        sleepFor(4);
//        overAllExperience4Click();
//        cc.layoutRadio5Click();
//        cc.easeOfUseRadio4Click();
//        cc.overallUseRadio5Click();
//        typeOnElement(".large", "Good site, easy to fetch informations.");
//        cc.submitClick();
//        String actualSuccessfulSubmissionTitle=driver.getTitle();
//        cc.closeWindowClick();
//        commentEntry();
        String actualSuccessfulSubmissionUrl=driver.getCurrentUrl();
        return actualSuccessfulSubmissionUrl;
    }

    public void overAllExperience4Click() {
        overAllExperience4WebElement.click();
    }

    public void overAllExperience5Click() {
        overAllExperience5WebElement.click();
    }


    public void commentEntry() {
        commentBoxWebElement.sendKeys("Simple and easy to navigate");
    }

    public void submitButtonClick() {
        submitButtonWebElement.click();
    }
}
