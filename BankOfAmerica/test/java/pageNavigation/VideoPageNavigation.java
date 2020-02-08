package pageNavigation;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import videoPageSmallBusiness.SmallBusinessVideo;

public class VideoPageNavigation extends CommonAPI {

    @BeforeMethod
    public void navigate() {
        driver.get("https://promo.bankofamerica.com/small-business-videos/");
    }



    @Parameters({"businessAdvantageRewardsUrl"})
    @Test //(enabled = false)
    //Checks if the 'business Advantage Rewards' tab takes the user to the expected page.
    public void businessAdvantageRelationshipRewardsPageAssertionCheck(String businessAdvantageRewardsUrl){
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        Assert.assertEquals(sbh.businessAdvantageRelationshipRewardsPageTitle(), sbh.businessAdvantageRelationshipRewardsExpectedPageTitle(businessAdvantageRewardsUrl));
    }

    @Parameters({"retirementUrl"})
    @Test //(enabled = false)
    //Checks if the 'banking Services' tab takes the user to the expected page.
    public void retirementPageAssertionCheck(String retirementUrl){
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        Assert.assertEquals(sbh.retirementPageTitle(), sbh.retirementExpectedPageTitle(retirementUrl));
    }
    @Parameters({"resourcesUrl"})
    @Test //(enabled = false)
    //Checks if the 'banking Services' tab takes the user to the expected page.
    public void resourcesPageAssertionCheck(String resourcesUrl){
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        Assert.assertEquals(sbh.resourcesPageTitle(), sbh.resourcesExpectedPageTitle(resourcesUrl));
    }
    @Parameters({"cashManagementUrl"})
    @Test //(enabled = false)
    //Checks if the 'cash management' tab takes the user to the expected page.
    public void cashManagementPageAssertionCheck(String cashManagementUrl){
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        Assert.assertEquals(sbh.cashManagementPageTitle(), sbh.cashManagementExpectedPageTitle(cashManagementUrl));
    }
    @Parameters({"mostPopularVideoUrl"})
    @Test //(enabled = false)
    //Checks if the 'Most Popular Video' tab takes the user to the expected page.
    public void mostPopularPageAssertionCheck(String mostPopularVideoUrl){
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        Assert.assertEquals(sbh.mostPopularPageTitle(), sbh.mostPopularExpectedPageTitle(mostPopularVideoUrl));
    }

    @Test //(enabled = false)
    //Checks the 'business Advantage Relationship Rewards' page title
    public void businessAdvantageRelationshipRewardsTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.businessAdvantageRelationshipRewardsPageTitle();
    }
    @Test //(enabled = false)
    //Checks the 'payroll Services' page title
    public void retirementTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.retirementPageTitle();
    }
    @Test //(enabled = false)
    //Checks the 'payroll Services' page title
    public void resourcesPageTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.resourcesPageTitle();
    }
    @Test //(enabled = false)
    //Checks the 'payroll Services' page title
    public void payrollServicesPageTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.payrollServicesPageTitle();
    }
    @Test //(enabled = false)
    //Checks the 'Most popular Tab' page title
    public void bankingServicesPageTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.bankingServicesPageTitle();
    }

    @Test //(enabled = false)
    //Checks the 'Most popular Tab' page title
    public void cashManagementPageTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.cashManagementPageTitle();
    }
    @Test //(enabled = false)
    //Checks the 'Most popular Tab' page title
    public void mostPopularPageTitleCheck() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.mostPopularPageTitle();
    }

    @Test //(enabled = false)
    //Checks if the 'Most popular Tab' on the right is clickable
    public void mostPopularTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.mostPopularTabClick();
    }

    @Test //(enabled = false)
    //Checks if the 'cash Management Tab' on the right is clickable
    public void cashManagementTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.cashManagementTabClick();
    }

    @Test //(enabled = false)
    //Checks if the 'banking Services Tab' on the right is clickable
    public void bankingServicesTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.bankingServicesTabClick();
    }

    @Test //(enabled = false)
    //Checks if the 'payroll Services Tab' on the right is clickable
    public void payrollServicesTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.payrollServicesTabClick();
    }
    @Test //(enabled = false)
    //Checks if the 'resources Tab' on the right is clickable
    public void resourcesTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.resourcesTabClick();
    }
    @Test //(enabled = false)
    //Checks if the 'retirement' on the right is clickable
    public void retirementTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.retirementTabClick();
    }
    @Test //(enabled = false)
    //Checks if the 'Credit' on the right is clickable
    public void creditTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.creditTabClick();
    }
    @Test// (enabled = false)
    //Checks if the 'business Advantage Relationship Reward' on the right is clickable
    public void businessAdvantageRelationshipRewardTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.businessAdvantageRelationshipRewardTabClick();
    }
    @Test //(enabled = false)
    //Checks if the 'Home Tab' on the right is clickable
    public void homeTabClickFunctionality() {
        SmallBusinessVideo sbh=PageFactory.initElements(driver, SmallBusinessVideo.class);
        sbh.homeTabClick();
    }

}
