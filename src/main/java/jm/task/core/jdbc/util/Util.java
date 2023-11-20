package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "Markiz228!";
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e + "Connection NOT OK");
        }
    }
    public static Statement getStatement() {
        try {
            return getConnection().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
