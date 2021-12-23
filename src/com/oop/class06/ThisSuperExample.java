package com.oop.class06;

class Vehicle{
    Vehicle(String name){
        System.out.println("1. Animal - "+name);
    }
}

class Car extends Vehicle{
    Car(String name){
        super(name);
        System.out.println("2. Cat  -"+ name);
    }
}

// Whenever in the parent class we have only constructor which is taking arguments then we have call that
// constructor explicitly from child class constructor
class SportsCar extends Car{
    SportsCar(String name){
        super(name); // try understand by removing this statement
        System.out.println("3. Wild Cat - "+ name);
    }
}

public class ThisSuperExample{
    public static void main(String []args){
        SportsCar s = new SportsCar("Jhonty");

    }
}