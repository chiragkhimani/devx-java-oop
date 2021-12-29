package com.oop.accessModifer;

public class Car{


    // We don't have default keyword as access modifier, when we're not giving any
    // access modifier by default it'll be default
    // default int j = 20;
    public int a=10;

    public Car(){
        System.out.println("1. Strating the car"); // start the car
        System.out.println(a);
    }

    public void drive(){
        System.out.println("2. Driving"); // driving
    }

}
