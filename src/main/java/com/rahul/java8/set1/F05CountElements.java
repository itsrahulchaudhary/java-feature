package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to count and print the number of elements in a list.
public class F05CountElements {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear");
        long count = words.stream().count();
        System.out.println(count);
    }
}
