package com.google;

public class Hello {
    public native void HelloFromCpp();

    static {
        System.out.println(System.getProperty("user.dir"));
        System.loadLibrary("hello");
    }
}
