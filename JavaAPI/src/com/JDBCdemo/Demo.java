package com.JDBCdemo;

import org.junit.Test;

import java.sql.*;

public class Demo {

    public static final String URL = "jdbc:mysql://localhost:3306/student";
    public static final String USER = "root";
    public static final String PASSWD = "123456";

    @Test
    public void main() throws ClassNotFoundException, SQLException {
        // 加载驱动程序 ->给布料厂商打电话，我缺布料，你得给我送来，我mysql公司的
        Class.forName("com.mysql.jdbc.Driver");
        //获得数据库的连接  -> 告诉送货员，具体走什么路线才能送货收件人姓名啥的 发货要告诉地址(路径)  用户  密码
        Connection connection = DriverManager.getConnection(URL, USER, PASSWD);
        //获取数据库操作对象 -> 送货送到了，然后卸货
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from info");
        while (resultSet.next()) {
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int age = resultSet.getInt(3);
            System.out.println("id:" + id + ", name:" + name + ", age" + age);
        }

        //各种操作完成之后要关闭与数据库的连接 先关闭操作数据库的对象 再关闭connection
        statement.close();
        connection.close();
    }
}
