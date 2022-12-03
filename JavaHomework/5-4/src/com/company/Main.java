package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    private static void leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + "是闰年，二月份有29天");
        } else {
            System.out.println(year + "不是闰年,二月份有28天");
        }
    }

    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner sc = new Scanner(System.in);
        Calendar calendar = Calendar.getInstance();
        if (sc.hasNextInt()) {
            calendar.set(Calendar.YEAR, sc.nextInt());
        }
        leapYear(calendar.get(Calendar.YEAR));
        sc.close();
    }
}
