package com.commonsIOtest;

import com.IOpractice.Student;
import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class demo {
    @Test
    public void writeTest() throws IOException {
        File testFile = new File("resources/test.txt");
        if (!testFile.exists()) {
            testFile.createNewFile();
        }

        ArrayList<Student> stu = new ArrayList<>();
        stu.add(new Student("熊大", 20, "男"));
        FileUtils.writeLines(testFile, stu, true);
    }

}
