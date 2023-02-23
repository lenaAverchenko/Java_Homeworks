package de.telran.averchenko.elena.homework11;

import java.util.*;

public class IntArray {
    public static void main(String[] args) {

        // Level 1 task 7

        List<Integer> intList = Arrays.asList(10,14,8,6,9,14,15,22,5,7);
        Set<Integer> intSet = new HashSet<>();
        for (int i = 0; i < intList.size(); i++) {
            if (intSet.add(intList.get(i)) == false){
                System.out.println("The duplicate is: " + intList.get(i));
                System.out.println("It's position is: " + i);
            }

        }

    }
}
