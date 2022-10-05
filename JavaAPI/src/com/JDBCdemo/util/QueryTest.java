package com.JDBCdemo.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class QueryTest {
    public static Connection connection;
    public static PreparedStatement preparedStatement;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        try {
            connection = JDBCUtils.getConnection();

            System.out.println("输入要查询的id");
            int id = scanner.nextInt();

            //用 ? ? 这种非常先进的方式 这个时候要用PreparedStatement对象
            String sql = "select * from info where id=?";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            ResultSet res = preparedStatement.executeQuery();
            while (res.next()) {
                System.out.println(res.getInt(1) + res.getString(2) + res.getInt(3));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //以后都用prepareStatement 不用普通的statement
            //prepareStatement这个东西可以防注入
            //防止了某些人恶意利用字符串拼接   sql注入
            JDBCUtils.close(connection, preparedStatement);
            scanner.close();
        }
    }
}
