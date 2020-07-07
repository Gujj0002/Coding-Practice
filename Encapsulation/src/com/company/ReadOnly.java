package com.company;

public class ReadOnly {
    public static void main(String[] args) {

        Employee employee = new Employee();
        System.out.println(employee.getName());
    }
}

class Employee {
    private String name = "Alps";

    public String getName() {
        return name;
    }
}