package com.google.service;

import com.google.model.Student;
import com.google.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentService {
    public static Connection connection;
    public static PreparedStatement preparedStatement;

    public static void selectAll() throws SQLException {
//        ArrayList<Student> arrayList = new ArrayList<>();
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from info";
            preparedStatement = connection.prepareStatement(sql);
            ResultSet res = preparedStatement.executeQuery();
            while (res.next()) {
                System.out.println(new Student(res.getInt(1), res.getString(2), res.getInt(3)));
//                arrayList.add(new Student(res.getInt(1), res.getString(2), res.getInt(3)));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement);
        }

    }

    public static Student selectById(int id) {
        try {
            Student student = new Student();
            connection = JDBCUtils.getConnection();
            String sql = "select * from info where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setAge(resultSet.getInt(3));
            }
            return student;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                JDBCUtils.close(connection, preparedStatement);
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }

        return null;
    }

    public static void deleteById(int id) throws SQLException {
        try {
            connection = JDBCUtils.getConnection();
            String sql = "delete from info where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int ret = preparedStatement.executeUpdate();
            if (ret > 0) {
                System.out.println("Delete Successfully!\n");
            }
        } catch (Exception e) {
            System.out.println("Delete failed");
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement);
        }
    }

    public static void updateById(int id, String name, int age) throws SQLException {
        try {
            connection = JDBCUtils.getConnection();
            String sql = "update info set name=?,age=? where id=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setInt(3, id);
            int ret = preparedStatement.executeUpdate();
            if (ret > 0) {
                System.out.println("Update Successfully!");
            }
        } catch (Exception e) {
            System.out.println("Update failed.\n");
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement);
        }
    }

    public static void insertDatum(String name, int age) throws SQLException {
        try {
            connection = JDBCUtils.getConnection();
            String sql = "insert into info values(null,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            int returnValue = preparedStatement.executeUpdate();
            if (returnValue > 0) {
                System.out.println("Insert Successfully");
            }
        } catch (Exception e) {
            System.out.println("Insert failed.");
            e.printStackTrace();
        } finally {
            JDBCUtils.close(connection, preparedStatement);
        }
    }

}
