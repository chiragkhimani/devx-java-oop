package com.oop.class08;

abstract class Bank{

    int balance;

    Bank(){

    }

    abstract void displayInterestRate();

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public static void printGreetingMsg(){
        System.out.println("Hello");
    }
}

class HSBCBank extends Bank{

    @Override
    void displayInterestRate() {
        System.out.println("3.5%");
    }
}

public class AbstractClassExample{
    public static void main(String[] args) {
        HSBCBank hsbc = new HSBCBank();
    }
}
