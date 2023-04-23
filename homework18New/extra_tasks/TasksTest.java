package de.telran.averchenko.elena.homework18New.extra_tasks;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class TasksTest {
    public static void main(String[] args) {

        /**Задано множество фамилий сотрудников. Разработать программу, которая отображает все фамилии, начинающиеся
         *  на букву «J». Задачу решить с использованием Stream API.*/

        List<String> surnames = Arrays.asList("James", "Gomes", "Leonov", "Jakobs", "Genev", "Apolov", "Topolev", "Jones");
        surnames.stream().filter(s -> s.startsWith("J")).forEach(System.out::println);

        /**Задан массив строк. Используя средства StreamAPI отсортировать строки в лексикографическом порядке.*/

        System.out.println(surnames.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList()));

        /**Как с помощью Stream Api скрыть номер телефона?
         Пример: + 380 ** ** ** **3  */
        String number = "+ 380 50 52 69 123";
        String[] newNumbers = number.split(" ");
        AtomicInteger index = new AtomicInteger(-1);
        List<String> listOfNumbers = Arrays.stream(newNumbers).map(a -> {
                index.getAndIncrement();
                if (index.get() > 1 && index.get() <5){
                    a = "**";
                } else if (index.get() == 5) {
                    a = "**" + a.toCharArray()[2];
                }
                return a;
        }).collect(Collectors.toList());
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listOfNumbers.size(); i++) {
            stringBuilder.append(listOfNumbers.get(i) + " ");
        }
        System.out.println(stringBuilder);
    }
}
