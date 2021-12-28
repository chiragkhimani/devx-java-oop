package com.oop.class07;


class PayPal {

    public void displayInterestRate(Bank bank){
        bank.displayInterestRate();
    }

}

public class PayPalTester{
    public static void main(String[] args) {
          CitiBank acc1 = new CitiBank();
          PayPal p = new PayPal();
          p.displayInterestRate(acc1);
    }
}




