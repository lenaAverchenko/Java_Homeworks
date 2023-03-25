package de.telran.averchenko.elena.homework20;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListTest {
    public static void main(String[] args) {

        // Level 1 task 6
        // Если верно поняла, тут алфавитный порядок значит, что мы не должны сортировать по числам, потому как 4 больше 1,
        // если не учитывать того, что там не 1, а 10, а поскольку он сравнит 4 с 1 в строчном варианте, то будет все равно,
        // что там еще 0 за 1)

        List<String> strings = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        strings.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // Level 1 task 7
        List<String> highStrings = Arrays.asList("Highload", "High", "Load", "Highload");
        List<String> highStrings1 = Arrays.asList();

        long highCount = highStrings.stream().filter(s -> s.contains("High")).count();
        System.out.println(highCount);

        String firstWord = highStrings.stream().findFirst().orElse("0");
        String firstWord1 = highStrings1.stream().findFirst().orElse("0");
        System.out.println(firstWord);
        System.out.println(firstWord1);

        // Level 1 task 8
        //Я поняла, что выкинуть больше 100, но можно знак поменять и будет наоборот

        List<Integer> intList = IntStream.rangeClosed(-40, 40).map(x -> x * x).filter(x -> x < 100).boxed().toList();
        Set<Integer> intSet = IntStream.rangeClosed(-40, 40).map(x -> x * x).filter(x -> x < 100).boxed().collect(Collectors.toSet());
        List<Integer> intLinkedList = IntStream.rangeClosed(-40, 40).map(x -> x * x).filter(x -> x < 100).boxed().collect(Collectors.toCollection(LinkedList::new));

        System.out.println(intList);
        System.out.println(intSet);
        System.out.println(intLinkedList);



    }
}
