package com.multithread.test.ThreadCommunciation;

public class Customer extends Thread {
    private Condom condom;

    public Customer(Condom condom) {
        this.condom = condom;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (condom) {
                // 没有库存了就的打电话给厂商，等！
                if (condom.isSellOutStatus == true) {
                    try {
                        //没有套了，消费者等
                        condom.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                condom.isSellOutStatus = true;
                System.out.println(Thread.currentThread().getName()
                        + "我买完了，你抓紧生产");
                condom.notify();
            }

        }
    }

}
