package org.launchcode;

import java.util.Scanner;
public class RemoveWord {
    public static void main(String[] args) {
        String firstLine = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice " +
                "she had peeped into the book her sister was reading, but it had " +
                "no pictures or conversations in it, ‘and what is the use of a " +
                "book,’ thought Alice ‘without pictures or conversation?’";
        firstLine = firstLine.toLowerCase();
        Scanner input = new Scanner(System.in);
        System.out.println("What word are you removing:");
        String searchTerm = input.next();
        searchTerm = searchTerm.toLowerCase();
        input.close();

        Integer wordIndex = firstLine.indexOf(searchTerm);
        Integer wordLength = searchTerm.length();

        System.out.println("Your search term first appears at index " + wordIndex + ". Your term is " + wordLength + " characters long.");

        String modifiedSentence = firstLine.replace(searchTerm, "");
        System.out.println(modifiedSentence);
    }
    }
