package com.company;

public class Enum {
    public static void main(String[] args) {

        Number obj = Number.INSTANCE;
        obj.i = 5;
        obj.show();

        Number obj1 = Number.INSTANCE;
        obj1.i = 6;
        obj1.show();

    }
}
enum Number{
    INSTANCE;     // This is basically a static instance method..
    int i;

    public void show(){

        System.out.println(i);
    }
}
