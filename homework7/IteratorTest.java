package de.telran.averchenko.elena.homework7;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {

        //Task 4 level 1
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            integers.add(random.nextInt());
        }

        System.out.println("_________For-i________");
        int tempVal = 0;
            long before = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            tempVal = integers.get(i);
        };
        System.out.println(tempVal);
            long after = System.currentTimeMillis();
            System.out.println(after - before);

        System.out.println("_________Revert For-i________");
        int tempValRevert = 0;
        long beforeRevert = System.currentTimeMillis();
        for (int i = integers.size()-1; i>=0; i--) {
            tempValRevert = integers.get(i);
        };
        System.out.println(tempValRevert);
        long afterRevert = System.currentTimeMillis();
        System.out.println(afterRevert - beforeRevert);

        System.out.println("_________ForEach________");

        int tempValForEach = 0;
        long beforeForEach = System.currentTimeMillis();
        for (Integer element : integers) {
            tempValForEach = element;
        };
        System.out.println(tempValForEach);
        long afterForEach = System.currentTimeMillis();
        System.out.println(afterForEach - beforeForEach);

        System.out.println("________Iterator_________");
        Iterator<Integer> iterator = integers.iterator();
        int tempValIterator = 0;
        long beforeIterator = System.currentTimeMillis();
        while(iterator.hasNext()){
            tempValIterator = iterator.next();
        };
        System.out.println(tempValIterator);
        long afterIterator = System.currentTimeMillis();
        System.out.println(afterIterator - beforeIterator);

        System.out.println("_______ListIterator__________");

        ListIterator<Integer> listIterator = integers.listIterator();
        int tempValListIterator = 0;
        long beforeListIterator = System.currentTimeMillis();
        while(listIterator.hasNext()){
            tempValListIterator = listIterator.next();
        };
        System.out.println(tempValListIterator);
        long afterListIterator = System.currentTimeMillis();
        System.out.println(afterListIterator - beforeListIterator);






    }
}
