package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class arrayList {

    public static void main(String[] args) {

        /* ArrayList Implementation..*/

        java.util.ArrayList<String> arrayList = new java.util.ArrayList<>();    // Creating ArrayList..
        arrayList.add("Watermelon");                        // Adding elements in list....
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add("Dragon-fruit");

        arrayList.remove("Banana");
        arrayList.add(0, "Orange");

        Collections.sort(arrayList);                         // Sort ArrayList...

        System.out.println(arrayList);                      // Print out list....

        /* Traversing list through Iterator  */

        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
