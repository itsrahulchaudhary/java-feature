package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to reduce a list of integers to their sum.
public class F06ReduceToSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
