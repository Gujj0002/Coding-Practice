package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException {

        Student student =new Student(20,"Alps",25);//creating object

        FileOutputStream fileOutputStream=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(fileOutputStream);
        out.writeObject(student);
        out.flush();

        out.close();
        fileOutputStream.close();
        System.out.println("success");
    }
}
