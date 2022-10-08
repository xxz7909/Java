package com.ycptu.bean;


public class Earth {
    private String name;
    // 单例设计模式
    private static Earth earthInstance = new Earth();

    //内部类

    public Earth() {
    }

    public static Earth getEarthInstance() {
        return earthInstance;
    }

    public void hello() {
        System.out.println("hello");
    }
}
