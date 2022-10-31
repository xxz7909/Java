package com.company;

public class Rectangle extends Shape {
    private double longSide;
    private double shortSide;

    Rectangle(double longSide, double shortSide) {
        this.longSide = longSide;
        this.shortSide = shortSide;
    }

    Rectangle() {
    }

    @Override
    double getCircumference() {
        return 2 * longSide + 2 * shortSide;
    }

    @Override
    double getArea() {
        return longSide * shortSide;
    }

    void print() {
        System.out.println("longSide = " + longSide);
        System.out.println("shortSide = " + shortSide);
        System.out.println(getCircumference());
        System.out.println(getArea());
    }
}
