package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;

// Write a Java 8 program to check if any number in a list is even.
public class F20AnyMatchExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        boolean anyMatch = numbers.stream().anyMatch(p -> p % 2 == 0);
        System.out.println(anyMatch);
    }
}
