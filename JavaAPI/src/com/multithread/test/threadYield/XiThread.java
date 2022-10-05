package com.multithread.test.threadYield;

public class XiThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 20 == 0) {
                System.out.println(Thread.currentThread().getName() + "线程让步" + i);
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }
}
