package de.telran.averchenko.elena.homework16.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        // Level 2 Task 1, 2
        // Предположительно, я этого уже не повторю)))

        // Option 1


        List<Integer> list = new ArrayList<>();
        ListComparator<Integer> listComparator = new ListComparator<>();
        list.add(1);
        list.add(15);
        list.add(5);
        list.add(2);
        list.add(10);
        ListGen<Integer> listGen = new ListGen<>(list, listComparator);

        System.out.println(listGen);
        System.out.println(listGen.getMax());
        listGen.add(18);
        listGen.add(50);
        listGen.add(4);
        listGen.add(20);
        listGen.add(9);
        System.out.println(listGen);
        System.out.println(listGen.getMax());

        // Option 2

        List<Integer> listNew = new ArrayList<>();
        ListComparatorNew<Integer> listComparatorNew = new ListComparatorNew<>();
        listNew.add(1);
        listNew.add(15);
        listNew.add(5);
        listNew.add(2);
        listNew.add(10);
        ListGenNew<Integer, ListComparatorNew<Integer>> listGenNew = new ListGenNew<>(listNew, listComparatorNew);

        System.out.println(listGenNew);
        System.out.println(listGenNew.getMaxNew());
        listGenNew.add(18);
        listGenNew.add(50);
        listGenNew.add(4);
        listGenNew.add(20);
        listGenNew.add(9);
        System.out.println(listGenNew);
        System.out.println(listGenNew.getMaxNew());

        // Option 3

        List<Integer> listOneMoreNew = new ArrayList<>();
        OneMoreNewComparator<Integer> listComparatorOneMoreNew = new OneMoreNewComparator<>();
        listOneMoreNew.add(1);
        listOneMoreNew.add(15);
        listOneMoreNew.add(5);
        listOneMoreNew.add(2);
        listOneMoreNew.add(10);
//        OneMoreNew<new ArrayList<Integer>,OneMoreNewComparator<Integer>> oneMoreNew = new OneMoreNew<>();
        OneMoreNew<Integer, List<Integer>, OneMoreNewComparator<Integer>> oneMoreNew = new OneMoreNew<>(listOneMoreNew, listComparatorOneMoreNew);

        System.out.println(oneMoreNew);
        System.out.println(oneMoreNew.getMaxNew());
        oneMoreNew.add(18);
        oneMoreNew.add(50);
        oneMoreNew.add(4);
        oneMoreNew.add(20);
        oneMoreNew.add(9);
        System.out.println(oneMoreNew);
        System.out.println(oneMoreNew.getMaxNew());





    }
}
