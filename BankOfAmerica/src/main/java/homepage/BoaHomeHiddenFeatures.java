package homepage;

import base.CommonAPI;
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
    public static WebElement betterMoneyHabbitsWebElement;

    @FindBy(how = How.CSS, using ="#navBetterMoneyHabitsContent > div:nth-child(2)")
    public static WebElement betterMoneyHabbitsHiddenMenuWebElement;
}
