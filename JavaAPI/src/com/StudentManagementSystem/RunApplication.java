package com.StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class RunApplication {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int option = 5;
        while (option != 0) {
            showMenu();
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            }
            switch (option) {
                case 1:
                    students.add(addStudent());
                    break;
                case 2:
                    deleteStudent(students);
                    break;
                case 3:
                    editStudentById(students);
                    break;
                case 4:
                    searchStudentById(students);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("请选择0-5");
                    break;
            }
        }
        scanner.close();
    }

    public static void showMenu() {
        System.out.print("1.添加数据\n" +
                "2.删除数据\n" +
                "3.修改数据\n" +
                "4.查询数据\n" +
                "0.退出\n");
    }

    public static Student addStudent() {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            student.setId(scanner.next());
            student.setName(scanner.next());
            student.setGender(scanner.next());
            student.setAge(scanner.nextInt());
        }
        return student;
    }

    public static void deleteStudent(ArrayList<Student> students) {
        System.out.println("要删除的学生学号");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        for (int i = 0; i < students.size(); i++) {
            String tmp = students.get(i).getId();
            if (id.equals(tmp)) {
                students.remove(i);
                return;
            }
        }
    }

    public static void searchStudentById(ArrayList<Student> students) {
        System.out.println("输入要查找的学生学号");
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        for (Student stu : students) {
            if (id.equals(stu.getId())) {
                student = stu;
            }
        }
        if (student.getId() == null) {
            System.out.println("您要查询的数据不存在");
        } else {
            System.out.println(student);
        }
    }

    public static void editStudentById(ArrayList<Student> students) {
        System.out.println("输入要修改的学生学号");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.next();
        Student student = new Student();
        for (int i = 0; i < students.size(); i++) {
            student = students.get(i);
            if (id.equals(students.get(i).getId())) {
                System.out.println("请修改");
                student.setId(scanner.next());
                student.setName(scanner.next());
                student.setGender(scanner.next());
                student.setAge(scanner.nextInt());
                students.set(i, student);
            }
        }
    }
}
