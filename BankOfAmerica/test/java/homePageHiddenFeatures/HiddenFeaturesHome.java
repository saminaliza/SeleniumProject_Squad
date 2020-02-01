package homePageHiddenFeatures;

import base.CommonAPI;
import homepage.BoaHomeHiddenFeatures;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HiddenFeaturesHome extends CommonAPI{

    @Test //( enabled=false )
    //checks if the hidden menu appears on clicking the checking tab.
    public void checkingFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.checkingClick();
        waitUntilVisible(By.cssSelector("#navCheckingContent > div:nth-child(2)"));
        Assert.assertEquals(bhhf.checkingHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test //( enabled=false )
    //checks if the hidden menu appears on clicking the saving tab.
    public void savingFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.savingClick();
        sleepFor(2);
        Assert.assertEquals(bhhf.savingHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test //( enabled=false )
    //checks if the hidden menu appears on clicking the Credit Card tab.
    public void creditCardFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.creditCardClick();
        sleepFor(2);
        Assert.assertEquals(bhhf.creditCardsHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test //( enabled=false )
    //checks if the hidden menu appears on clicking the Home Loans tab.
    public void homeLoansFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.homeLoansClick();
        sleepFor(2);
        Assert.assertEquals(bhhf.homeLoansHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test// ( enabled=false )
    //checks if the hidden menu appears on clicking the Auto Loans tab.
    public void autoLoansFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.autoLoanClick();
        sleepFor(2);
        Assert.assertEquals(bhhf.autoLoansHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test //( enabled=false )
    //checks if the hidden menu appears on clicking the Investing Loans tab.
    public void investingFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.investingClick();
        sleepFor(2);
        Assert.assertEquals(bhhf.investingHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test //( enabled=false )
    //checks if the hidden menu appears on clicking the Better Money Habits tab.
    public void betterMoneyHabitsFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.betterMoneyHabitsClick();
        sleepFor(2);
        Assert.assertEquals(bhhf.betterMoneyHabbitsHiddenMenuWebElement.isDisplayed(), true);
    }
}
