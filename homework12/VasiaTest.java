package de.telran.averchenko.elena.homework12;

import java.util.HashMap;
import java.util.Map;

public class VasiaTest {
    public static void main(String[] args) {
        // Level 1 Task 6
        Map<Integer,String> result = new HashMap<>();
        result.put(1,"Barcelona");
        result.put(2,"Barcelona");
        result.put(3,"Berlandia");
        result.put(4,"Berlandia");
        result.put(5,"Barcelona");
        result.put(6,"Berlandia");
        result.put(7,"Berlandia");
        result.put(8,"Barcelona");
        result.put(9,"Barcelona");
        result.put(10,"Barcelona");
        result.put(11,"Berlandia");

        int counterBerlandia = 0;
        int counterBarcelona = 0;

        for (int i = 0; i < result.size(); i++) {
            if (result.get(i+1).equals("Berlandia")){
                counterBerlandia++;
                }
            if (result.get(i+1).equals("Barcelona")){
                counterBarcelona++;
            }
        }

        System.out.println(counterBerlandia);
        System.out.println(counterBarcelona);
        if (counterBerlandia>counterBarcelona){
            System.out.println("Berlandia won in 1910");
        }
        if (counterBerlandia<counterBarcelona){
            System.out.println("Barcelona won in 1910");
        }



    }
}
