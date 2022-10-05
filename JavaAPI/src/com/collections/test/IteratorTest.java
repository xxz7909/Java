package com.collections.test;

import org.junit.Test;

import javax.naming.InsufficientResourcesException;
import java.util.*;

public class IteratorTest {
    @Test
    public void IteratorTest() {
        ArrayList<Integer> list_1 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Integer random = new Random().nextInt(100);
            list_1.add(random);
            list_2.add(random + 1);
        }
//        for (Iterator<Integer> iterator_1 = list_1.iterator(); iterator_1.hasNext(); ) {
//            for (Iterator<Integer> iterator_2 = list_2.iterator(); iterator_2.hasNext(); ) {
//                if (iterator_1.next() < iterator_2.next()) {
//                    System.out.println(iterator_1.next());//像这种如果不可避免要用到两次next方法，就难免出错，因为它迭代1次都两次，走到一半就跑不出了，就会出现NoSuchElementException的错误
//                }
//            }
//        }
        for (Integer value_1 : list_1) {
            for (Integer value_2 : list_2) {
                if (value_1 < value_2) {
                    System.out.println(value_1);
                }
            }
        }
    }
}
