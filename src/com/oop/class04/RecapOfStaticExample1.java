package com.oop.class04;

class Car{
    static int count;
    int c;

    Car(){
        count = count + 1;
        c = count;
    }

    public void displayC(){
        System.out.println(c);
    }
}

public class RecapOfStaticExample1 {
    public static void main(String []args){
        Car c1 = new Car();
        Car c3 = new Car();
        Car c2 = new Car();

        c1.displayC();
        c2.displayC();
        c3.displayC();
    }


}
