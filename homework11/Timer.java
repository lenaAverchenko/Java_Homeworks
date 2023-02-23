package de.telran.averchenko.elena.homework11;

import java.util.*;

public class Timer {
    public static void main(String[] args) {
        // Level 1 task 8

        Stack<Integer> stack = new Stack<>();
        Deque<Integer> arrayDeque = new ArrayDeque<>();
        Deque<Integer> linkedList = new LinkedList<>();

        Random random = new Random();
        System.out.println("Push to stack:");
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            stack.push(random.nextInt());
        };
        long after = System.currentTimeMillis();
        System.out.println(after - before);

        System.out.println("Push to arrayDeque:");
        long before1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayDeque.push(random.nextInt());
        };
        long after1 = System.currentTimeMillis();
        System.out.println(after1 - before1);

        System.out.println("Push to linkedList:");
        long before2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.push(random.nextInt());
        };
        long after2 = System.currentTimeMillis();
        System.out.println(after2 - before2);

        System.out.println("Pop from stack:");
        long before3 = System.currentTimeMillis();
        while (!stack.isEmpty()) {
            stack.pop();
        };
        long after3 = System.currentTimeMillis();
        System.out.println(after3 - before3);

        System.out.println("Pool from arrayDeque:");
        long before4 = System.currentTimeMillis();
        while (!arrayDeque.isEmpty()) {
            arrayDeque.poll();
        };
        long after4 = System.currentTimeMillis();
        System.out.println(after4 - before4);

        System.out.println("Pool from linkedList:");
        long before5 = System.currentTimeMillis();
        while (!linkedList.isEmpty()) {
            linkedList.poll();
        };
        long after5 = System.currentTimeMillis();
        System.out.println(after5 - before5);
    }
}
