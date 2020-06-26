package com.company;

import java.util.HashMap;
import java.util.Set;

public class hashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Mango");
        hashMap.put(2,"Apple");
        hashMap.put(3,"Banana");
        hashMap.put(1,"Grapes");

        Set set = hashMap.entrySet();
        System.out.println(set);

        hashMap.put(4,"Orange");
        System.out.println(set);

        hashMap.remove(1, "Mango");
        System.out.println(set);

        hashMap.replace(2,"Watermelon");
        System.out.println(set);

        System.out.println(hashMap.hashCode());

    }
}
