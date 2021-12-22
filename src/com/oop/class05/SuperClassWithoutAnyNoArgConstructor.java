package com.oop.class05;

class Person{
    Person(String name){
        System.out.println("Name = "+name); // 1
    }
}


class Engineer extends Person{
    Engineer(){
        super("Mansur");
        System.out.println("Engineer does not need name"); // 2
    }
}


public class SuperClassWithoutAnyNoArgConstructor {
    public static void main(String[] args) {
        Engineer e  = new Engineer();
    }
}
