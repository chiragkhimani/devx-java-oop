package com.oop.class09;

public class FinallyBlockExample {
    public static void main(String[] args) {
        int a = 10, b = 0;
        String str = null;
        int data[] = new int[50000000];

        try{
            System.out.println("1.opening browser");
            System.out.println(str.length());
        }
        finally {
            System.out.println("1.closing browser");
        }

        try{
            System.out.println("2.opening browser");
            System.out.println(a/b);
        }
        finally {
            System.out.println("2.closing browser");
        }



    }
}
