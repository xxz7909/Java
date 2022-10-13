package com;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("1", "张三", Gender.男, 18, 99);
        students[1] = new Student("2", "菜虚鲲", Gender.男, 23, 66);
        students[2] = new Student("3", "苏珊", Gender.女, 19, 59);
        students[3] = new Student("4", "小黑子", Gender.男, 223, 100);
        students[4] = new Student("5", "油饼", Gender.男, 22, 90);

        for (int i = 0; i < 5; i++) {
            System.out.println(students[i].toString());
        }
        int sum = 0;
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            scores[i] = students[i].getJavaScore();
            sum += students[i].javaScore;
        }
        int average = sum / 5;
        System.out.println("average = " + average);
        Arrays.sort(scores);
        int min = scores[0];
        int max = scores[scores.length-1];
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

}


