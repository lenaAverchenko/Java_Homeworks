package de.telran.averchenko.elena.homework7.iterator;

import java.util.Arrays;
import java.util.Random;

public class DimIteratorTest {
    public static void main(String[] args) {

        // Task 1 level 2

        Random random = new Random();
        int[][] dimIntegers = new int[3][3];
        for (int i = 0; i < dimIntegers.length; i++) {
            for (int j = 0; j < dimIntegers.length; j++) {
                dimIntegers[i][j] = random.nextInt(1000);
                System.out.print(dimIntegers[i][j] + " ");
            }
            System.out.println("");
        }


        System.out.println("_____With The DimIterator______");
        DimIterator dimIterator = new DimIterator(dimIntegers);
        int tempValListIterator = 0;
        while(dimIterator.hasNext()){
            tempValListIterator = dimIterator.next();
            System.out.println(tempValListIterator);
        };

    }
}
