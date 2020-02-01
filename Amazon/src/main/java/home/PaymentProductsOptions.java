package home;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentProductsOptions extends CommonAPI {
    @FindBy(linkText = "Amazon Rewards Visa Signature Cards")
    WebElement signatureCardsLink;
    @FindBy(linkText="Amazon.com Store Card")
    WebElement storeCardLink;
    @FindBy(linkText="Amazon Business Card")
    WebElement businessCardLink;
    @FindBy(linkText="Amazon.com Corporate Credit Line")
    WebElement corporateCreditLink;
    @FindBy(linkText="Shop with Points")
    WebElement shopPntLink;
    @FindBy(linkText = "Credit Card Marketplace")
    WebElement marketPlaceLink;
    @FindBy(linkText = "Reload Your Balance")
    WebElement reloadBalanceLink;
    @FindBy(linkText = "Amazon Currency Converter")
    WebElement currencyConverterLink;
    public void canGoToSignatureRewardCardOption(){
        signatureCardsLink.click();
    }
    public void canGoToStoreCardOption(){
        storeCardLink.click();
    }
    public void canGoToBusinessCardOption(){
        businessCardLink.click();
    }
    public void canGoToCorporateCreditCardLineOption(){
        corporateCreditLink.click();
    }
    public void canGoToShopWithPointOption(){
        shopPntLink.click();
    }
    public void canGoToCreditCardMarketplaceOption(){
        marketPlaceLink.click();
    }
    public void canGoToReloadBalanceOption(){
        reloadBalanceLink.click();
    }
    public void canGoToAmazonCurrencyConverterOption(){
        currencyConverterLink.click();
    }
}
