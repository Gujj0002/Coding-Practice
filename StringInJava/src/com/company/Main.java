package com.company;

public class Main {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        ConcatTest.concatWithString();
        System.out.println("Time taken by Concating with String: "
                + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        ConcatTest.concatWithStringBuffer();
        System.out.println("Time taken by Concating with  StringBuffer: "
                + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        ConcatTest.concatWithStringBuilder();
        System.out.println("Time taken by Concating  with  StringBuilder: "
                + (System.currentTimeMillis() - startTime) + "ms");


    }
}

class ConcatTest {
    public static String concatWithString() {
        String t = "Java";
        for (int i = 0; i < 10000; i++) {
            t = t + "point";
        }
        return t;
    }

    public static String concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("Java");
        for (int i = 0; i < 10000; i++) {
            sb.append("point");
        }
        return sb.toString();
    }

    public static String concatWithStringBuilder() {
        StringBuilder sb2 = new StringBuilder("Java");
        for (int i = 0; i < 10000; i++) {
            sb2.append("point");
        }
        return sb2.toString();
    }
}