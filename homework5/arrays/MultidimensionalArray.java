package de.telran.averchenko.elena.homework5.arrays;

import java.util.Random;
import java.util.Scanner;

public class MultidimensionalArray extends LinearArray {
//    LinearArray linearArray = new LinearArray();

//    // For task 1
//    public int[][] createRandomIntegerArray(int maxIntegerInArray, int numberOfElementsString, int numberOfElementsColumn) {
//        Random random = new Random();
//        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
//        for (int i = 0; i < arrayOfIntegers.length; i++) {
//            for (int j = 0; j < arrayOfIntegers.length; j++) {
//                arrayOfIntegers[i][j] = random.nextInt(maxIntegerInArray);
//            }
//
//        }
//        return arrayOfIntegers;
//    }
//    public void showTheArray(int[][] integers) {
//        for (int i = 0; i < integers.length; i++) {
//            for (int j = 0; j < integers.length; j++) {
//                System.out.print(integers[i][j] + " ");
//            }
//            System.out.println("");
//        }
//
//    }
//
//    // For task 2
//    public int[] getSecondaryDiagonalNumbers(int[][] integers) {
//        int[] newArray = new int[integers.length];
//        for (int i = 0; i < integers.length; i++) {
//            for (int j = 0; j < integers.length; j++) {
//                if (j == integers.length - 1 - i) {
//                    newArray[i] = integers[i][j];
//                    System.out.print(integers[i][j] + " ");
//                } else {
//                    System.out.print("");
//                }
//            }
//        }
//        System.out.println("");
//        return newArray;
//    }
//    public void getMaxSecondaryDiagonalNumber(int[] integers) {
//        super.getMaxNumber(integers);
//    }
//    // For task 3
//    public int[][] createDifferentArray(int numberOfElementsString, int numberOfElementsColumn) {
//        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
//        for (int i = 0; i < arrayOfIntegers.length; i++) {
//            for (int j = 0; j < arrayOfIntegers.length; j++) {
//                arrayOfIntegers[i][j] = 7 * i - 3 * j;
//            }
//        }
//        return arrayOfIntegers;
//    }

//
//    public int[][] getSumOfArrays(int[][] arrayOne, int[][] arrayTwo){
//        int[][] newMultidimentionalArray = new int[arrayOne.length][arrayOne.length];
//        if(arrayOne.length == arrayTwo.length){
//            for (int j = 0; j < arrayOne.length; j++) {
//                for (int i = 0; i < arrayOne.length; i++) {
//                    newMultidimentionalArray[i][j] = arrayOne[i][j]+arrayTwo[i][j];
//                }
//            }
//        }else {
//            System.out.println("The sum can't be calculated");
//        }
//        return newMultidimentionalArray;
//
//    }
//    public int getSumOfElementsOfArray(int[][] array){
//        int newSum = 0;
//        {
//            for (int j = 0; j < array.length; j++) {
//                for (int i = 0; i < array.length; i++) {
//                    newSum += array[i][j];
//                }
//            }
//        }
//        return newSum;
//
//    }


//    public int[][] createRandomArray(int maxIntegerInArray, int numberOfElementsString, int numberOfElementsColumn) {
//        Random random = new Random();
//        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
//        for (int i = 0; i < arrayOfIntegers.length; i++) {
//            for (int j = 0; j < arrayOfIntegers.length; j++) {
//                arrayOfIntegers[i][j] = random.nextInt((2*maxIntegerInArray))-maxIntegerInArray;
//            }
//
//        }
//        return arrayOfIntegers;
//    }
//
//public int findNegativeNumbersUnderTheMainDiagonal(int[][] someArray) {
//    int theNumber = 0;
//    for (int i = 0; i < someArray.length; i++) {
//        for (int j = 0; j < i; j++) {
//            if (someArray[i][j] < 0) {
//                theNumber += 1;
//            }
//
//        }
//    }
//    return theNumber;
//}

//    //For Level 2. Task 4
//
//    public int[][] createDefinedArray(int numberOfElementsString, int numberOfElementsColumn) {
//        Scanner scanner = new Scanner(System.in);
//        int numberOfElements = numberOfElementsString * numberOfElementsColumn;
//        System.out.printf("Enter %d numbers: \n", numberOfElements);
//        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
//        for (int i = 0; i < arrayOfIntegers.length; i++) {
//            for (int j = 0; j < arrayOfIntegers.length; j++) {
//                arrayOfIntegers[i][j] = scanner.nextInt();
//            }
//        }
//        return arrayOfIntegers;
//    }
//    public void findMaxEvenElement(int[][] array) {
//        int maxEvenElementOfArray = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[i][j] >= maxEvenElementOfArray && (array[i][j] % 2 == 0)) {
//                    maxEvenElementOfArray = array[i][j];
//                }
//            }
//        }
//        System.out.print(maxEvenElementOfArray);
//    }


}
