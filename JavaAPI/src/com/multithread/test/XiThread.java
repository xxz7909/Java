package com.multithread.test;

public class XiThread implements Runnable {
    @Override
    public void run() {
        while (LoopCount.LOOP_COUNT-- >= 0) {
            Thread thread = Thread.currentThread();
            System.out.println("XiThread is running............" + thread.getName());
            System.out.println(Thread.currentThread().getName());
        }
    }
}
