package homePageHiddenFeatures;

import base.CommonAPI;
import homepage.BoaHomeHiddenFeatures;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HiddenFeaturesHome extends CommonAPI{

    @Test ( enabled=false )
    //checking if the hidden menu appears on clicking the checking tab.
    public void checkingFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.checkingWebElement.click();
        waitUntilVisible(By.cssSelector("#navCheckingContent > div:nth-child(2)"));
        Assert.assertEquals(bhhf.checkingHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test ( enabled=false )
    //checking if the hidden menu appears on clicking the saving tab.
    public void savingFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.savingWebElement.click();
        sleepFor(2);
        Assert.assertEquals(bhhf.savingHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test ( enabled=false )
    //checking if the hidden menu appears on clicking the Credit Card tab.
    public void creditCardFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.creditCardsWebElement.click();
        sleepFor(2);
        Assert.assertEquals(bhhf.creditCardsHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test ( enabled=false )
    //checking if the hidden menu appears on clicking the Home Loans tab.
    public void homeLoansFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.homeLoansWebElement.click();
        sleepFor(2);
        Assert.assertEquals(bhhf.homeLoansHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test ( enabled=false )
    //checking if the hidden menu appears on clicking the Auto Loans tab.
    public void autoLoansFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.autoLoansWebElement.click();
        sleepFor(2);
        Assert.assertEquals(bhhf.autoLoansHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test ( enabled=false )
    //checking if the hidden menu appears on clicking the Investing Loans tab.
    public void investingFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.investingWebElement.click();
        sleepFor(2);
        Assert.assertEquals(bhhf.investingHiddenMenuWebElement.isDisplayed(), true);
    }
    @Test //( enabled=false )
    //checking if the hidden menu appears on clicking the Better Money Habits tab.
    public void betterMoneyHabitsFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        bhhf.betterMoneyHabbitsWebElement.click();
        sleepFor(2);
        Assert.assertEquals(bhhf.betterMoneyHabbitsHiddenMenuWebElement.isDisplayed(), true);
    }

}
