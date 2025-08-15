package com.rahul.java8.set1;

import java.util.Optional;
//  Write a Java 8 program using Optional to check if a value is present.
public class F10OptionalExample {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Java");
        name.ifPresent(System.out::println);
    }
}
