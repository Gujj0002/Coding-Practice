package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class products{
    int id, price;
    String name;

    public products(int id, int price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
public class MethodsInStream {
    public static void main(String[] args) {

        List<products> list = new ArrayList<>();
        list.add(new products(1,25000,"HP Laptop"));
        list.add(new products(2,30000,"Dell Laptop"));
        list.add(new products(3,35000,"Leneva Laptop"));
        list.add(new products(4,42000,"Sony Laptop"));
        list.add(new products(5, 75000,"Apple Laptop"));

        Integer list1 = list.stream().map(o -> o.price).reduce(0,(sum , price) -> sum + price);
        System.out.println(list1);

        /* Convert into set ..*/
        Set<Integer> list2 =
                list.stream()
                        .filter(product->product.price < 30000)
                        .map(product->product.price)
                        .collect(Collectors.toSet());
        System.out.println(list2);

        /* Convert into Map...*/
        Map<Integer,String> list3 =
                list.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));

        System.out.println(list3);

        /* Method reference in Stream...*/
        List<Integer> list4 =
                list.stream()
                        .filter(p -> p.price > 30000)
                        .map(products::getPrice)
                        .collect(Collectors.toList());
        System.out.println(list4);

    }
}

