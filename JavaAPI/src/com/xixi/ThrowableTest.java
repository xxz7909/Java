package com.xixi;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.util.Objects;

public class ThrowableTest {

    public int sum(int a, int b) throws XiException {
        if (a > 10 || b > 10 || a < 0 || b < 0) {
            throw new XiException(XiCodeEnum.NOT_OVER_TEN);
        }
        return a + b;
    }

    @Test
    public void test() {
        try {
            int rst = sum(1, -1);
            System.out.println(rst);
        } catch (XiException e) {
            e.printStackTrace();
        }
    }
}

