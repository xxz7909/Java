package com.xixi.bean;

public class Cats extends Pet {
    public Cats() {
    }

    public Cats(String name, String variety, int age, String food) {
        super(name, variety, age, food);
    }

    @Override
    public Pet Barking() {
//        super.Barking();
        System.out.println("喵喵喵~");
        return null;
    }
}
