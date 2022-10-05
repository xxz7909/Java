package com.login;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Util {
    public static String getMD5String(String passwd) {
        byte[] digest = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("md5");
            digest = md5.digest(passwd.getBytes("utf-8"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String md5Code = new BigInteger(1, digest).toString(16);
        return md5Code;
    }

    public static void writeToFile(String string) throws IOException {
        FileWriter fileWriter = new FileWriter("H:\\Java\\info.properties", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(string);

        bufferedWriter.close();
    }

    public  native String setPassword();

    static {
//        System.loadLibrary("setPassword");
        System.load("H:\\Java\\setPassword.dll");
    }

}
