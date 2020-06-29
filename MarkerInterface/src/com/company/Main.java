package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Employee employee = new Employee(100, "Alps", 10000);
        objectOutputStream.writeObject(employee);
        objectOutputStream.flush();
        objectOutputStream.close();

    }
}

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
