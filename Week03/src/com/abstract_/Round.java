package com.abstract_;

public class Round extends Shape{

    private double radius;
    public static double PI = 3.14;

    public Round(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
