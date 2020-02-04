package testBusinessVoice;

import base.CommonAPI;
import businessVoice.BusinessVoice;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestBusinessVoice extends CommonAPI {
    @Test
    public void businessVoicePromotion() throws InterruptedException {
        BusinessVoice bv = PageFactory.initElements(driver,BusinessVoice.class);
        bv.businessDeal();

    }
}
