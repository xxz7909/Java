package com.multithread.test.ThreadCommunciation;

public class Producer extends Thread {
    private Condom condom;

    public Producer(Condom condom) {
        this.condom = condom;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (condom) {
                // 如果还有库存，厂家就等
                //(其实应该弄计数器，等快卖光了就生产)
                if (condom.isSellOutStatus == false) {
                    try {
                        condom.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                condom.isSellOutStatus = false;
                System.out.println(Thread.currentThread().getName()
                        + "我生产完了,唤醒消费者，消费者抓紧时间购买");
                condom.notify();
            }

        }
    }
}
