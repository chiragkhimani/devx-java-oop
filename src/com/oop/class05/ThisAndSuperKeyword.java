package com.oop.class05;

class Animal{
    int data = 5;

    public void printData(){
        System.out.println(data);
    }
}


class Cat extends Animal{
    int data = 6; // Instance

    public void printData(){
         super.printData();               // 5
         System.out.println(super.data); // 5
         System.out.println(data);      // 6
    }
}

public class ThisAndSuperKeyword {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.printData();
    }
}


