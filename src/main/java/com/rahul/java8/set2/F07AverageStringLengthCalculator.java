package com.rahul.java8.set2;

import java.util.List;

// Write a Java 8 program to find the average length of strings in a list of strings?
public class F07AverageStringLengthCalculator {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "orange", "grape", "kiwi");
        double v = calculateAverageStringLength(strings);
        System.out.println(v);
    }

    public static double calculateAverageStringLength(List<String> str){
        return str.stream().mapToInt(String::length).average().orElse(0.0);
    }
}
