package de.telran.averchenko.elena.homework17New.arrayLambdaExtraTasks;

import java.util.Arrays;
import java.util.function.BiFunction;

public class ArrayTest {
    public static void main(String[] args) {

        // Дополнительное задание 1 (через функциональный интерфейс)
        //Разработать программу, в которой осуществляется поэлементное суммирование массивов из 10 чисел. Тип чисел
        // может быть любым числовым.
        Integer[] firstArray = {1,2,3,4,5,6,7,8,9,0};
        Integer[] secondArray = {7,8,9,6,5,4,1,2,3,0};

        BiFunction<Integer[],Integer[],Integer[]> biFunction = (a,b) -> {
            Integer[] c = new Integer[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            return c;
        };
        Integer[] resultedArray = biFunction.apply(firstArray,secondArray);
        System.out.println(Arrays.toString(resultedArray));

        // Дополнительное задание 2 (через функциональный интерфейс)
        //Разработать программу для поиска элемента в массиве.


        String[] strings = {"test", "tnt", "app", "some string", "oops"};
        BiFunction<String[],Integer,String> searchingFunc = (str,i)-> str[i];
        System.out.println(searchingFunc.apply(strings,3));

        BiFunction<String[],String,Integer> searchingIndexFunc = (str,word)-> {
            int indexToBeFound = -1;
            for (int i = 0; i < str.length; i++) {
                if (word.equals(str[i])){
                    indexToBeFound = i;
                }
            }
            return indexToBeFound;
        };
        System.out.println(searchingIndexFunc.apply(strings,"app"));

    }
}
