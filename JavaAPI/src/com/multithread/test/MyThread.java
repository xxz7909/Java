package com.multithread.test;

public class MyThread extends Thread {
    public void run() {
        while (LoopCount.LOOP_COUNT-- >= 0) {
            Thread thread = Thread.currentThread();
            System.out.println(Thread.currentThread().getName()
                    + "抢到了第" + (100 - LoopCount.LOOP_COUNT) + "双鞋,还剩" + LoopCount.LOOP_COUNT + "双");
        }
    }
}
