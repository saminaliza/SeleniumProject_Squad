package database;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

public class CnnDataDriven extends CommonAPI {
    @FindBy(id = "footer-search-bar")
    WebElement searchBox2;

    @FindBy(xpath = "//*[@id=\"footer-nav-container\"]/div[1]/div/form/button/div[1]")
    WebElement submit;
    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/div[5]/button[1]/*")
    WebElement searchBox;
    @FindBy(id = "header-search-bar")
    WebElement searchButton2;
    @FindBy(xpath = "//*[@id=\"header-nav-container\"]/div/div[2]/div/div[1]/form/button/div[1]")
    WebElement searchButton3;

    public void searchClick(String itemName) {
        searchBox.click();
        searchButton2.sendKeys(itemName);
        searchButton3.click();
    }

    public void submit() {
        submit.click();


    }

    public void searchItemsAndSubmitButton() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = Database.getListFromDB();
        for (int i = 0; i < list.size(); i++) {
            searchClick(list.get(i));
            submit();
        }
    }

    public String randomText() {

        String[] words = new String[11];
        words[0] = "politics";
        words[1] = "money";
        words[2] = "new york";
        words[3] = "world";
        words[4] = "economy";


        String text = "";
        Random random = new Random();
        int randomText = random.nextInt(4) + 1;
        for (int i = 0; i < words.length; i++) {
            text = words[randomText];
            randomText = random.nextInt(4) + 1;
        }
        return text;

    }
}