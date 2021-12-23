package com.oop.class06;

class Animal1{
     Animal1(){
        System.out.println("1. From Animal");
    }
}

class Cat1 extends Animal1{
     Cat1(){
        System.out.println("2. From Cat");
    }
}

class WildCat1 extends Cat1{
     WildCat1(){
        System.out.println("3. From Wild Cat");
    }
}

public class ConstructorChainingExample2{
    public static void main(String []args){
        WildCat1 w = new WildCat1();
    }
}