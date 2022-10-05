package com.collections.test;

import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArrayListTest {
    @Test
    public void arrayList() {
        ArrayList<Integer> list_A = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list_A.add(new Random().nextInt(999));
        }
        System.out.println(list_A.toArray().toString().getBytes().length);
        list_A.trimToSize();
        System.out.println(list_A.toArray().toString().getBytes().length);

    }
}
