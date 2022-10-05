package com.multithread.test.multithreadNike;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class NikeCustomerThread implements Runnable {
    private int shoesCnt = 10;

    Lock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        reentrantLock.lock();
        while (shoesCnt-- > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到了第"
                    + (10 - shoesCnt) + "双鞋,还剩" + shoesCnt + "双");
        }
        reentrantLock.unlock();
    }
}
