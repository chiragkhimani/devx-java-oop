package com.oop.class06;

class Animal{
    void Animal(){
        System.out.println("1. From Animal");
    }
}

class Cat extends Animal{
    void Cat(){
        System.out.println("2. From Cat");
    }
}

class WildCat extends Cat{
    void WildCat(){
        System.out.println("3. From Wild Cat");
    }
}

public class ConstructorChainingExample1{
    public static void main(String []args){
        WildCat w = new WildCat();
    }
}