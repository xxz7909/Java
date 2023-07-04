package com.elgoog.test;

import com.elgoog.util.EncryptUtils;
import com.elgoog.util.KeyUtils;
import org.junit.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;

public class TestEncryptUtils {
    @Test
    public void testEncrypt() throws Exception {
        String filename = "db.properties";
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(filename);
        Properties properties = new Properties();
        properties.load(inputStream);
        String string[] = {"driver", "url", "user", "password"};
        String values[] = new String[4];
        for (int i = 0; i < string.length; i++) {
            values[i] = properties.getProperty(string[i]);
//            values[i] = values[i].replace(".","dot");
//            values[i] = values[i].replace(":","colon");
//            values[i] = values[i].replace("?","question-mark");
            System.out.println(values[i]);
            System.out.println(EncryptUtils.encrypt(values[i]));
            properties.setProperty(string[i], EncryptUtils.encrypt(values[i]));
        }
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        properties.store(fileOutputStream, filename);

        String cipher = EncryptUtils.encrypt("考研英语长难句");
        System.out.println(cipher);
        String plainText = EncryptUtils.decrypt(cipher);
        System.out.println(plainText);
    }

    @Test
    public void testDecrypt() throws IOException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException {
        String filename = "db.properties";
        InputStream inputStream = ClassLoader.getSystemResourceAsStream(filename);
        Properties properties = new Properties();
        properties.load(inputStream);
        String string[] = {"driver", "url", "user", "password"};
        for (int i = 0; i < string.length; i++) {
            System.out.println(properties.getProperty(string[i]));
            String str = EncryptUtils.decrypt(properties.getProperty(string[i]));
//            str = str.replace("=dot=",".");
//            str = str.replace("=colon",":");
//            str = str.replace("question-mark","?");
            System.out.println(str);
        }
    }

    @Test
    public void testKEYUtils() throws NoSuchAlgorithmException {
        System.out.println(KeyUtils.generateAESKEY());
    }

    @Test
    public void testStringReplace(){
        String a = "123";
        System.out.println(a);
        System.out.println(a.replace("1","2"));
    }

}
