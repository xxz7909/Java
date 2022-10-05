package com.multithread.test;

public class DaemonThread implements Runnable {
    @Override
    public void run() {
        System.out.println("守护线程");
    }
}
