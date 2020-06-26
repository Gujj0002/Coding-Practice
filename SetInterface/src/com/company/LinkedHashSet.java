package com.company;

public class LinkedHashSet {
    public static void main(String[] args) {

        java.util.LinkedHashSet<String> linkedHashSet = new java.util.LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Mango");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Fig");

        System.out.println(linkedHashSet);

        java.util.LinkedHashSet<Integer> linkedHashSet1 = new java.util.LinkedHashSet<>();
        linkedHashSet1.add(1);
        linkedHashSet1.add(5);
        linkedHashSet1.add(10);
        linkedHashSet1.add(17);
        linkedHashSet1.add(23);

        System.out.println(linkedHashSet1);
    }
}
