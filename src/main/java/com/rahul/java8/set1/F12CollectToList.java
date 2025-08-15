package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//Write a Java 8 program to collect squares of numbers into a new list.
public class F12CollectToList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<Integer> squires = numbers.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(squires);
    }
}
