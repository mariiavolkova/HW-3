package com.volkova.Car;

public class Car {

    public int maxSpeed = 200;
    public int minSpeed = 1;
    public int stopSpeed = 0;
    public int nowSpeed;

    public void startEngine(){ System.out.println("Your engine is running. You can ride");
    }

    public void stopEngine(){ System.out.println("Your engine is stopping. You can`t ride");
    }

    public void keepingSpeed (){
        if (int nowSpeed<maxSpeed)
        System.out.println("All is OK. Keep riding.");}
        else if (int nowSpeed = stopSpeed){
            System.out.println("You are stopped. Start engine and move!");
        }else{
            System.out.println("Stop immediately!!!");
        }
    }

    public void move(){
        int o = 20;
        if (o>stopSpeed){
            System.out.println("You are riding now.");
        }
    }
