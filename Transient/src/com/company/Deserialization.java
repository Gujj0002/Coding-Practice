package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("f.txt"));
        Student s=(Student)objectInputStream.readObject();
        System.out.println(s.id+" "+s.name+" "+s.age);
        objectInputStream.close();
    }
}
