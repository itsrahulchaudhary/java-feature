package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to print distinct elements from a list of integers.
public class F08DistinctElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4);
        numbers.stream().distinct().forEach(System.out::println);
    }
}
