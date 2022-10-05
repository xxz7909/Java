package com.multithread.test;

public class demo {

    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}
