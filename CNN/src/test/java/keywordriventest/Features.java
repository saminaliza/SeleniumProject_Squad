package keywordriventest;

import CnnPageTest.CnnHomePage;
import base.CommonAPI;
import keywordriven.KeywordDriven;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {

    CnnHomePage searchItems1 = PageFactory.initElements(driver, CnnHomePage.class);
    CnnHomePage signIn2 = PageFactory.initElements(driver, CnnHomePage.class);


    public void searchForNews(WebDriver driver1) throws InterruptedException {
        searchItems1.searchItem("world news");
    }


    public void signInNewsletter(WebDriver driver1) throws InterruptedException {
       signIn2.signUpNewsletterButton("abc@gmail.com");
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "search":
                searchForNews(driver1);
                break;
            case "signUp":
                signInNewsletter(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver) throws IOException, InterruptedException {
        KeywordDriven searchItems = new KeywordDriven();
        String[] testSteps = KeywordDriven.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }


}