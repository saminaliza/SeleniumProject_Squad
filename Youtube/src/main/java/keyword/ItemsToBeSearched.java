package keyword;

import base.CommonAPI;
import utility.DataReader;

import java.io.IOException;

public class ItemsToBeSearched extends CommonAPI {

    DataReader dr=new DataReader();

    public String[] getDataFromExcelFileForFeaturesChoice() throws IOException{
        String path = System.getProperty ("../data/file.xls");
        String [] data = dr.fileReader2(path,0);
        return data;
    }

}


