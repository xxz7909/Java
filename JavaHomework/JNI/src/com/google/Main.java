package com.google;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.HelloFromCpp();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            if (sc.hasNextByte()) {
                if (sc.nextByte() == '\r') {
                    System.out.println("111");
                }
            }
        }

    }

}
