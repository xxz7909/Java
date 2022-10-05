package com.multithread.test.ThreadCommunciation;

public class Main {
    public static void main(String[] args) {
        Condom condom = new Condom();
        new Customer(condom).start();
        new Producer(condom).start();
    }
}
