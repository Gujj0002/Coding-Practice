package com.company;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

public class Employee implements Callable<Integer> {

    private int counter = 0;

    public Employee(int counter) {
        this.counter = counter;
    }

    @Override
    public Integer call() throws Exception {
        int result = 0;
        for (int i =0; i < 100; i++){
            result+=i;
        }
        return result;
    }
}
