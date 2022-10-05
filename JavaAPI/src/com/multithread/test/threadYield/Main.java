package com.multithread.test.threadYield;

public class Main {
    public static void main(String[] args) {
        XiThread xiThread = new XiThread();
        Thread thread_1 = new Thread(xiThread, "线程1 张三线程");
        Thread thread_2 = new Thread(xiThread, "线程2 李四线程");
        thread_1.start();
        thread_2.start();
    }
}
