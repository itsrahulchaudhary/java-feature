package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to print names sorted in alphabetical order from a list.
public class F09SortedOrder {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Charlie", "Alice", "Bob");
        names.stream().sorted().forEach(System.out::println);
    }
}
