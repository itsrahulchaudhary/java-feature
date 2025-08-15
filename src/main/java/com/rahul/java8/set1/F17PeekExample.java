package com.rahul.java8.set1;

import java.util.Arrays;
import java.util.List;

// Write a Java 8 program using peek to print processed elements during a stream operation.
public class F17PeekExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.stream().peek(n -> System.out.println("Processing : "+n) )
                .map(m -> m*m)
                .forEach(System.out::println);
    }
}
