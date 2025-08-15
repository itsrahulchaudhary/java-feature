package com.rahul.java8.set2;

import java.util.List;
// Write a Java 8 program to find the sum of all even numbers in a list of integers ?
public class F05EvenNumberSumCalculator {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int i = calculateEvenNumberSum(numbers);
        System.out.println(i);
    }

    public static int calculateEvenNumberSum(List<Integer> num){
        return  num.stream().filter(p -> p % 2==0).mapToInt(n ->n).sum();
    }
}
