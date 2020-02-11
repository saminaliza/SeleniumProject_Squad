package database;

import base.CommonAPI;
import databases.ConnectToSqlDB;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database extends CommonAPI {
    public static ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public static List<String> getListFromDB() throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("movies", "title");
        return list;
    }

    public static void main(String[] args) throws Exception, IOException, SQLException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list = connectToSqlDB.readDataBase("student", "field");
        System.out.println(list.get(0));
    }

}

