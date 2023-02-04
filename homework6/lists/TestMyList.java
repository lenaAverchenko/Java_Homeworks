package de.telran.averchenko.elena.homework6.lists;

import java.util.*;

public class TestMyList {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyArrayList myArrayList = new MyArrayList();

        //Task 5

        System.out.println(myArrayList.createMyList());;
        System.out.println(myLinkedList.createMyList());;

        System.out.println(myArrayList.addMillionElements(myArrayList.createMyList()));
        System.out.println(myLinkedList.addMillionElements(myLinkedList.createMyList()));

        myArrayList.addMillionElements(myArrayList.createMyList());
        myLinkedList.addMillionElements(myLinkedList.createMyList());
        System.out.println(myArrayList.pickUpRandomElements(myArrayList.addMillionElements(myArrayList.createMyList()),100));
        System.out.println(myLinkedList.pickUpRandomElements(myLinkedList.addMillionElements(myLinkedList.createMyList()),100));


        myArrayList.getTimeForPickUpRandomElements(myArrayList.addMillionElements(myArrayList.createMyList()),1000);
        myLinkedList.getTimeForPickUpRandomElements(myLinkedList.addMillionElements(myLinkedList.createMyList()),1000);

//          LinkedList обрабатывается дольше, чем ArrayList. Очевидно, поскольку в LinkedList каждый элемент связан с соседним,
//         ArrayList - быстрее извлекает данные. Разница во времени огромная. Почему? Интересно)

        // Task 6
//
        List<Integer> listBinar = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            listBinar.add(i+3);
        }

        System.out.println(listBinar);
        System.out.println(myArrayList.findWithBinarySearch(listBinar,10));


        // Task 7
        List<Integer> listInput = myArrayList.createListInput (10);
        System.out.println(listInput);
        System.out.println(myArrayList.calculateAverage(listInput));


        // Task 8

        myArrayList.sortElementsWithBubbleMethod(listInput);





    }
}
