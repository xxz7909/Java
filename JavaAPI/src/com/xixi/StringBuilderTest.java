package com.xixi;

import org.junit.Test;

public class StringBuilderTest {
    @Test
    public void Test() {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Hello ").append("world").append("!");
        System.out.println(stringbuilder);
    }
}
