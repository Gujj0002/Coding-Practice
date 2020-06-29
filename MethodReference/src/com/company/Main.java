package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee = Method::saySomething;     // Method reference...
        employee.show();

        Thread thread = new Thread(Method::saySomething);  //using predefined functional interface Runnable to refer static method.
        thread.start();

        Method method = new Method();
        Employee employeeA = Method::saySomething;     // Calling interface method
        employeeA.show();

        Employee employeeB = new NonStaticMethod()::saySomething; //Referring non-static method using anonymous object
        employeeB.show();

        Manageable hello = Message::new;    //  referring constructor with the help of functional interface.
        hello.getMessage("Hi there!");


    }
}

interface Employee {
    void show();
}

class Method {
    public static void saySomething() {
        System.out.println("You're learning method reference in Java!");
    }
}

class NonStaticMethod {
    public void saySomething() {
        System.out.println("This is non-static method");
    }
}

interface Manageable {
    Message getMessage(String msg);
}

class Message {
    Message(String msg) {
        System.out.print(msg);
    }
}
