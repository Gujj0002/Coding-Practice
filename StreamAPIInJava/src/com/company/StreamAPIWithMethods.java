package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPIWithMethods {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(10,12,15,25,35);

        System.out.println("demonstration of map method:  ");
        List<Integer> square = number.stream().map(x -> x*x).
                collect(Collectors.toList());
        System.out.println(square);

        System.out.println("demonstration of reduce method:  ");
        Integer squareA = number.stream().map(x -> x+x)
                .reduce(0 , (c,e)-> c + e);
        System.out.println(squareA);

        System.out.println("collect method returns a set:  ");
        Set<Integer> squareSet =
                number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        System.out.println("demonstration of forEach method: ");
        number.stream().map(x->x*x).forEach(y->System.out.println(y));




        List<String> names = Arrays.asList("Apple","Mango","Banana","Watermelon","Beans");

        System.out.println("demonstration of filter method:  ");
        List<String> result = names.stream().filter(s->s.startsWith("B")).
                collect(Collectors.toList());
        System.out.println(result);

        System.out.println("demonstration of sorted method: ");
        List<String> show =
                names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

    }
}
