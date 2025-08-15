package com.rahul.java8.set1;

import java.util.concurrent.CompletableFuture;

// Write a Java 8 program to create and print result from a CompletableFuture asynchronously.
public class F18CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() ->1+2);
        future.thenAccept(System.out::println);
    }
}
