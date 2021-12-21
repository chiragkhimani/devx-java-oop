package com.oop.class04;

public class PrePostIncrement {
    public static void main(String[] args) {
        int i=1;

        // There are two operators in this expression & post increment operator is having last priority
        // So first assignment operator will be performed & then it'll increment value of i
        int j = i++;

        System.out.println(i); // 2
        System.out.println(j); // 1
    }
}
