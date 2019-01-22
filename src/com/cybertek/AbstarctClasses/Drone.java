package com.cybertek.AbstarctClasses;

public class Drone implements Flyable {
    int engine;
    int maxHeight;
    @Override
    public void fly(){
        System.out.println("drone fly");
    }


}
