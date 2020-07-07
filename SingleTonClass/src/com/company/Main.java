package com.company;

public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable(){
            public void run(){
                Abc obj = Abc.getInstance();
            }
        });
        Thread thread1 = new Thread(new Runnable(){
            public void run(){
                Abc obj = Abc.getInstance();
            }
        });

        thread.start();
        thread1.start();
    }
}

class Abc {
    public static Abc obj;

    private Abc() {

        System.out.println("Creating Singleton class...");
    }

    public static Abc getInstance() {    // Double checked locking....
        if (obj == null) {

            synchronized (Abc.class) {

                if (obj == null) {
                    obj = new Abc();
                }
            }
        }
        return obj;
    }
}
