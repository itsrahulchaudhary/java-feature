package com.rahul.java8.set2;

import java.util.Arrays;
import java.util.List;
// Write a Java 8 program to check if a list contains a specific element ?
public class F04NumberChecker {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean b = checkIfContainsNumber(numbers, 3);
        System.out.println(b);
    }

    public static boolean checkIfContainsNumber(List<Integer> num, int target){
        return num.stream().anyMatch( n -> n == target);
    }
}
