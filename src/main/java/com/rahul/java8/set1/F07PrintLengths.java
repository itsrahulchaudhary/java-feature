package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to print the lengths of strings in a list.
public class F07PrintLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Python", "JavaScript");
        words.stream().forEach(s -> System.out.println(s.length()));
    }
}
