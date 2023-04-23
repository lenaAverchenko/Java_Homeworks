package de.telran.averchenko.elena.homework18New.task_one_and_two;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOneTwoTest {
    public static void main (String[] args){
        /** Task 1.
         * Выполнить сортировку в прямом и  обратном алфавитном порядке и удалить дубликаты.
         * В качестве результата должно быть два списка прямой и обратный.(два стрима)*/

        List<String> list = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        //в прямом порядке
        List<String> naturalOrderedList = list.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println(naturalOrderedList);

        //в обратном порядке
        List<String> reverseOrderedList = list.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
        System.out.println(reverseOrderedList);

        /** Task 2.
         * Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
         * */

        List<String> listTwo = Arrays.asList("a1", "b5", "a2", "b4");
        String minElement = listTwo.stream()
                .min((x,y)-> x.compareTo(y)).orElse("null");
        System.out.println(minElement);


    }
}
