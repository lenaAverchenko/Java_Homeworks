package de.telran.averchenko.elena.homework16.list;

import java.util.ArrayList;
import java.util.List;

public class TestListOfElements {
    public static void main(String[] args) {

        //Level 2 Task 2 еще один подход

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(5);
        list.add(20);
        list.add(4);

        ListOfElements<Integer> listOfElements = new ListOfElements<>(list);

        System.out.println(listOfElements.getMax());
        listOfElements.add(30);
        listOfElements.add(5);
        listOfElements.add(8);
        System.out.println(listOfElements.getMax());

    }
}
