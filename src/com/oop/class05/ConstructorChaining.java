package com.oop.class05;

class Bank{
    Bank(){
        System.out.println("From Bank class");
    }
}

class HSBCBank extends Bank{
    HSBCBank(){
        System.out.println("From HSBC Bank class");
    }
}

class CitiBank extends HSBCBank{
    CitiBank(){
        System.out.println("From Citi Bank class");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        CitiBank hsbc = new CitiBank();
    }
}
