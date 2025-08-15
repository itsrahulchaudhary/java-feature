package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to map integers to their squares and print results.
public class F03MapToSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.stream().map(i -> i*i).forEach(System.out::println);
    }
}
