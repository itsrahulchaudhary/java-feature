package com.rahul.java8.set1;
// Write a Java 8 program to create a custom functional interface for addition.
public class F15CustomFunctionalInterface {
    public static void main(String[] args) {
        MyFunction add = (a, b) -> a+b;
        System.out.println(add.apply(10,20));
    }
}


@FunctionalInterface
interface MyFunction{
    int apply(int a, int b);
}