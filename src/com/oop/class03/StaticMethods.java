package com.oop.class03;

class Company{

    String companyName; // Instance
    static String regulation; // Static

    public void displayCompanyName(){   // instance method
        System.out.println(companyName);
    }

    public static void displayRegulation() { // static method
        System.out.println(regulation);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        // How we access static members
        System.out.println(Company.regulation);
        Company.displayRegulation();

        // How we access instance members
        Company c = new Company();
        System.out.println(c.companyName);
        c.displayCompanyName();

        sum();

    }

    static void sum(){

    }
}
