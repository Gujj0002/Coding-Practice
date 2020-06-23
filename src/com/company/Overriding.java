package com.company;

public class Overriding {

    /* Overriding method */
    public static void main(String[] args) {

        Iphone i = new Iphone();
        Samsung s = new Samsung();
        Nokia n = new Nokia();
        phone p = new phone();

        p.getModelName();
        i.getModelName();
        s.getModelName();
        n.getModelName();

    }
}

class phone {
    void getModelName() {
        System.out.println("This is phone store");
    }
}

class Iphone extends phone {
    void getModelName() {
        System.out.println("This is Iphone");
    }
}

class Samsung extends phone {
    void getModelName() {
        System.out.println("This is Samsung");
    }
}

class Nokia extends phone {
    void getModelName() {
        System.out.println("This is Nokia");
    }
}


