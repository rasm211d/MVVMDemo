package com.example.mvvmdemo.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {
    public static Connection connect() {

        String url = "jdbc:sqlite:main/data.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException("Connection to db failed");
        }
    }
}
