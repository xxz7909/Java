package com;

public class Student {
    private String id;
    private String name;
    private Gender gender;
    int age;
    int javaScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", javaScore=" + javaScore;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(int javaScore) {
        this.javaScore = javaScore;
    }

    public Student(String id, String name, Gender gender, int age, int javaScore) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.javaScore = javaScore;
    }
}
