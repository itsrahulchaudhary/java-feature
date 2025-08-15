package com.rahul.java8.set2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
//Write a Java 8 program to find the maximum element from a list ?
public class F03MaxNumberFinder {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 7, 2, 9, 5);
        Optional<Integer> i = maxNumber(numbers);
        System.out.println(i.get());
    }

    public static Optional<Integer> maxNumber(List<Integer> num){
      return   num.stream().max(Integer::compareTo);
    }
}
