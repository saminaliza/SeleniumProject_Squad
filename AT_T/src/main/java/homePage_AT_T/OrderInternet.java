package homePage_AT_T;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OrderInternet extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//a[contains(@class,'_20CgK _1hxmk')]//span[contains(@class,'')][contains(text(),'Wireless')]")
    WebElement order_Wireless;
    //@FindBy(how = How.XPATH,using = "//*[@id=\'LINKFARM15items00\']/span/a/span")
    @FindBy(how =How.LINK_TEXT,using = "Upgrade my phone")
    WebElement upGrade;
    @FindBy(how=How.XPATH,using = "//div[contains(@class,'solidBtn')]//a[contains(@class,'')][contains(text(),'Shop now')]")
    WebElement shopNow;
    @FindBy(how=How.XPATH,using = "//a[contains(text(),'Continue without signing in')]")
    WebElement continueWithoutSigning;
    @FindBy(how = How.XPATH,using = "//span[@class='z1-support-text']")
    WebElement support;
    @FindBy(how =How.XPATH,using = "//a[contains(text(),'View my bill')]")
    WebElement viewBill;
    @FindBy(how = How.XPATH,using = "//a[@class='watch-tv-link']")
    WebElement business;
    @FindBy(how =How.XPATH,using = "//span[contains(text(),'DIRECTV For Business')]")
    WebElement directTV;
    @FindBy(how = How.XPATH,using = "//button[contains(text(),'Shop DIRECTV')]")
    WebElement shopTV;
    @FindBy(how = How.XPATH,using = "//*[@id=\"fsrFocusFirst\"]/svg")
    WebElement popUp;
    @FindBy(how = How.XPATH,using = "//div[@id='pkg-btn-BAR']//img")
    WebElement restauran;
    @FindBy(how = How.XPATH,using = "//div[@class='width-33 card-col']//div[@id='product-card-wrapper-B-P-BS-1-19-3']//div[@class='product-card']//button[@class='btn-primary cta-button'][contains(text(),'Add to cart')]")
    WebElement addToCart;
    @FindBy(how =How.XPATH,using = "//button[@class='btn btn-primary continue']")
    WebElement cart_Too;

    public void clickUpGrade(){
        upGrade.click();
    }
    public void wire_Less() {
        order_Wireless.click();
    }
    public void clickShopNow(){
        shopNow.click();
    }
    public void clickContinueWIthOutSigning(){
        continueWithoutSigning.click();
    }
    public void clickSupport(){
        support.click();
    }
    public void clickViewBill(){
        viewBill.click();
    }
    public void clickBusiness(){
        business.click();
    }
    public void clickDirectTV(){
        directTV.click();
    }
    public void clickPopUp(){
        popUp.click();
    }
    public void shpTV(){
        shopTV.click();
    }
    public void chooseRes(){
        restauran.click();
    }
    public void clickToAdd(){
        addToCart.click();
    }
    public void cart_Add(){
        cart_Too.click();
    }










}
