package com.oop.class01;

public class Tester {

    public static void main(String[] args) {

        Bank acc1 = new Bank();
        Bank acc2 = new Bank();

        acc1.balance = 1000;
        acc1.accName = "Tom";
        acc1.typeOfAccount = "Saving";

        acc2.balance = 5000;
        acc2.typeOfAccount = "Saving";
        acc2.accName = "Jerry";

        acc1.printAccountInfo();






    }

}
