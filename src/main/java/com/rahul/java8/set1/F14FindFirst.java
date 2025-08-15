package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to find and print the first element in sorted order.
public class F14FindFirst {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        Integer i = numbers.stream().sorted().findFirst().get();
        System.out.println(i);
    }
}
