package com.oop.class03;

class Car{

    Car(){
        System.out.println("No Arg Constructor");
    }

    Car(String name){
        System.out.println(name);
    }

    void Car(){
        System.out.println("Driving Car");
    }

}

public class ConstructorRecap {
    public static void main(String []args){
        Car c = new Car();
    }
}
