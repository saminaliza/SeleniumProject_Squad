package videoPageSmallBusiness;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;


public class SmallBusinessVideo extends CommonAPI{

    @FindBy (id="SMB_VH_Homepage_Home")
    WebElement homeTabWebElement;

    @FindBy (id="SMB_VH_Homepage_MostPop")
    WebElement mostPopularTabWebElement;

    @FindBy (id="SMB_VH_Homepage_CashMgmt")
    WebElement cashManagementTabWebElement;

    @FindBy (id="SMB_VH_Homepage_Banking")
    WebElement bankingServicesTabWebElement;

    @FindBy (id="SMB_VH_Homepage_Payroll")
    WebElement payrollServicesTabWebElement;

    @FindBy (id="SMB_VH_Homepage_Resources")
    WebElement resourcesTabWebElement;

    @FindBy (id="SMB_VH_Homepage_Retirement")
    WebElement retirementTabWebElement;

    @FindBy (id="SMB_VH_Homepage_Credit")
    WebElement creditTabWebElement;

    @FindBy (id="SMB_VH_Homepage_BARR")
    WebElement businessAdvantageRelationshipRewardTabWebElement;

    @FindBy (css="a[id='SMB_VH_CardRewards_CP_SubCardBasics']")
    WebElement businessCardBasicsWebElement;

    @FindBy (id="SMB_VH_CardRewards_CP_SubAcctMgmt")
    WebElement accountManagementWebElement;

    @FindBy (id="SMB_VH_CardRewards_CP_SubCardRewards")
    WebElement creditCardRewards;

    @Parameters({"businessAdvantageRewardsUrl"})
    public String businessAdvantageRelationshipRewardsExpectedPageTitle(String businessAdvantageRewardsUrl){
        driver.navigate().to(businessAdvantageRewardsUrl);
        return driver.getTitle();
    }
    public String businessAdvantageRelationshipRewardsPageTitle() {
        businessAdvantageRelationshipRewardTabClick();
        return driver.getTitle();
    }
    @Parameters({"retirementUrl"})
    public String retirementExpectedPageTitle(String retirementUrl){
        driver.navigate().to(retirementUrl);
        return driver.getTitle();
    }
    public String retirementPageTitle() {
        retirementTabClick();
        return driver.getTitle();
    }
    @Parameters({"resourcesUrl"})
    public String resourcesExpectedPageTitle(String resourcesUrl){
        driver.navigate().to(resourcesUrl);
        return driver.getTitle();
    }
    public String resourcesPageTitle() {
        resourcesTabClick();
        return driver.getTitle();
    }
    @Parameters({"payrollServicesUrl"})
    public String payrollServicesExpectedPageTitle(String payrollServicesUrl){
        driver.navigate().to(payrollServicesUrl);
        return driver.getTitle();
    }
    public String payrollServicesPageTitle() {
        payrollServicesTabClick();
        return driver.getTitle();
    }
    @Parameters({"bankingServicesUrl"})
    public String bankingServicesExpectedPageTitle(String bankingServicesUrl){
        driver.navigate().to(bankingServicesUrl);
        return driver.getTitle();
    }
    public String bankingServicesPageTitle() {
        bankingServicesTabClick();
        return driver.getTitle();
    }
    @Parameters({"cashManagementUrl"})
    public String cashManagementExpectedPageTitle(String cashManagementUrl){
        driver.navigate().to(cashManagementUrl);
        return driver.getTitle();
    }
    public String cashManagementPageTitle(){
        cashManagementTabClick();
        return driver.getTitle();
    }
    @Parameters({"mostPopularVideoUrl"})
    public String mostPopularExpectedPageTitle(String mostPopularVideoUrl){
        driver.navigate().to(mostPopularVideoUrl);
        return driver.getTitle();
    }
    public String mostPopularPageTitle() {
       mostPopularTabClick();
        return driver.getTitle();
    }

    public void homeTabClick(){
        homeTabWebElement.click();
    }
    public void mostPopularTabClick(){
        mostPopularTabWebElement.click();
    }
    public void cashManagementTabClick(){
        cashManagementTabWebElement.click();
    }
    public void bankingServicesTabClick(){
        bankingServicesTabWebElement.click();
    }
    public void payrollServicesTabClick(){
        payrollServicesTabWebElement.click();
    }
    public void resourcesTabClick(){
        resourcesTabWebElement.click();
    }
    public void retirementTabClick(){
        retirementTabWebElement.click();
    }

    public void creditTabClick(){
        creditTabWebElement.click();
    }
    public void businessAdvantageRelationshipRewardTabClick(){
        businessAdvantageRelationshipRewardTabWebElement.click();
    }
    public void businessCardBasicsTabClick(){
        businessCardBasicsWebElement.click();
    }
    public void accountManagementTabClick(){
        accountManagementWebElement.click();
    }
    public void creditCardRewardsTabClick(){
        creditCardRewards.click();
    }
}
