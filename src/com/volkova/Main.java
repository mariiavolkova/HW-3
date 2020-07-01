package com.volkova;

import com.volkova.Counter.Counter;
import com.volkova.Circle.Circle;
import com.volkova.Car.Car;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(9);
        System.out.println("Area: ");
        System.out.println(circle.getArea());

        Counter myCounter = new Counter();
        System.out.println("Amount of objects : " + myCounter.getCount());

        Car redCar = new Car();
        redCar.startEngine();
        redCar.stopEngine();
        redCar.move();
        redCar.keepingSpeed();
    }
}