package CnnPageTest;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class SubscribeCnn extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"footer-nav-container\"]/div[2]/div/div/nav/ul/li[14]/ul/li[6]/a")
    WebElement subscribeButton;
    @FindBy(xpath = "//*[@id=\"subEmail\"]")
    WebElement emailTextBox;
    @FindBy(id = "/html/body/div[6]/section[1]/div[4]/div[1]/div/button/span")
    WebElement subscribeTab;
    @FindBy(xpath = "/html/body/div[6]/section[1]/div[4]/div[1]/div/button/span")
    WebElement privacyPolicy;

    public void navigateToCnn() {
        driver.get("https://www.cnn.com/");
    }


    public void signUpNewsletterButton(String email) {
        subscribeButton.click();
        emailTextBox.sendKeys(email);
        subscribeTab.click();

    }

    public void goToPrivacy() {
        privacyPolicy.click();
    }

    public void signInWithWrongPassword(String email) throws InterruptedException {
        driver.get("https://www.cnn.com/");
        subscribeButton.sendKeys(email);
        subscribeTab.click();
        Thread.sleep(5000);
    }
}