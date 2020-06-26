package com.company;

public class Stack {
    public static void main(String[] args) {

        java.util.Stack<String> stack = new java.util.Stack<>();
        stack.push("Mango");
        stack.push("Banana");
        stack.push("Watermelon");
        stack.push("Almond");
        stack.push("Juice");

        System.out.println("The list of stack: " +stack);

        stack.pop();
        System.out.println("The list after remove elements in stack: " +stack);

    }
}
