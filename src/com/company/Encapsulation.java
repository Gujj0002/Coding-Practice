package com.company;

public class Encapsulation {

    /* Encapsulation in Java*/
    public static void main(String[] args) {

        Student s = new Student();
        s.setId(10);
        s.setName("John");
        System.out.println("id: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}
class Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
