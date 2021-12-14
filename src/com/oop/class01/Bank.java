package com.oop.class01;

public class Bank {

    String branchAddress;
    String accNumber;
    String accName;
    String typeOfAccount;
    double balance;

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void checkBalance(){
        System.out.println(balance);
    }

    public void printAccountInfo(){
        System.out.println(balance);
        System.out.println(accNumber);
        System.out.println(accName);
        System.out.println(typeOfAccount);
    }


}
