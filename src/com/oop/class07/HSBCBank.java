package com.oop.class07;

class Bank{
    public void displayInterestRate(){
        System.out.println("");
    }
}

public class HSBCBank extends Bank{
    public void displayInterestRate(){
        System.out.println("3.5%");
    }
}

class CitiBank extends Bank{
    public void displayInterestRate(){
        System.out.println("6.5%");
    }
}

class ChaseBank extends Bank{
    public void displayInterestRate(){
        System.out.println("6.5%");
    }
}

