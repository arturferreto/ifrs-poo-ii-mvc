package app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class HandleConnection {
    private static final String IP       = "";
    private static final String USER     = "";
    private static final String PASSWORD = "";
    private static final String DATABASE = "";
    private static final String URL_JDBC = "";

    public static String getURL() {
        return URL_JDBC;
    }

    public static String getUser() {
        return USER;
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(getURL(), getUser(), getPassword());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
