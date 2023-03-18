package de.telran.averchenko.elena.homework18;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FuncTests {
    public static void main(String[] args) {
    //Level 1 Task 8
            // Option 1
        Consumer<String> printerString = System.out::println;
        Consumer<Integer> printerInteger = System.out::println;
        Consumer<Double> printerDouble = System.out::println;
        String str = "Everything will be great!";
        int integer = 15;
        double someDouble = 6.0;
        printerString.accept(str);
        printerInteger.accept(integer);
        printerDouble.accept(someDouble);
        System.out.println("___________________________________");

            // Option 2
        printParam(str);
        printParam(integer);
        printParam(someDouble);
        System.out.println("___________________________________");

    //Level 1 Task 9
            // Option 1
        SomeComparator<Integer> someComparator = new SomeComparator<>();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(44);
        list.add(30);
        list.add(13);
        list.add(20);
        list.add(15);
        list.add(88);
        list.add(1);
        System.out.println(sortList(list, someComparator));
            // Option 2
        Stream<Integer> stream = list.stream();
        List<Integer> newList = stream.sorted(someComparator).toList();
        System.out.println(newList);
        System.out.println("___________________________________");
            // Option 3
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(44);
        list1.add(30);
        list1.add(13);
        list1.add(20);
        list1.add(15);
        list1.add(88);
        list1.add(1);
        System.out.println(list1);
        SortFunc<Integer> sortFunc = Collections::sort;
        sortFunc.sortList(list1,someComparator);
        System.out.println(list1);
        System.out.println("___________________________________");

        //Level 1 Task 10

    // Option 1
        String someString = "Hello!";
        Function<String,String> addTest = s -> s + "Test";
        Function<String,String> addPoint = s -> s + ".";
//        String res = addTest.andThen(addPoint).apply(someString); - если бы не нужно было обрезать строку
        String res = addPoint.apply(addTest.apply(someString).substring(0,4));//с 0 по 3 включительно
        System.out.println(res);
    // Option 2
        Function<String,String> strangeFunc = s -> {
//            String firstStep = s + "Test";
            String firstStep = addTest.apply(s);
            String secondStep = firstStep.substring(0,4);
            return addPoint.apply(secondStep);
//            return secondStep + ".";
        };
        System.out.println(strangeFunc.apply(someString));


        //Level 1 Task 11
// Если верно поняла задание
        Random random = new Random();
        Supplier<Boolean> booleanSupplier = random::nextBoolean;
//        System.out.println(booleanSupplier.get());
        for (int i = 0; i < 10; i++) {
            System.out.print(booleanSupplier.get() + " ");
        }
        System.out.println("");


    }



    public static <T> void printParam(T param){
        System.out.println(param);
    }

    public static <T> List<T> sortList(List<T> list, Comparator<T> comparator){
        list.sort(comparator);
        return list;
    }
}
