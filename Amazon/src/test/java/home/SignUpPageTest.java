package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpPageTest extends CommonAPI {
    @Test
    public void testUserCanGoToSignUpforAmazonAccount(){
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.canGoToSignUpPage();
    }
    @Test
    public void testUserCanCreateNewrAmazonAccount(){
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.createAccount("John Doe","john11doe200@yahoo.com","Abc78910");
    }
    @Test
    public void testUserCanNavigateToAccountCreationError(){
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.createAccountError("John Doe","john11doe200@yahoo.com","Abc78910");
        boolean error=signUp.errorMessage.isDisplayed();
        Assert.assertEquals(error,true);
    }
    @Test
    public void testUserCanCreateAccountWithAVerificationCode(){
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.createAccountPartWithVerificationCode("John Doe","john11doe200@yahoo.com","Abc78910","004555");
    }
    @Test
    public void testUserCanCreateASecondAccountWithSameEmail(){
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.createAccountWithSameEmail("Johnny1","john11doe200@yahoo.com","Xyx&&22");
    }
    @Test
    public void testUserCanCreateAnotherAcc() throws InterruptedException {
        SignUpPage signUp = PageFactory.initElements(driver,SignUpPage.class);
        signUp.createAccount3("Johnny12","john11doe200@yahoo.com","Xyx&&2263");
    }
}
