package testSetUpVoiceMail;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import setUpVoiceMail.SetUpVoiceMail;

public class TestSetUpVoiceMail extends CommonAPI {

   @Test
    public void setUpVoiceMail(){
       SetUpVoiceMail svm = PageFactory.initElements(driver,SetUpVoiceMail.class);
       svm.setUpV();
   }
}
