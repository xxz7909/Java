package com.company;

public class Test {
    @org.junit.Test
    public void test() {
//        String regex = "^([0-9]+)([a-z]+)([A-Z]+)([!\"#$%&'()*+,-./:;<=>?@\\[\\]^_`{|}]+)$";
//        String regex = "^((?=.*[A-Z])(?=.*[a-z]))[~\\!@#\\$%\\^&\\*\\(\\)\\_\\+\\?\\-\\=\\.0-9A-Za-z]{8,16}";
        String regex = "^(123)$";
        System.out.println("2wW.1234".matches(regex));
        System.out.println("a12qQ.1234".matches(regex));
    }
}
