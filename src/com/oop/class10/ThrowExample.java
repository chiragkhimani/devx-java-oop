package com.oop.class10;

public class ThrowExample {
    public static void main(String[] args) {

        int dayNumber = 12;

        switch (dayNumber){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            default:
                throw new RuntimeException("Please enter valid number");
        }

        System.out.println("We are using entered number");
    }
}
