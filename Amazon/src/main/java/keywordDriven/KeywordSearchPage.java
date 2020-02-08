package keywordDriven;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class KeywordSearchPage extends CommonAPI {
    //DataReader dr = new DataReader();

    public static String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir") + "/keywordData/items.xlsx";
        String[] data = dr.fileReader2(path, 0);
        return data;
    }
}
