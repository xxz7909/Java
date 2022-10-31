package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(114515);
        circle.getArea();
        circle.getCircumference();
        circle.print();
        Cylinder cylinder = new Cylinder(114515,1919180);
        cylinder.getVolume();
        cylinder.printVolume();
    }
}
