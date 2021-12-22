package com.oop.class05;

class Vehicle{
    Vehicle(){
        System.out.println("1. From Vehicle");
    }

    Vehicle(String vehicleType){
        System.out.println("From Vehicle - "+vehicleType);
    }
}

class Car extends Vehicle{

    Car(){
        this("Audi");
        System.out.println("2. From Car");
    }

    Car(String carName){
        this(10);
        System.out.println("3. From Car - "+ carName);
    }

    Car(int speed){
        super("Sedan");
        System.out.println("4. From Car Speed");
    }
}

public class ThisAndSuperKeywordWithConstructor {
    public static void main(String[] args) {
        Car c = new Car();
    }
}


