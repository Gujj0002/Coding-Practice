package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(13);
        list.add(16);
        list.add(17);
        list.add(20);

        /* Printing out even numbers from list...*/
        List<Integer> list1 = list.stream().filter(o -> o%2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        /* Printing out odd number from list...*/
        List<Integer> list2 = list.stream().filter(o -> o%2 != 0).collect(Collectors.toList());
        System.out.println(list2);

        /*Multiply each elements of list by 2.....*/
        List<Integer> list3 = list.stream().map(o -> o * 2).collect(Collectors.toList());
        System.out.println(list3);
    }
}
