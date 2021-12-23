package com.oop.class06;

class Bank{
    void displayRateOfInterest(){
        System.out.println("6.5%");
    }
}

class HSBCBank extends Bank{
    @Override
    void displayRateOfInterest(){
        System.out.println("3.5%");
    }
}

class Chase extends Bank{
    void displayRateOfInterest(){
       super.displayRateOfInterest();
       System.out.println("This is best interest rate you'll get in market!");
    }
}


public class MethodOverridng {
    public static void main(String[] args) {
        Chase chase = new Chase();
        chase.displayRateOfInterest();
    }
}
