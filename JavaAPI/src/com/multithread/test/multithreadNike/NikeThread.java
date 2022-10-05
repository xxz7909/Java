package com.multithread.test.multithreadNike;

public class NikeThread extends Thread {
    private int cnt = 100;
    private String name;

    public void run() {
        while (cnt-- > 0) {
            System.out.println(name + "抢到了第" + cnt + "双鞋");
            System.out.println(Thread.currentThread().getName());
        }
    }

    public NikeThread(String name) {
        this.name = name;
    }
}
