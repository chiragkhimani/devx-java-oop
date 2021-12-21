package com.oop.class04;

class Cat{
     int count;

    Cat(){
        count++;
    }

    public void displayC(){
        System.out.println(count);
    }
}

public class RecapOfStaticExample3 {
    public static void main(String []args){
        Cat a1 = new Cat();
        Cat a3 = new Cat();
        Cat a2 = new Cat();

        a1.displayC();
        a2.displayC();
        a3.displayC();
    }


}
