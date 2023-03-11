package de.telran.averchenko.elena.homework16.collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Level 2 Task 3, 4

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(20);
        list.add(11);
        list.add(25);
        list.add(5);
        list.add(18);
        ComparatorCollection<Integer> comparatorCollection = new ComparatorCollection<>();
        MyCollection<Integer,ComparatorCollection<Integer>>myCollection = new MyCollection<>(list, comparatorCollection);
        System.out.println(myCollection);
        System.out.println(myCollection.getMax());
        MyCollectionNew<Integer, List<Integer>,ComparatorCollection<Integer>> myCollectionNew = new MyCollectionNew<>(list, comparatorCollection);
        System.out.println(myCollectionNew);
        System.out.println(myCollectionNew.getMax());


        /** Тут могла бы сделать класс только для параметра первого - Integer, либо так, как есть,
         * но не дает мне сделать просто коллекцию в качестве параметра, потому что у коллекции есть еще свой, и он тоже меняется.
        */
        MyCollectionStarter<Integer,List<Integer>> myCollectionStarter = new MyCollectionStarter<>(list);
        System.out.println(myCollectionStarter);
        System.out.println(myCollectionStarter.getMax());

        Set<String> mySet = new HashSet<>();
        mySet.add("One");
        mySet.add("Two");
        mySet.add("Five");
        MyCollectionStarter<String,Set<String>> myCollectionStarterSTR = new MyCollectionStarter<>(mySet);
        System.out.println(myCollectionStarterSTR);
        System.out.println(myCollectionStarterSTR.getMax());

        CollectionOfElements<Integer> collection = new CollectionOfElements<>(list);
        System.out.println(collection);
        System.out.println(collection.getMax());

    }
}
