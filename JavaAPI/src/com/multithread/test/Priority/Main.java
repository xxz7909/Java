package com.multithread.test.Priority;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        XiThread xiThread = new XiThread();
        Thread threadOne = new Thread(xiThread, "111111");
        // 线程插队
        threadOne.start();

        for (int i = 0; i < 8; i++) {
            System.out.print("i = " + i + "   ");
            System.out.println(Thread.currentThread().getName());
            if (i == 5) {
                threadOne.join();
            }
        }
    }
}
