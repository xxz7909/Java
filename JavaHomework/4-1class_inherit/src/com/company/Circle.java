package com.company;

public class Circle {
    private double radius;

    Circle() {
        this.radius = 0;
    }

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void print() {
        System.out.println("radius = " + radius);
        System.out.println("周长=" + this.getCircumference());
        System.out.println("面积=" + this.getArea());
    }
}
