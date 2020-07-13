package com.volkova.Car;

public class Car{

    public int maxSpeed = 200;
    public int minSpeed = 1;
    public int stopSpeed = 0;
    public int nowSpeed;

    public void startEngine() {
        System.out.println("Your engine is running. You can ride");
    }

    public void stopEngine() {
        if (nowSpeed < minSpeed) {
            System.out.println("Your engine is stopping. You can`t ride");
        }
    }

    public void keepMoving(){
        int nowSpeed = 160;
        if(nowSpeed>stopSpeed){
            System.out.println("You are riding now!");
        }
        else if (nowSpeed==maxSpeed){
            System.out.println("You riding so fast. Please stop");
        }
        else {
            System.out.println("Error");
        }
    }
}
