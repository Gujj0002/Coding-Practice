package com.company;

public class Abstraction {

    /* Abstraction in Java*/
    public static void main(String[] args) {

        zoo z = new zoo();
        z.bark();
        z.eat();
        z.run();
        z.swim();
    }
}
abstract class Animal{
    public abstract void eat();
    public abstract void bark();
    public abstract void run();
}
abstract class Creatures extends Animal{
    public abstract void swim();
}
class zoo extends Creatures{

    @Override
    public void eat() {
        System.out.println("They are eating");
    }

    @Override
    public void bark() {
        System.out.println("They are barking");
    }

    @Override
    public void run() {
        System.out.println("They are running");
    }

    @Override
    public void swim() {
        System.out.println("They are swimming");
    }
}
