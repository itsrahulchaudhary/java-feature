package com.rahul.java8.set2;

import java.util.List;

//  Write a Java 8 program to check if all elements in a list are greater than a given value?
public class F09AllElementsChecker {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 20, 30, 40, 50);
        int threshold = 25;
        boolean result = areAllElementsGreaterThan(numbers, threshold);
        System.out.println("Are all elements greater than " + threshold + "? " + result);
    }

    public static boolean areAllElementsGreaterThan(List<Integer> num, int target){
        return num.stream().allMatch(b -> b > target);
    }
}
