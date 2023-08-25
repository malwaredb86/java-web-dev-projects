package org.launchcode;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.Character.isAlphabetic;

public class CharacterCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String quote = input.nextLine();
//        String hiddenFigures = "If the product of two terms is zero then common " +
//                "sense says at least one of the two terms has to be zero to start " +
//                "with. So if you move all the terms over to one side, you can put " +
//                "the quadratics into a form that can be factored allowing that side " +
//                "of the equation to equal zero. Once you’ve done that, it’s pretty " +
//                "straightforward from there.";

//
        char[] charactersInString = quote.toLowerCase().toCharArray();


        HashMap<Character, Integer> characters = new HashMap<>();

        for (int i = 0; i < charactersInString.length; i++) {
            if (!characters.containsKey(charactersInString[i]) && isAlphabetic(charactersInString[i])) {
                characters.put(charactersInString[i], 1);
            } else if (characters.containsKey(charactersInString[i]) && isAlphabetic(charactersInString[i])) {
                Integer count = characters.get(charactersInString[i]);
                characters.put(charactersInString[i], count + 1);

            }
        }
        System.out.println(characters);

    }
}
