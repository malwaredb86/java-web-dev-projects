package org.example;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("mal");
        words.add("is");
        words.add("a");
        words.add("badass");
        words.add("bitch");

        Scanner input = new Scanner(System.in);
        System.out.print("How many letters: ");
        int wordLength = input.nextInt();

        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() == wordLength) {
                System.out.println(words.get(i));
            }
        }




//        for (String word : words){
//            if (word.length() == 5) {
//                System.out.println(word);
//            }
//        }

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        Integer sum = 0;

        for (int i = 0; i < numbers.size(); i++ ) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
                System.out.println("Total is " + sum);
            }
        }
    }
}
