package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to filter and print even numbers from a list.
public class F02FilterEvenNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        numbers.stream().filter(i -> i%2 ==0).forEach(System.out::println);
    }
}
