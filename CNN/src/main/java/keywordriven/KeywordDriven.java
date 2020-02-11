package keywordriven;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class KeywordDriven extends CommonAPI {

    //datareader
    public static String[] getDataFromExcelFileForFeaturesChoice() throws IOException {
        DataReader dr = new DataReader();
        String path = System.getProperty("user.dir") + "/keyword/search.xls";
        String[] data = dr.fileReader2(path, 0);
        return data;

        }
    }


