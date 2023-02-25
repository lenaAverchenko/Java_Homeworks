package de.telran.averchenko.elena.homework12;

import java.util.*;

public class PairsTest {
    public static void main(String[] args) {

        // Level 2 Task 2

        Random random = new Random();
        List<Integer> thousand = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            thousand.add(random.nextInt(0,1000));
        }
        Collections.shuffle(thousand);
        int k = random.nextInt(0,1000);
        System.out.println(k);

        Map<Integer, Integer> resultForSum = new HashMap<>();

        for (int i = 0; i < thousand.size()-1; i++) {
            for (int j = i+1; j < thousand.size(); j++) {
                if ((thousand.get(i) + thousand.get(j)) ==k){
                    resultForSum.put(thousand.get(i), thousand.get(j));
                }
            }
        }
        System.out.println(resultForSum);
    }
}
