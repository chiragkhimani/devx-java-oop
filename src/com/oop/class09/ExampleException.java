package com.oop.class09;

public class ExampleException {
    public static void main(String[] args) {
        int a=10, b=0;

        int data[] = new int[5];

        System.out.println("Start........");

        String str = null;

        System.out.println(str.length());

        // It'll execute 13,14 - Exception, 15 - do we have arithmeticException?
      try {
          System.out.println(a / b);
      }catch (Exception alex){
          System.out.println("Error! please try after sometime");
      }

        System.out.println("Hello........");
    }
}
