package com.google;

import java.util.Scanner;

//main
public class RunApplication {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        System.out.println("Welcome to Students Management System!\n"
                + "1.查询\n"
                + "2.修改\n"
                + "3.删除\n"
                + "4.增加\n");
    }
}
