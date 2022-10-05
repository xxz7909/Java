package com.StudentManagementSystem;

public class Student {
    private String id;
    private String name;
    private String gender;
    private int age;

    public Student() {
    }

    public Student(String id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        if (age < 0) {
            this.age = 0;
        }
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.id + this.name + this.gender + this.age;
    }

}
