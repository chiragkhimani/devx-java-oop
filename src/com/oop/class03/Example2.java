package com.oop.class03;

import java.io.File;
import java.util.Scanner;

class Car1{



    Car1(){
        System.out.println("3");
    }

    Car1(int numOfGears){
        System.out.println("1");
    }

    // We cannot have another constructor taking String argument with different name
    Car1(String color){
        System.out.println("4");
    }

}


public class Example2{

    public static void main(String []args){
        Car1 c = new Car1("12");

    }
}