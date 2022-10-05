package com.collections.test;

import org.junit.Test;

import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    @Test
    public void LinkedHashSetTest() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Debian");
        linkedHashSet.add("Ubuntu");
        linkedHashSet.add("Kali");
        linkedHashSet.add("Kali");
        System.out.println(linkedHashSet);
    }
}
