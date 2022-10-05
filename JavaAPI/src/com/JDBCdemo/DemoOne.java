package com.JDBCdemo;

import org.junit.Test;

import java.sql.*;
import java.sql.ResultSet;

public class DemoOne {
    public static final String URL = "jdbc:mysql://localhost:3306/student";
    public static final String USER = "root";
    public static final String PASSWORD = "123456";
    public static final String Driver = "com.mysql.jdbc.Driver";

    public static Connection connection;
    public static Statement statement;
    public static ResultSet resultSet;

    @Test
    public  void main() {
        try {
            // 1.加载驱动
            Class.forName(Driver);
            // 2.获取数据库连接对象
            connection = DriverManager.getConnection(URL, USER, PASSWORD);//感觉这个可以写成从一个加密文件里获取啊
            // 3.获取数据库操作对象
            statement = connection.createStatement();

            resultSet = statement.executeQuery("select * from info");
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                System.out.println(id + " " + name + " " + age);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
