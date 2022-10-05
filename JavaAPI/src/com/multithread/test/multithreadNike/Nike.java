package com.multithread.test.multithreadNike;

public class Nike {
    public static void main(String[] args) {
        NikeCustomerThread nikeCustomerThread = new NikeCustomerThread();
        new Thread(nikeCustomerThread,"张三").start();
        new Thread(nikeCustomerThread,"李四").start();
        new  Thread(nikeCustomerThread,"王五").start();

//        new NikeThread("张三").start();
//        new NikeThread("李四").start();
//        new NikeThread("王五").start();


    }
}
