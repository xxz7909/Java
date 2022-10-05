package com.collections.test;

import org.junit.Test;

import javax.lang.model.element.NestingKind;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    @Test
    public void HashSetTest() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Arch");
        hashSet.add("Debian");
        hashSet.add("Ubuntu");
        hashSet.add("CentOS");
        hashSet.add("Manjaro");
        hashSet.add("Debian");
        hashSet.add("Debian");
        hashSet.add("Debian");
        hashSet.add("Debian");
        hashSet.add("Debian");
        System.out.println(hashSet);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
