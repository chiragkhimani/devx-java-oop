package com.oop.accessModifierTest;

import com.oop.accessModifer.Car;

public class AccessModifierTest{
    public static void main(String []args){
        Car c = new Car();
        c.drive();
        System.out.println(c.a); //
    }
}
