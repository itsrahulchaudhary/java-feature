package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to limit and skip elements in a list, then print.
public class F13LimitAndSkip {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 8);
        list.stream().skip(2).limit(3).forEach(System.out::println);
    }
}
