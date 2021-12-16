package com.oop.class03;

class Bank{
    // Instance variable balance will have separate copy for each object
    // Instance variable belongs to the object meaning object owns instance variable
    // Example : IndividualIncome
    int balance;

    // Static variable belongs to the class
    // Static variable has single copy at class level regardless of how many objects we are
    // creating from class - Example : FamilyIncome
    static int numOfAcc;

    public void displayBalance(){
        System.out.println(balance);
        System.out.println(numOfAcc);
    }

    public static void displayNumOfAcc(){
        System.out.println(numOfAcc);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank();

        // Each object will have balance copy, so it'll be different based on object
        b1.balance = 20;
        b2.balance = 50;

        // Only one copy of static variable will be created, so it'll print latest value of
        // numOfAcc as we've only one copy, so it'll print last updated value
        Bank.numOfAcc = 1;
        Bank.numOfAcc = 2;

        b2.displayBalance(); // Calling instance method using object
        Bank.displayNumOfAcc(); // calling static method using class name
    }
}
