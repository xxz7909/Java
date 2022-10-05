package test;

public class Hello {
    public native void HelloFromCpp();

    static {
        System.loadLibrary("hello.dll");
    }
}
