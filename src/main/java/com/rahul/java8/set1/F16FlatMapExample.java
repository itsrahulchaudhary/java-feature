package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program using flatMap to print characters from lists of strings.
public class F16FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> list = Arrays.asList(Arrays.asList("A", "B"), Arrays.asList("C", "D"));
        list.stream().flatMap(List::stream).forEach(System.out::println);
    }
}
