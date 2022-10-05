package com.elgoog.main;

import com.elgoog.service.StudentService;

import java.sql.SQLException;
import java.util.Scanner;

public class RunApplication {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        init();
    }

    public static void init() throws SQLException {
        System.out.println("Welcome to Students Management System!\n"
                + "1.search by id\n"
                + "2.search all students\n"
                + "3.update a datum\n"
                + "4.delete a datum\n"
                + "5.insert a datum\n"
                + "0.exit");
        functionService();
    }

    public static void functionService() throws SQLException {
        while (true) {
            switch (scanner.nextInt()) {//按学号插入的懒得弄了
                case 1:
                    System.out.println(StudentService.selectById(scanner.nextInt()));
                    break;
                case 2:
                    StudentService.selectAll();
                    break;
                case 3:
                    StudentService.updateById(scanner.nextInt(), scanner.next(), scanner.nextInt());
                    break;
                case 4:
                    StudentService.deleteById(scanner.nextInt());
                    break;
                case 5:
                    StudentService.insertDatum(scanner.next(), scanner.nextInt());
                    break;
                case 0:
                    System.out.println("Quit.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Incorrect input,Please try again.\n");
            }
        }

    }

}
