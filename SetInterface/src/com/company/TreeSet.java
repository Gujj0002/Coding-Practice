package com.company;

public class TreeSet {
    public static void main(String[] args) {

        java.util.TreeSet<String> treeSet = new java.util.TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Mango");
        treeSet.add("Grapes");
        treeSet.add("Orange");
        treeSet.add("Fig");

        System.out.println(treeSet);

        java.util.TreeSet<Integer> treeSet1 = new java.util.TreeSet<>();
        treeSet1.add(1);
        treeSet1.add(5);
        treeSet1.add(10);
        treeSet1.add(17);
        treeSet1.add(2);

        System.out.println(treeSet1);
    }
}
