package com.oop.class06;

class Parent{

}

class Child extends Parent{
    Child(){
        super(); // This is added by java by default when we have no argument constructor in parent class
    }
}


class GrandChild extends Child{
    GrandChild(String name){
        super();
        System.out.println("3. Wild Cat - "+ name);
    }
}

public class SuperKeywordWithConstructorExample{
    public static void main(String []args){
        GrandChild w = new GrandChild("Jhonty");
    }
}
