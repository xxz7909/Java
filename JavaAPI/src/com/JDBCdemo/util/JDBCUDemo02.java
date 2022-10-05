package com.JDBCdemo.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class JDBCUDemo02 {
    public static Connection connection;
    public static PreparedStatement preparedStatement;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        try {
            connection = JDBCUtils.getConnection();

            System.out.println("先输入姓名，后输入年龄，用回车隔开");
            String name = scanner.nextLine();
            int age = scanner.nextInt();

            //用 ? ? 这种非常先进的方式 这个时候要用PreparedStatement对象
            String sql = "insert into info(name,age) values(?,?)";

            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);

            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                System.out.println("Insert Successfully!");
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

