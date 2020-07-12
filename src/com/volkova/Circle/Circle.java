package com.volkova.Circle;

public class Circle {
    public double radius = 9;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
    }

    public double getArea() {
        return (double) (Math.PI * radius * radius);
        }
    }
