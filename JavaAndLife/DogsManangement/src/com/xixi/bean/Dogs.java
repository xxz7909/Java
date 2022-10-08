package com.xixi.bean;


public class Dogs extends Pet {
    @Override
    public Pet Barking() {
        System.out.println("汪汪!~~~");
        return null;
    }

    public Dogs() {
    }

    //  这个在父类或者父类的属性加了private的情况下会报错
//    public Dogs(String name, String variety, int age, String food) {
//        this.name = name;
//        this.variety = variety;
//        this.age = age;
//        this.food = food;
//    }
    public Dogs(String name, String variety, int age, String food) {
        super(name, variety, age, food);
    }

    public final boolean isGuideBlindness() {
        return false;
    }
}