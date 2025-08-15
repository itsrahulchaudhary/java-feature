package com.rahul.java8.set2;

import java.util.Arrays;
import java.util.List;

// Write a Java 8 program to calculate the sum of integers in a list ?
public class F02SumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int i = calculateSum(numbers);
        System.out.println(i);
    }

    public static int calculateSum(List<Integer> num){
        return num.stream().reduce(0, Integer::sum);
    }
}
