package com.oop.class04;

class Animal{
    static int count;

    Animal(){
        count++;
    }

    public void displayC(){
        System.out.println(count);
    }
}

public class RecapOfStaticExample2 {
    public static void main(String []args){
        Animal a1 = new Animal();
        Animal a3 = new Animal();
        Animal a2 = new Animal();

        a1.displayC();
        a2.displayC();
        a3.displayC();
    }


}
