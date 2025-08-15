package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
//  Write a Java 8 program to find and print the maximum value from a list.
public class F04FindMaxValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Integer i = numbers.stream().max(Integer::compare).get();
        System.out.println(i);
    }
}
