package com.oop.class07;

public class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setBalance(5000);
        System.out.println(c1.getBalance()); // 5000,

        // If we do in below way then we don't have control on over data like who modified it & when
        //c1.balance = 5000;
        //System.out.println(c1.balance);

    }
}
