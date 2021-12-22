package com.oop.class05;

class Parent{
    int data = 5; // Instance

}

class Child extends Parent{
    int data = 6; // Instance

    public void printData(){
         int data = 10; // Local variable hiding data of instance variable
         System.out.println(super.data);
    }
}


public class TypesOfVariables {
    public static void main(String[] args) {
        Child c = new Child();
        c.printData();
    }
}
