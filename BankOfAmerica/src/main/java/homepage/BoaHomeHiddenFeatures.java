package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BoaHomeHiddenFeatures extends CommonAPI {

    @FindBy(how = How.ID, using ="navChecking")
    public static WebElement checkingWebElement;

    @FindBy(how = How.CSS, using ="#navCheckingContent > div:nth-child(2)")
    public static WebElement checkingHiddenMenuWebElement;

    @FindBy(how = How.ID, using ="navSavings")
    public static WebElement savingWebElement;

    @FindBy(how = How.CSS, using ="#navSavingsContent > div:nth-child(2) > div:nth-child(1)")
    public static WebElement savingHiddenMenuWebElement;

    @FindBy(how = How.ID, using ="navCreditCards")
    public static WebElement creditCardsWebElement;

    @FindBy(how = How.CSS, using ="#navCreditCardsContent")
    public static WebElement creditCardsHiddenMenuWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Home Loans")
    public static WebElement homeLoansWebElement;

    @FindBy(how = How.CSS, using ="#navHomeLoansContent")
    public static WebElement homeLoansHiddenMenuWebElement;

    @FindBy(how = How.CSS, using ="#navAutoLoans")
    public static WebElement autoLoansWebElement;

    @FindBy(how = How.CSS, using ="#navAutoLoansContent > div:nth-child(2) > div:nth-child(1)")
    public static WebElement autoLoansHiddenMenuWebElement;

    @FindBy(how = How.CSS, using ="#navInvesting")
    public static WebElement investingWebElement;

    @FindBy(how = How.CSS, using ="#navInvestingContent > div:nth-child(2)")
    public static WebElement investingHiddenMenuWebElement;

    @FindBy(how = How.LINK_TEXT, using ="Better Money Habits®")
    public static WebElement betterMoneyHabitsWebElement;

    @FindBy(how = How.CSS, using ="#navBetterMoneyHabitsContent > div:nth-child(2)")
    public static WebElement betterMoneyHabitsHiddenMenuWebElement;

    public void checkingClick(){
        checkingWebElement.click();
    }
    public void savingClick(){
        savingWebElement.click();
    }
    public void creditCardClick(){
        creditCardsWebElement.click();
    }
    public void homeLoansClick(){
        homeLoansWebElement.click();
    }
    public void autoLoanClick(){
        autoLoansWebElement.click();
    }
    public void investingClick(){
        investingWebElement.click();
    }
    public void betterMoneyHabitsClick(){
        betterMoneyHabitsWebElement.click();
    }

    public  boolean checkingMenuIsDisplayed(){
        checkingWebElement.click();
        waitUntilVisible(By.cssSelector("#navCheckingContent > div:nth-child(2)"));
        boolean checkigDisplay = checkingHiddenMenuWebElement.isDisplayed();
        return checkigDisplay;
    }
    public  boolean savingMenuIsDisplayed(){
        savingWebElement.click();
        waitUntilVisible(By.cssSelector("#navSavingsContent > div:nth-child(2) > div:nth-child(1)"));
        boolean savingDisplay = savingHiddenMenuWebElement.isDisplayed();
        return savingDisplay;
    }
    public  boolean CreditCardMenuIsDisplayed(){
        creditCardsWebElement.click();
        waitUntilVisible(By.cssSelector("#navCreditCardsContent"));
        boolean creditCardDisplay = creditCardsHiddenMenuWebElement.isDisplayed();
        return creditCardDisplay;
    }
    public  boolean HomeLoanMenuIsDisplayed(){
        homeLoansWebElement.click();
        waitUntilVisible(By.cssSelector("#navHomeLoansContent"));
        boolean HomeLoanDisplay = homeLoansHiddenMenuWebElement.isDisplayed();
        return HomeLoanDisplay;
    }
    public  boolean autoLoansMenuIsDisplayed(){
        autoLoansWebElement.click();
        waitUntilVisible(By.cssSelector("#navAutoLoansContent > div:nth-child(2) > div:nth-child(1)"));
        boolean autoLoansDisplay = autoLoansHiddenMenuWebElement.isDisplayed();
        return autoLoansDisplay;
    }
    public  boolean investingMenuIsDisplayed(){
        investingWebElement.click();
        waitUntilVisible(By.cssSelector("#navInvestingContent > div:nth-child(2)"));
        boolean investingDisplay = investingHiddenMenuWebElement.isDisplayed();
        return investingDisplay;
    }
    public  boolean betterMoneyHabitsMenuIsDisplayed(){
        betterMoneyHabitsWebElement.click();
        waitUntilVisible(By.cssSelector("#navBetterMoneyHabitsContent > div:nth-child(2)"));
        boolean betterMoneyHabitsDisplay = betterMoneyHabitsHiddenMenuWebElement.isDisplayed();
        return betterMoneyHabitsDisplay;
    }
}
