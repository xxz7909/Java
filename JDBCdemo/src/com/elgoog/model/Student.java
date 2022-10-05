package com.elgoog.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {
    int id;
    String name;
    int age;

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + "\t" + name + "\t" + age ;
    }

}
