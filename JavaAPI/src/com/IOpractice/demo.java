package com.IOpractice;

import org.junit.Test;

import java.io.*;

public class demo {
    @Test
    public void inputFile() throws IOException {//Read
        FileInputStream fileInputStream = new FileInputStream("resources/2.txt");
        int by = ' ';
        while ((by = fileInputStream.read()) != -1) {
            System.out.print((char) by);
        }
        fileInputStream.close();
    }

    @Test
    public void outputFile() throws IOException { // Write
        FileOutputStream fileOutputStream = new FileOutputStream("resources/2.txt");
        byte[] bytes = "xixi_Hello_computingScience".getBytes();
        System.out.println(bytes);
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char) bytes[i]);
            fileOutputStream.write(bytes[i]);
        }
        fileOutputStream.close();
    }

    @Test
    public void copyFileBase() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("resources/input.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("resources/output.jpg");

        //缓冲区
        byte[] buffer = new byte[1024];
        int b;
        while ((b = fileInputStream.read(buffer)) != -1) {
            fileOutputStream.write(buffer, 0, b); //一次搬运1024字节
        }
        fileInputStream.close();
        fileOutputStream.close();
    }

    @Test
    public void bufferByteStreamTest() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("resources/input.mp4"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("resources/output.mp4"));
        int b;
        while ((b = bufferedInputStream.read()) != -1) {
            bufferedOutputStream.write(b);
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }

    @Test
    public void fileReaderTest() throws IOException {
        FileReader fileReader = new FileReader("resources/1.txt");
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
        }
        fileReader.close();
    }

    @Test
    public void fileWriterTest() throws IOException {
        FileWriter fileWriter = new FileWriter("resources/3.txt");
        fileWriter.write("lalala\n2");
        fileWriter.close();
    }

    @Test
    public void bufferedWriterTest() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("resources/bufferedWriterTest.txt"));
        bufferedWriter.write("123");
        bufferedWriter.newLine();//不同的系统换行符不一样，增强可移植性
        bufferedWriter.write("456");
        bufferedWriter.close();
    }

    @Test
    public void bufferedReaderTest() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("resources/1.txt"));
        //这个是字符流,要用String接收
        String str;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }
    }

}
