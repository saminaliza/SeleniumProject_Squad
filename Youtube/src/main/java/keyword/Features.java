package keyword;

import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import signIn.SignInPage;

import java.io.IOException;

public class Features extends CommonAPI{

    SignInPage sip =PageFactory.initElements(driver, SignInPage.class);

    public void select(String featureName, WebDriver driver1)throws IOException, InterruptedException{
        switch(featureName){
            case "signInWrongEmail":
                sip.wrongEmailSignIn();
                break;
            case "signInWrongPassword":
                sip.wrongPasswordSignIn();
                break;
            case "signInCapsEmail":
                sip.capsEmailSignIn();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver1)throws IOException, InterruptedException{
        ItemsToBeSearched itemsToBeSearched = new ItemsToBeSearched();
        String [] testSteps = itemsToBeSearched.getDataFromExcelFileForFeaturesChoice();
        for(int i=1; i<testSteps.length; i++) {
            select(testSteps[i], driver1);
        }
    }

}
