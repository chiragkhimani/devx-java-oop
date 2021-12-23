package com.oop.class06;

// By Changing just return type we cannot overload the method
class KittyCat {

    String eat(String item) {
        return null;
    }

    boolean eat(int item) {
        return false;
    }
}


public class MethodOverloadingExample {
    public static void main(String[] args) {
        KittyCat c = new KittyCat();
        c.eat("20");
    }
}
