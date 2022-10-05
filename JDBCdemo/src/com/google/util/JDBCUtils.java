package com.google.util;

import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.ResultSet;

public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("db.properties");
            Properties properties = new Properties();
            properties.load(inputStream);

            driver = properties.getProperty("driver");
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void close(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    //按栈的调用顺序，先进后出后进先出  来关闭  关闭 释放 相当于出栈
    // 有的操作需要用结果集接收，有的操作不需要
    public static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) throws SQLException {
        if (resultSet != null) {
            resultSet.close();
        }
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

}
