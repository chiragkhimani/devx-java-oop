package com.oop.class08;

import java.util.ArrayList;
import java.util.List;

class Box <E>{
    E data;

    public E getData(){
        return data;
    }

    public void setData(E data){
        this.data = data;
    }
}


public class Generic {
    public static void main(String[] args) {
        List l = new ArrayList();
        Box<Integer> b1 = new Box<Integer>();
        b1.setData(10);
        System.out.println(b1.getData());

        Box<String> b2 = new Box<String>();
        b2.setData("Chirag");
        System.out.println(b2.getData());
    }
}
