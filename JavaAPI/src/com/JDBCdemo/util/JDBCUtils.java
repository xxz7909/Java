package com.JDBCdemo.util;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String driver;
    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            // 从JDBCUtils类出发，获取类加载器 其实这句代码写不写都行
//            JDBCUtils.class.getClassLoader();
            InputStream inputStream = ClassLoader.getSystemResourceAsStream("com\\JDBCdemo\\util\\db.properties");

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

    //静态单例模式
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    // 有时候需要结果集，有时候不需要结果集，写个重载
    public static void close(Connection connection, Statement statement) throws SQLException {
        if (statement != null) {
            statement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void close(Connection connection, PreparedStatement preparedStatement) throws SQLException {
        if (preparedStatement != null) {
            preparedStatement.close();
        }
        if (connection != null) {
            connection.close();
        }
    }

    public static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {
        if (connection != null) {
            connection.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }
    }
}
