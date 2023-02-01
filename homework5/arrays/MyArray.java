package de.telran.averchenko.elena.homework5.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyArray {
    //Я полагаю, что правильнее было бы создать суперкласс массивов, а от него уже линейные и многомерные от линейных
    // но решила, что в одном классе пошагово (и по заданиям) будет проще разобраться, и все будет нагляднее.
    // Плюс задача состояла в методике работы с массивами)))
    // Для наглядности сделала это наследование, но в проверке пользовалать текущим общим классом.

    public int integers[][];

    @Override
    public String toString() {
        return "MyArray{" +
                "integers=" + Arrays.toString(integers) +
                '}';
    }

//     For task 1
    public int[][] createRandomIntegerArray(int maxIntegerInArray, int numberOfElementsString, int numberOfElementsColumn) {
        Random random = new Random();
        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = 0; j < arrayOfIntegers.length; j++) {
                arrayOfIntegers[i][j] = random.nextInt(maxIntegerInArray);
            }

        }
        return arrayOfIntegers;
    }

    public void showTheArray(int[][] integers) {
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                System.out.print(integers[i][j] + " ");
            }
            System.out.println("");
        }

    }

    // For task 2
    public int[] getSecondaryDiagonalNumbers(int[][] integers) {
        int[] newArray = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (j == integers.length - 1 - i) {
                    newArray[i] = integers[i][j];
                    System.out.print(integers[i][j] + " ");
                } else {
                    System.out.print("");
                }
            }
        }
        System.out.println("");
        return newArray;
    }

    public void getMaxSecondaryDiagonalNumber(int[] integers) {
        int newMaxValue = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > newMaxValue) {
                newMaxValue = integers[i];
            }
        }
        System.out.println("The max value in the Secondary Diagonal is: " + newMaxValue);
    }

    // For task 3 (можно было бы сделать разные классы для разных видов массивов и наследовать методы, переписывая их, но
    // решила, что это практика массивов, поэтому делаю методы для всех массивов в 1 классе)
    public int[][] createDifferentArray(int numberOfElementsString, int numberOfElementsColumn) {
        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = 0; j < arrayOfIntegers.length; j++) {
                arrayOfIntegers[i][j] = 7 * i - 3 * j;
            }
        }
        return arrayOfIntegers;
    }

    //For Level 2. Task 1
    // Аналогично, можно было создать абстрактный класс массивов, и от него наследников - линейные массивы и двумерные массивы
    public int[] createSomeRandomArray(int length, int maxElementInArray) {
        Random random = new Random();
        int[] array = new int[length];
        for(int k = 0; k<array.length;k++){
            array[k] = random.nextInt(maxElementInArray);
        }
        return array;
    }

    public void showTheLinearArray(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            {
                System.out.print(integers[i] + " ");
            }

        }
        System.out.println("");
    }

    public void sortElementsWithBubbleMethod(int[] array){
        int temporaryValue = 0;
        int temporaryIndex = 0;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - j-1; i++) {
                if (array[i] > array[i + 1]) {
                    temporaryIndex = i + 1;
                    temporaryValue = array[i];
                    array[i] = array[i + 1];
                    array[temporaryIndex] = temporaryValue;
                } else {
                    temporaryValue = array[i + 1];
                }
            }
        }
        System.out.print(Arrays.toString(array));
    }

    //For Level 2. Task 2
    public int[][] getSumOfArrays(int[][] arrayOne, int[][] arrayTwo){
        int[][] newMultidimentionalArray = new int[arrayOne.length][arrayOne.length];
        if(arrayOne.length == arrayTwo.length){
            for (int j = 0; j < arrayOne.length; j++) {
                for (int i = 0; i < arrayOne.length; i++) {
                    newMultidimentionalArray[i][j] = arrayOne[i][j]+arrayTwo[i][j];
                }
            }
        }else {
            System.out.println("The sum can't be calculated");
        }
        return newMultidimentionalArray;

    }
    public int getSumOfElementsOfArray(int[][] array){
        int newSum = 0;
            {
            for (int j = 0; j < array.length; j++) {
                for (int i = 0; i < array.length; i++) {
                    newSum += array[i][j];
                }
            }
        }
        return newSum;

    }


    //For Level 2. Task 3
    public int[][] createRandomArray(int maxIntegerInArray, int numberOfElementsString, int numberOfElementsColumn) {
        Random random = new Random();
        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = 0; j < arrayOfIntegers.length; j++) {
                arrayOfIntegers[i][j] = random.nextInt((2*maxIntegerInArray))-maxIntegerInArray;
            }

        }
        return arrayOfIntegers;
    }


    public int findNegativeNumbersUnderTheMainDiagonal(int[][] someArray) {
        int theNumber = 0;
        for (int i = 0; i < someArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (someArray[i][j] < 0) {
                    theNumber += 1;
                }

            }
        }
        return theNumber;
    }
    //For Level 2. Task 4

    public int[][] createDefinedArray(int numberOfElementsString, int numberOfElementsColumn) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = numberOfElementsString * numberOfElementsColumn;
        System.out.printf("Enter %d numbers: \n", numberOfElements);
        int[][] arrayOfIntegers = new int[numberOfElementsString][numberOfElementsColumn];
        for (int i = 0; i < arrayOfIntegers.length; i++) {
            for (int j = 0; j < arrayOfIntegers.length; j++) {
                arrayOfIntegers[i][j] = scanner.nextInt();
            }
        }
        return arrayOfIntegers;
    }
    public void findMaxEvenElement(int[][] array) {
        int maxEvenElementOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i][j] >= maxEvenElementOfArray && (array[i][j] % 2 == 0)) {
                    maxEvenElementOfArray = array[i][j];
                    }
                }
            }
        System.out.print(maxEvenElementOfArray);
    }

    //For Level 2. Task 5




}





