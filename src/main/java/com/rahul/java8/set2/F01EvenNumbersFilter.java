package com.rahul.java8.set2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Write a Java 8 program to filter even numbers from a list ?
public class F01EvenNumbersFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumber = findEvenNumber(numbers);
        System.out.println(evenNumber);
    }

    public static List<Integer> findEvenNumber(List<Integer> num){
        return num.stream().filter(n ->n % 2 == 0).collect(Collectors.toList());
    }
}
