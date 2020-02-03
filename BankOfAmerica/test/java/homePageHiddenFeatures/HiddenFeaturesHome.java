package homePageHiddenFeatures;

import base.CommonAPI;
import homepage.BoaHomeHiddenFeatures;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HiddenFeaturesHome extends CommonAPI{

    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the checking tab.
    public void checkingFunctionality(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.checkingMenuIsDisplayed(), true);
    }
    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the saving tab.
    public void savingFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.savingMenuIsDisplayed(), true);
    }
    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the Credit Card tab.
    public void creditCardFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.CreditCardMenuIsDisplayed(), true);
    }
    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the Home Loans tab.
    public void homeLoansFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.HomeLoanMenuIsDisplayed(), true);
    }
    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the Auto Loans tab.
    public void autoLoansFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.autoLoansMenuIsDisplayed(), true);
    }
    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the Investing Loans tab.
    public void investingFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.investingMenuIsDisplayed(), true);
    }
    @Test ( enabled=false )
    //checks if the hidden menu appears on clicking the Better Money Habits tab.
    public void betterMoneyHabitsFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        BoaHomeHiddenFeatures bhhf =PageFactory.initElements(driver, BoaHomeHiddenFeatures.class);
        Assert.assertEquals(bhhf.betterMoneyHabitsMenuIsDisplayed(), true);
    }
}
