package com.JDBCdemo.util;

import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class main {
    public static void main(String args[]) {

    }

    public Connection connection;
    public Statement statement;

    public void insertTest() throws SQLException {
//        String insertSql = "insert into info (name,age) values ('Zhangsan',18);";
//        Test(insertSql);
        Test("insert into info (name,age) values ('Zhangsan',18);");
    }

    @Test
    public void updateTest() throws SQLException {
        int res = Test("update info set name='张三1' where id=3");
        if (res > 0) {
            System.out.println("Update successfully!");
        }
    }

    @Test
    public void deleteTest() throws SQLException {
        int res = Test("delete from info where id=5");
        if (res > 0) {
            System.out.println("Delete successfully!");
        }
    }

    public int Test(String sql) throws SQLException {
        int res = 0;
        try {
            connection = JDBCUtils.getConnection();
            statement = connection.createStatement();

//            String sql = "insert into info (name,age) values ('Zhangsan',18);";

            /*int*/
            res = statement.executeUpdate(sql);
            if (res > 0) {
//                System.out.println("Insert successfully!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, statement);
        }
        return res;
    }
}
