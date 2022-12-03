package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean isRegisterSuccess = false;
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        while (!isRegisterSuccess) {
            System.out.println("个人信息注册\n" +
                    "--------------------------");
            do {
                System.out.println("请输入用户名:注意用户名字符串的长度不能小于8位");
            } while (!account.setUser(sc.next()));

            System.out.println("请输入密码:注意密码必须有数字字母大小写或者特殊符号长度范围在8-16位");
            while (!account.setPassword(sc.next())) {
                System.out.printf("密码格式设置有误，请重新输入\n");
            }

            System.out.println("请输入邮箱");
            while (!account.setEmail(sc.next())) {
                System.out.println("邮箱格式错误，请重新输入");
            }

            System.out.println("请输入电话");
            while (!account.setPhone(sc.next())) {
                System.out.println("电话格式错误,请重新输入");
            }

            isRegisterSuccess = true;
        }
        System.out.println("您的信息注册成功");
        sc.close();
    }
}
