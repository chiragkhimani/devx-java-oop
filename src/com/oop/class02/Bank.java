package com.oop.class02;

public class Bank {
    String branch = "CL";
    int balance = 1000;

    public void displayCustInfo(){
        System.out.println(branch);
        System.out.println(balance);
    }

    // No Arg Constructor
    Bank(){
        System.out.println("Hello");
    }

    // Parameterized
    Bank(String branchFromUser, int balFromUser){
        branch = branchFromUser;
        balance = balFromUser;
        System.out.println("Hello");
    }

}
