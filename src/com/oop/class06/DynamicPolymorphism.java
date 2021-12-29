package com.oop.class06;

public class DynamicPolymorphism {

    public static void main(String[] args) {
        // Case 1
        Phone p = new Phone();
        p.call();   // calling
        p.text();   // texting
      //  p.surfInternet();

        // Case 2
        SmartPhone  s = new SmartPhone();
        s.call(); // Wifi calling
        s.text(); // texting
        s.surfInternet(); // surfing

        // Case 3 - Dynamic polymorphism
        Phone ps = new SmartPhone();
        ps.call(); // Wifi calling
        ps.text(); // texting
      //  ps.surfInternet();

        // Case 4
       // SmartPhone sp = new Phone();
    }

}
