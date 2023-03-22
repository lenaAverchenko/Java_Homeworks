package de.telran.averchenko.elena.homework19;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {

        // Level 1 Task 11
        List<String> bigStrings = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        Integer countBig = bigStrings.stream().filter(s -> s.contains("Big")).toList().size();
        System.out.println(countBig);

        // Level 1 Task 12
        List<String> strings = List.of("BigBen", "BigBob", "Big", "Ben", "Big Bob", "NewSomething", "Just a string", "abc", "a");
        Optional<Integer> maxSize = strings.stream().map(String::length).toList().stream().max(Comparator.naturalOrder());
        System.out.println(maxSize);
        Optional<Integer> minSize = strings.stream().map(String::length).toList().stream().min(Comparator.naturalOrder());
        System.out.println(minSize);

        // Level 1 Task 13
        Random random = new Random();
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ints.add(random.nextInt(0,50));
        }
        Integer firstLessOneHundred = ints.stream()
                .filter(v -> v < 25) // если тут уберем меньше 25, то после возведения в квадрат не будет ничего меньше 100
//                .peek(System.out::println)// для проверки
                .map(v -> v+10) // это условие, априори, делает так, что меньше 100 резальтат не будет. я бы прибавила меньшее значение
                .map(v->v*v)
                .filter(v -> v<100)
//                .peek(System.out::println) // для проверки
                .findFirst()
                .orElse(-1);
        System.out.println(firstLessOneHundred);

        // Level 2 Task 1
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            integers.add(random.nextInt(-100,100));
        }
        Set<Integer> setOfIntegers = integers.stream()
                .filter(val -> Math.abs(val)<50)
                .map(val -> val+20)
                .sorted(Comparator.naturalOrder())
                .limit(10)
                .skip(5)
                .collect(Collectors.toSet());
        System.out.println(setOfIntegers);


    }
}
