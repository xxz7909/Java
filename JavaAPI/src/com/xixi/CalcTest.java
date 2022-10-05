package com.xixi;

import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

public class CalcTest {
    @Test
    public void testSum() {
        int numA = ThreadLocalRandom.current().nextInt(-32768, 32767);
        int numB = ThreadLocalRandom.current().nextInt(-32768, 32767);
        int sum = Calc.sum(numA, numB);
        Assert.assertEquals(numA+numB, sum);
    }

    @Test
    public void subtraction() {
        int numA = ThreadLocalRandom.current().nextInt(-32768, 32767);
        int numB = ThreadLocalRandom.current().nextInt(-32768, 32767);
        int rst = Calc.substraction(numA, numB);
        Assert.assertEquals(numA - numB, rst);
    }
}
