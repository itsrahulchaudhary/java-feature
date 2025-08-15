package com.rahul.java8.set2;

import java.util.List;
import java.util.stream.Collectors;
// Write a Java 8 program to concatenate all strings in a list ?
public class F06StringConcatenator {
    public static void main(String[] args) {
        List<String> strings = List.of("Hello", " ", "World", "!");
        String s = concatenateStrings(strings);
        System.out.println(s);
    }
    public static String concatenateStrings(List<String> strings){
        return strings.stream().collect(Collectors.joining());
    }
}
