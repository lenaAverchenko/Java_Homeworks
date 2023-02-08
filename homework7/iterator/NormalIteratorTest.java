package de.telran.averchenko.elena.homework7.iterator;

import java.util.Arrays;
import java.util.Random;

public class NormalIteratorTest {
    public static void main(String[] args) {

        // Task 5 level 1

        Random random = new Random();
        int[] integers = new int[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(integers));


        for (int element:integers) {
            System.out.println(element);
        }

        System.out.println("_____With The NormalIterator______");
        NormalIterator normalIterator = new NormalIterator(integers);
        int tempValListIterator = 0;
        while(normalIterator.hasNext()){
            tempValListIterator = normalIterator.next();
            System.out.println(tempValListIterator);
        };

    }
}
