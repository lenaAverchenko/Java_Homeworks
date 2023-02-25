package de.telran.averchenko.elena.homework12;

import java.util.*;

public class ThousandTest {
    public static void main(String[] args) {

        // Level 1 Task 7

        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(random.nextInt(500));
        }
        Set<Integer> newInt = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            newInt.add(list.get(i));
        }
        List<Integer> listToCompare = new ArrayList<>();
        listToCompare.addAll(0,newInt);

        Map<Integer, Integer> repeatedNumbers = new HashMap<>();

        for (int i = 0; i < listToCompare.size(); i++) {
            int counter = 0;
            for (int j = 1; j < list.size(); j++) {
                if (Integer.compare(list.get(j), listToCompare.get(i))==0){
                    counter = counter+1;
                }
            }
            repeatedNumbers.put(listToCompare.get(i),counter);
            System.out.printf("The %d number repeats %d times. \n", listToCompare.get(i),counter);
        }
    }
}
