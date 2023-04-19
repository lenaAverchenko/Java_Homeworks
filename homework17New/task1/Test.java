package de.telran.averchenko.elena.homework17New.task1;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        // ((((3 * 10) + 1) + 3) * 2

        Function<Integer, Integer> multiplyTen = a -> a*10;
        Function<Integer, Integer> addOne = x -> x+1;
        Function<Integer, Integer> addThree = y -> y+3;
        Function<Integer, Integer> multTwo = z -> z*2;
        System.out.println(multiplyTen.andThen(addOne).andThen(addThree).andThen(multTwo).apply(3));
        System.out.println(multTwo.compose(addThree).compose(addOne).compose(multiplyTen).apply(3));


        // как вариант еще, если все неизвестные:
        BiFunction<Integer,Integer,Integer> multiplyingFunc = (a,b) -> a*b;
        BiFunction<Integer,Integer,Integer> addingFunc = Integer::sum;
        int res = multiplyingFunc.apply(addingFunc.apply(addingFunc.apply(multiplyingFunc.apply(3,10),1),3),2);
        System.out.println(res);






    }
}
