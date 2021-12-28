package com.oop.class07;

public class Car {

    private int balance = 1000;

    // Getter - get value of variable - read access
    public int getBalance(){
        // ask security question
        // ask why you need money?
        // what'll you gonna do?
        // do you have username /password?

        return balance;
    }

    // Setter - set value of variable - write access
    public void setBalance(int balance){
        this.balance = balance;
    }
}
