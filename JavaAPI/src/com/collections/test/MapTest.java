package com.collections.test;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class MapTest {
    @Test
    public void HashMapTest() {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 100);
        hashMap.put(2, 68);
        hashMap.put(3, 79);
        hashMap.put(4, 89);

        Set<Entry<Integer, Integer>> entrySet = hashMap.entrySet();
        Iterator<Entry<Integer, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next().getValue();
            if (value > 80) {
                System.out.println(value);
            }
        }
    }
}
