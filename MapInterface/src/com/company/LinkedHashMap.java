package com.company;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<Integer, String> linkedHashMap = new java.util.LinkedHashMap<>();
        linkedHashMap.put(1,"Mango");
        linkedHashMap.put(2,"Apple");
        linkedHashMap.put(3,"Banana");
        linkedHashMap.put(1,"Grapes");

        linkedHashMap.remove(1);


        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Value: " + linkedHashMap.values());
        System.out.println("The list: " + linkedHashMap.entrySet());
    }
}
