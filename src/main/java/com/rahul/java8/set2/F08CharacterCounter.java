package com.rahul.java8.set2;

import java.util.List;

// Write a Java 8 program to count the occurrences of a given character in a list of strings?
public class F08CharacterCounter {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "cherry");
        char targetChar = 'a';
        long l = countCharacterOccurrences(strings, targetChar);
        System.out.println("Occurrences of '" + targetChar + "': " + l);
    }
    
    public static long countCharacterOccurrences(List<String> str, char targetChar){
        return str.stream().flatMapToInt(CharSequence::chars).filter( c -> c ==targetChar).count();
    }
}
