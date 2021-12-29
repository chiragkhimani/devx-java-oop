package com.oop.class08;

public interface Car {

     void drive();

     void pressBreak();

     void playMusic();

     void reverse();

}

interface SportsCar extends Car{
     void accelerateAtHighSpeed();
}

class Toyota implements Car, SportsCar{

     @Override
     public void drive() {

     }

     @Override
     public void pressBreak() {

     }

     @Override
     public void playMusic() {
          System.out.println("Alexa, play music");
     }

     @Override
     public void reverse() {

     }

     @Override
     public void accelerateAtHighSpeed() {

     }
}

class Ford implements  Car{

     @Override
     public void drive() {

     }

     @Override
     public void pressBreak() {

     }

     @Override
     public void playMusic() {
          System.out.println("Press music button");
     }

     @Override
     public void reverse() {

     }
}

class RepairShop{
     public void repair(Car c){

     }
}
