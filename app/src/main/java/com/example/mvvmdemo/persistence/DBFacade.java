package com.example.mvvmdemo.persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBFacade {
    public static void createTable() {
        Connection conn = DBConn.connect();
        String sql = "CREATE TABLE IF NOT EXISTS editText (\n" +
                "id integer PRIMARY KEY AUTOINCREMENT, \n" +
                "description text NOT NULL, \n" +
                ");";

        try{
            Statement st = conn.createStatement();

            st.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
