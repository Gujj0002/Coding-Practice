package com.company;

public class Polymorphism {

    /* Overloading method */
    public static void main(String[] args) {

        Part p = new Part();
        p.show();
        p.show(10);
        p.show(10.5);
        p.show(1.5f);
    }
}
class Part{
    void show() {
        System.out.println("We are from Algonquin College.");
    }

    void show(int i) {
        System.out.println("We are clicking photos.");
    }

    void show( double d) {
        System.out.println("Dog is barking.");
    }

    void show(float f){
        System.out.println("They are running");
    }
}
