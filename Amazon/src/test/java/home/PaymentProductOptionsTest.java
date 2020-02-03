package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PaymentProductOptionsTest extends CommonAPI {
    @Test
    public void testUserCanNavigateToRewardVisaSignatureCard(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToSignatureRewardCardOption();
    }
    @Test
    public void testUserCanNavigateToStoreCardPage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToStoreCardOption();
    }
    @Test
    public void testUserCanNavigateToBusinessCardPage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToBusinessCardOption();
    }
    @Test
    public void testUserCanNavigateToCorporateCreditCardLinePage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToCorporateCreditCardLineOption();
    }
    @Test
    public void testUserCanNavigateToShopWithPointPage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToShopWithPointOption();
    }
    @Test
    public void testUserCanNavigateToCreditCardMarketplacePage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToCreditCardMarketplaceOption();
    }
    @Test
    public void testUserCanNavigateToReloadBalancePage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToReloadBalanceOption();
    }
    @Test
    public void testUserCanNavigateToAmazonCurrencyConverterPage(){
        PaymentProductsOptions paymentProductsOptions = PageFactory.initElements(driver,PaymentProductsOptions.class);
        paymentProductsOptions.canGoToAmazonCurrencyConverterOption();
    }
}
