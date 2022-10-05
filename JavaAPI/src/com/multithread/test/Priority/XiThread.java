package com.multithread.test.Priority;

public class XiThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()
                    + "  111111");
        }
    }
}
