package com.oop.class09;

public class ExceptionMultipleCatchOneTry {
    public static void main(String[] args) {
        int a = 10, b = 0;
        String str = null;
        int data[] = new int[5];

        try{
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("1");
        }
        
        try{
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("2");
        }

        try {
            System.out.println(data[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("3");
        }




    }
}
