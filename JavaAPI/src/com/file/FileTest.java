package com.file;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void fileTest() {
        File oneDir = new File("H:\\JavaAPI");
        System.out.println("oneDir.exists() = " + oneDir.exists());
        File CalcFile = new File("H:\\JavaAPI\\src\\com\\xixi\\Calc.java");
        System.out.println("CalcFile.length() = " + CalcFile.length());

        String[] list = oneDir.list();
        for (String name:
             list) {
            System.out.println(name);
        }
    }
}
