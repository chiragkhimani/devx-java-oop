package com.oop.class02;



public class BankTester {

    public static void main(String[] args) {
        Bank acc1 = new Bank();

        Bank acc2 = new Bank("TX", 5000);

        acc1.displayCustInfo();

    }

}
