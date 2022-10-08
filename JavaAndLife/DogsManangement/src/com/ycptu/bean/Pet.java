package com.ycptu.bean;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//这个注释不规范   类有专门的类注释
// 宠物类都具有这些
// 类当中的变量和方法都总称为：属性(共性、特性)
@Setter
@Getter
@Data

public abstract class Pet extends Object {
    //成员变量；它们组成和构成了类，是类的重要组成部分
    // NanG 小区名
    private static final String COMMUNTIY_NAME = "NanG";
    private String name;
    private String variety;
    private int age;
    private String food;

    public static String getCommunity() {
        return COMMUNTIY_NAME;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", variety='" + variety + '\'' +
                ", age=" + age +
                ", food='" + food + '\'' +
                '}';
    }

    public static class Sun {
        public String name;
        String str = COMMUNTIY_NAME;
    }


    public void setAge(int age) {
        if (age < 0 || age > 30) {
            System.out.println("您输入的数据不合法，已经默认清零！");
            age = 0;
        }
        this.age = age;
//        communtiy = "askdf";
    }
//    public void setAgeS(int age) {
//        if (age < 0 || age > 30) {
//            setAge(0);
//        } else {
//            setAge(age);
//        }
//    }

    public void sick() {
        System.out.println("宠物生病了");
    }


    //  默认创建，隐藏的，只要创建类，就会存在
// 无参数构造函数，（无参构造器）
    public Pet() {

    }

    public Pet(String name, String variety, int age, String food) {
        this.name = name;
        this.variety = variety;
        this.age = age;
        this.food = food;
    }

    public void eat() {
        System.out.println(this.name + "在吃饭,正在吃" + food);
    }

    public void sleep() {
        System.out.println(this.name + "在睡觉");
    }

    public static void injection() {
        System.out.println("所有的宠物，月底打针！");
    }

    public abstract Pet Barking();
}





