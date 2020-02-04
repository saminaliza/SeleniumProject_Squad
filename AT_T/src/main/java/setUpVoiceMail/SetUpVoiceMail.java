package setUpVoiceMail;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SetUpVoiceMail extends CommonAPI {
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Set up voicemail')]")
    WebElement voice;
    @FindBy(how =How.ID,using = "ctaArticle")
    WebElement go;
    @FindBy(how = How.XPATH,using = "//li[7]//a[1]//img[1]")
    WebElement sumsung;
    @FindBy(how =How.XPATH,using = "//div[@class='_YbyQm']//div[@class='_1MCFz'][contains(text(),'Galaxy S7 (G930A)')]")
    WebElement selectDevices;
    @FindBy(how =How.XPATH,using = "//button[contains(text(),'Confirm selection')]")
    WebElement confirmSelection;
    public void setUpV(){
        voice.click();
        go.click();
        sumsung.click();
        selectDevices.click();
        confirmSelection.click();
    }
}
