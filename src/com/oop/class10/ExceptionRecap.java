package com.oop.class10;

import java.util.Scanner;

public class ExceptionRecap {
    public static void main(String[] args) {
        int a = 10, b = 0;




        try{
            System.out.println("First statement");
            System.out.println(a / b);

        }catch (Exception e){

        }
        finally {
            System.out.println("2nd statement");
            System.out.println("3rd statement");
            System.out.println("4th statement");
        }



    }
}
