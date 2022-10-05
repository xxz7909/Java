package com.login;

import java.io.IOException;
import java.util.Scanner;

import static com.login.Service.*;

public class Z2003010224 {
    public static void main(String[] args) throws IOException {
        init();
    }

    public static void init() throws IOException {
        menu();

        Scanner scanner = new Scanner(System.in);
        out:
        while (true) {
            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1:
                        login();
                        break;
                    case 2:
                        register();
                        break;
                    case 3:
                        show();
                        break;
                    case 0:
                        break out;
                }
            }
        }
        scanner.close();
    }

    public static void menu() {
        System.out.println("--------牛马管理系统--------\n" +
                "1.登录功能(login)\n" +
                "2.注册功能(register)\n" +
                "3.查看(show)\n" +
                "0.退出(exit)\n" +
                "--------牛马管理系统--------\n" +
                "请选择功能:");
    }

}
