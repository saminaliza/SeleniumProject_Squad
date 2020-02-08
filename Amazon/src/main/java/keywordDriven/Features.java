package keywordDriven;

import amazonHomePage.HomePage;
import amazonSignIn.SignInPage;
import amazonSignUp.SignUpPage;
import base.CommonAPI;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Features extends CommonAPI {

    HomePage home = PageFactory.initElements(driver, HomePage.class);
    SignUpPage sigUp = PageFactory.initElements(driver, SignUpPage.class);
    SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);

    public void searchItems(WebDriver driver1) throws InterruptedException {
        home.searchItems("books");
    }

    public void signUpOnAmazon(WebDriver driver1) throws InterruptedException {
        sigUp.createAccount("John Doe", "myautotestmail2020@gmail.com", "test2055");
    }

    public void signInAmazon(WebDriver driver1) throws InterruptedException {
        signIn.signIn("myautotestmail2020@gmail.com", "test2055");
    }

    public void select(String featureName, WebDriver driver1) throws IOException, InterruptedException, InvalidArgumentException {
        switch (featureName) {
            case "search":
                searchItems(driver1);
                break;
            case "signUp":
                signUpOnAmazon(driver1);
                break;
            case "signIn":
                signInAmazon(driver1);
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }

    public void selectFeatures(WebDriver driver) throws IOException, InterruptedException {
        KeywordSearchPage searchItems = new KeywordSearchPage();
        String[] testSteps = KeywordSearchPage.getDataFromExcelFileForFeaturesChoice();
        for (int i = 1; i < testSteps.length; i++) {
            select(testSteps[i], driver);
        }
    }


}
