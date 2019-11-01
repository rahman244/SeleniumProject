package DataReaderCommonClass;

import base.Xls_Reader;

import java.util.ArrayList;
import java.util.List;

public class ReadFromExcel {
    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {

            reader = new Xls_Reader("/Users/afia/IdeaProjects/GroupBlueFrameWork/Geico/data/DataFile3.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  email = reader.getCellData("Sheet1", "email",rowNum );
            String passCode = reader.getCellData("Sheet1","passCode", rowNum);
            String message = reader.getCellData("Sheet1","message", rowNum);
           Object obj[] = {email,passCode, message};
            myData.add(obj);
        }
        return  myData;
    }
    public static List<String> getDataFromExcelForKeywordDriven(){

        List<String> myData = new ArrayList<>();
        try {
            reader = new Xls_Reader("/Users/afia/IdeaProjects/GroupBlueFrameWork/Geico/data/keyWordDriven.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  keyWord = reader.getCellData("Sheet1", "keyword",rowNum );
            myData.add(keyWord);
        }
        return  myData;
    }
}
