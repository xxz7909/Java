package com.login;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.Scanner;

public class Service {
    public static void login() throws IOException {
        Properties properties = new Properties();
        System.out.println("请输入用户名");
        Scanner sc = new Scanner(System.in);
        String user = "";
        if (sc.hasNextLine()) {
            user = sc.nextLine();
        }
        System.out.println("请输入密码");
        String password = "";
        if (sc.hasNext()) {
            password = sc.next();
        }
        password = Util.getMD5String(password);
        properties.load(new FileInputStream("info.properties"));
        if (user.equals(properties.getProperty("user")) && password.equals(properties.getProperty("password"))) {
            System.out.println("登录成功");
        }
    }

    public static void register() throws IOException {
        System.out.println("请输入用户名");
        Scanner scanner = new Scanner(System.in);
        String userName = "";
        if (scanner.hasNextLine()) {
            userName = scanner.nextLine();
        }
        System.out.println("请输入密码");
        String password = "";
        if (scanner.hasNext()) {
            password = scanner.next();
        }
        System.out.println("注册成功");
        String key = Util.getMD5String(password);
        Util.writeToFile("user=" + userName + "\n" + "password=" + key+"\n");
    }

    public static void show() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("info.properties"));
        System.out.println("用户名" + props.getProperty("user") + ",密码:" + props.getProperty("password"));
    }

    public static void exit() {

    }
}
