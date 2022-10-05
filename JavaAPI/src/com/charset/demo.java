package com.charset;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class demo {
    @Test
    public void charSetTest() throws UnsupportedEncodingException {
        String str = "熊大熊二";
        byte[] bytes = str.getBytes();
        // utf-8
        System.out.println(Arrays.toString(bytes));

        //GBK
        byte[] gbks = str.getBytes("GBK");
        System.out.println(Arrays.toString(gbks));
    }
}
