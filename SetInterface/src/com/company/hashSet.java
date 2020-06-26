package com.company;

import java.util.HashSet;

public class hashSet {

    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Mango");
        hashSet.add("Grapes");
        hashSet.add("Orange");
        hashSet.add("Fig");

        System.out.println("The list of hashSet: " + hashSet);

        hashSet.add("Apple");
        hashSet.add("Orange");
        System.out.println("After adding duplicate values in hashSet: " + hashSet);

        hashSet.add(null);
        hashSet.add(null);
        System.out.println("After adding null values twice in hashSet: " + hashSet);
    }
}
