package com.company;

public class Main {

    /* Inheritance concept in Java */

    public static void main(String[] args) {

        Principal obj = new Principal();
        obj.show();
        obj.click();
        obj.bark();
        System.out.println(obj.id);
        System.out.println(obj.name);
        obj.speak();
        obj.eat();
        obj.loud();

    }
}

class Students {
    int id = 10;
    String name = "Alps";

    void show() {
        System.out.println("We are from Algonquin College.");
    }

    void click() {
        System.out.println("We are clicking photos.");
    }

    void bark() {
        System.out.println("Dog is barking.");
    }

}

/* Single inheritance */
class Teachers extends Students {
    void speak() {
        System.out.println("We are welcoming you to our college's festival.");
    }

    void eat() {
        System.out.println("They are eating.");
    }
}

/* Multi-level inheritance*/
class Principal extends Teachers {
    void loud() {
        System.out.println("They are cheering loudly.");
    }
}
