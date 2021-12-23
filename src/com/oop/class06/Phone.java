package com.oop.class06;

public class Phone {
    public void call(){
        System.out.println("calling");
    }

    public void text(){
        System.out.println("texting");
    }
}

class SmartPhone extends Phone{
    public void surfInternet(){
        System.out.println("surfing");
    }

    public void call(){
        System.out.println("WIFI calling");
    }
}
