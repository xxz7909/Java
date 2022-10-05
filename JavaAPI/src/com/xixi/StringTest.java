package com.xixi;

import org.junit.Test;

public class StringTest {
    @Test
    public void createString() {
        String s1 = "Hello";
        String s2 = "World";
        s1 = s1 + s2;
        System.out.println("s1 = " + s1);
    }

}
