package com.multithread.test.Priority;

public class MinPriorityThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 9999; i++) {
            System.out.println(Thread.currentThread().getName());
            if (i == 9998) {
                System.out.println(Thread.currentThread().getName()
                        + "滴任务完成啦！");
            }
        }
    }
}
