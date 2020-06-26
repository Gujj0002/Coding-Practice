package com.company;

public class TreeMap {
    public static void main(String[] args) {

        java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<>();
        treeMap.put(1,"Mango");
        treeMap.put(2,"Apple");
        treeMap.put(3,"Banana");
        treeMap.put(1,"Grapes");

        treeMap.remove(3);

        System.out.println(treeMap.keySet() + ": " + treeMap.values());
    }
}
