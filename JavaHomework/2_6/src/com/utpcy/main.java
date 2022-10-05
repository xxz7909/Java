package com.utpcy;

import java.util.Random;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] audience = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("存储第" + (i + 1) + "个姓名");
            if (sc.hasNext()) {
                audience[i] = sc.next();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println("第" + (i+1) + "个观众姓名:" + audience[i]);
        }
        Random random = new Random();
        System.out.println("随机抽取的幸运观众是：" + audience[random.nextInt(3)]);
    }
}
