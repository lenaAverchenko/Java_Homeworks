package de.telran.averchenko.elena.homework12;

import java.util.*;

public class StringTest {
    public static void main(String[] args) {

        // Level 1 Task 5

        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
                "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate " +
                "velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
                "sunt in culpa qui officia deserunt mollit anim id est laborum.";
        char[] allTheChars = string.toCharArray();
        Set<Character> tempCharSet = new HashSet<>();
        for (int i = 0; i < allTheChars.length; i++) {
            tempCharSet.add(allTheChars[i]);
        }
        List<Character> newUniqueChars = new ArrayList<>();
            newUniqueChars.addAll(tempCharSet);

        System.out.println(newUniqueChars);

        Map<Character,String> amountOfLetters = new HashMap<>();

        for (int i = 0; i < newUniqueChars.size(); i++) {
            int counter = 0;
            for (int j = 0; j < allTheChars.length; j++) {
                if (Character.compare(allTheChars[j],newUniqueChars.get(i))==0) {
                    counter++;
                }
            }
            String tempStr = "appears " + counter + " times in the text.";
            amountOfLetters.put(newUniqueChars.get(i),tempStr);
        }
        System.out.println(amountOfLetters);

        Character[] keys = amountOfLetters.keySet().toArray(new Character[0]);
        for (int i = 0; i < keys.length; i++) {
            System.out.printf(("The Character %c " + amountOfLetters.get(keys[i])+ "\n"), keys[i]);
        }



    }
}
