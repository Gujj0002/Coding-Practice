package com.company;

public class LinkedList {

    public static void main(String[] args) {


        /* LinkedList implementation */

        java.util.LinkedList<String> linkedList = new java.util.LinkedList<>();
        linkedList.add("Watermelon");
        linkedList.add("Banana");
        linkedList.add("Mango");
        linkedList.add("Dragon-fruit");
        linkedList.add("Orange");

        System.out.println("This is linkedList :" + linkedList);

        linkedList.addFirst("cherry");
        linkedList.addLast("Almond");

        System.out.println("After adding addFirst and addLast elements : " + linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("After removing removeFist and removeLast elements :" + linkedList);

        linkedList.remove(2);
        linkedList.add(2, "Juice");

        System.out.println("The final list :" + linkedList);
    }
}
