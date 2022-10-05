package com.login;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class test {
    @org.junit.Test
    public void testMD5() throws IOException {
        String str = Util.getMD5String("login"+Util.getMD5String("123456"));
        System.out.println(str);
//        Util.writeToFile(str);
    }

    @org.junit.Test
    public void test() throws IOException {
        Properties properties = new Properties();
        properties.load(new FileInputStream("info.properties"));
        System.out.println(properties.getProperty("user"));
    }
}
