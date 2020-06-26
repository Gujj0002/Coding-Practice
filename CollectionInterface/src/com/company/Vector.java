package com.company;

public class Vector {

    public static void main(String[] args) {

        java.util.Vector<String> vector = new java.util.Vector<>();
        vector.add("Watermelon");
        vector.add("Banana");
        vector.add("Mango");
        vector.add("Dragon-fruit");
        vector.add("Orange");

        System.out.println("The vector list: " + vector);
        System.out.println("Size is: "+vector.size());
        System.out.println("Default capacity increment is: "+vector.capacity());

        vector.addElement("fruit1");
        vector.addElement("fruit2");
        vector.addElement("fruit3");

        System.out.println("Size after addition: "+vector.size());
        System.out.println("Capacity after increment is: "+vector.capacity());
    }
}
