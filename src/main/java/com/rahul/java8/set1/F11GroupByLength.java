package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Write a Java 8 program to group strings by their lengths and print the groups.
public class F11GroupByLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("a", "bb", "ccc", "dd");
        Map<Integer, List<String>> collect = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }
}
