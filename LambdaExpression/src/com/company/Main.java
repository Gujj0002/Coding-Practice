package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<product> list = new ArrayList<>();
        list.add(new product(10,"Iphone",25000f));
        list.add(new product(15,"Samsung",28000f));
        list.add(new product(12,"Mi",25456f));
        list.add(new product(17,"Nokia",23000f));
        list.add(new product(21,"Bell",45000f));

        System.out.println("Sorting on basic of name.");

        Collections.sort(list,(o1, o2) ->{            // Lambda expression....
            return o1.name.compareTo(o2.name);
        });
        for (product p : list){
            System.out.println(p.id + " " + p.name + " " + p.price);
        }
    }
}
class product{
    int id;
    String name;
    float price;

    public product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
