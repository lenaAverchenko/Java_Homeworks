package de.telran.averchenko.elena.homework17New.task2;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> factorialFunction = n -> {
            int tempValue = n;
            while (n!=1){
                tempValue = tempValue*(n-1);
                n = n-1;
            }
            return tempValue;
        };
        System.out.println(factorialFunction.apply(5));
    }
}
