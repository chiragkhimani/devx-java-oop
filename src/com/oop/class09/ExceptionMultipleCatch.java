package com.oop.class09;

public class ExceptionMultipleCatch {
    public static void main(String[] args) {
        int a = 10, b = 0;
        String str = null;
        int data[] = new int[5];

        try{
            System.out.println(a/b);
            System.out.println(str.length());
            System.out.println(data[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("1");
        }catch (NullPointerException e){
            System.out.println("2");
        }catch (ArithmeticException e){
            System.out.println("3");
        }catch (Exception e){
            System.out.println("4");
        }



    }
}
