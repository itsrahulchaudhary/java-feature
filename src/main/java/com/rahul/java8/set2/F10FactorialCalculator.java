package com.rahul.java8.set2;

import java.util.stream.IntStream;

// Write a Java 8 program to find the factorial of a given number ?
public class F10FactorialCalculator {
    public static void main(String[] args) {
        int i = calculateFactorial(5);
        System.out.println(i);

    }

    public static int calculateFactorial(int num){
        return IntStream.rangeClosed(1,num).reduce(1,(a,b) -> a*b);
    }
}
