package arraySearch;

import base.CommonAPI;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class ArraySearch extends CommonAPI {

    public void searchItemsArray(){
        List<String> itemsList = new ArrayList<String>();
        itemsList.add("Belkin DuraTek Apple Watch Charge Cable - Rose Gold");
        itemsList.add("Carson & Quinn Silicone Case - Black - iPhone 11");
        itemsList.add("Everyday wireless noise-canceling headphones");
        itemsList.add("Playful cases to protect your smartphones");
        itemsList.add("Carson & Quinn Leather Case - Black - iPhone 11 Pro Max");
        itemsList.add("OtterBox Commuter Lite Series Case - Black - LG K40");
        itemsList.add("mophie Black Charge Stream Travel Kit");
        itemsList.add("Otterbox OtterSpot Wireless Charging Pad - Black");
        itemsList.add("BodyGuardz Smoke/Black Ace Case with Unequal - iPhone 6s/7/8");
        for (int i = 0; i < itemsList.size(); i++)
        {
            driver.findElement(By.name("q")).sendKeys(itemsList.get(i));
            driver.findElement(By.name("q")).submit();
            driver.findElement(By.name("q")).clear();
        }
    }

}

//public class UnitTestConnectDB {
//    public static void main(String[] args) throws SQLException {
//        //ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
//
//        String url = "jdbc:mysql://localhost:3306/midterm?Timezone=UTC";
//        String userID = "root";
//        String password ="cAt@123";
//        Connection connection = null;
//        Statement statement = null;
//
//
//
//        try{
//            connection = DriverManager.getConnection(url,userID,password);
//            statement = connection.createStatement();
//            String query ="insert into pnt(id,name) values('3404_NY','Employee Clsess');";
//            String query = "insert into pnt(id,name) values('3405_NY','Employee Classes);";
//            statement.execute(query);
//
//        }catch(SQLException ex){
//            ex.printStackTrace();
//            System.out.println("Something might not ");
//        }
//        // Close the connection and statement
//        finally {
//            statement.close();
//            connection.close();
//        }
//} }


