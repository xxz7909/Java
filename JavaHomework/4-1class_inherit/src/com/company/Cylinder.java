package com.company;

public class Cylinder extends Circle {
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    double getVolume() {
//        this.getArea(); // this会先从本类找有没有相应的方法，找不到再去父类里找
        return super.getArea() * this.height;
    }

    void printVolume() {
        System.out.println(this.getVolume());
    }

}
