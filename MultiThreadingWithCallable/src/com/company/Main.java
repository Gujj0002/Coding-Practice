package com.company;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service =  Executors.newSingleThreadExecutor();
        Employee employee = new Employee(20);
        Future<Integer> future = service.submit(employee);
        Integer result = future.get();
        System.out.println(result);

    }
}
