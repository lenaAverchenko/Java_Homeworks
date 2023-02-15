package de.telran.averchenko.elena.homework9;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListsTest {
    public static void main(String[] args) {

        //Уровень 1 задание 6
        List<Integer> firstList = new LinkedList<>();
        List<Integer> secondList = new LinkedList<>();
        firstList.add(1);
        firstList.add(5);
        firstList.add(20);
        firstList.add(10);
        firstList.add(25);

        secondList.add(1);
        secondList.add(18);
        secondList.add(7);
        secondList.add(45);
        secondList.add(12);



        BubbleMethodSort bubbleMethodSort = new BubbleMethodSort();
        List<Integer> newFirstList = bubbleMethodSort.sortElementsWithBubbleMethod(firstList);
        List<Integer> newSecondList = bubbleMethodSort.sortElementsWithBubbleMethod(secondList);
        System.out.println(newFirstList);
        System.out.println(newSecondList);


        for (int i = 0; i < newSecondList.size(); i++) {
            newFirstList.add(newSecondList.get(i));

        }
        List<Integer> sortedSummaryList = bubbleMethodSort.sortElementsWithBubbleMethod(newFirstList);
        System.out.println(sortedSummaryList);



    }
}
