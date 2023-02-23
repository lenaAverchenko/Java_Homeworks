package de.telran.averchenko.elena.homework11.operator;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class OperatorTest {
    public static void main(String[] args) {

        // Level 1 task 9

        Queue<Client> priorityQueue = new PriorityQueue<>(new VipComparator());
        priorityQueue.add(new Client("Oleh", "123456789", false));
        priorityQueue.add(new Client("Nadia", "789456123", true));
        priorityQueue.add(new Client("Lena", "789123456", true));
        priorityQueue.add(new Client("Vasia", "321456963", false));
        priorityQueue.add(new Client("Igor", "741258963", false));
        priorityQueue.add(new Client("Kostia", "369852147", true));
        priorityQueue.add(new Client("Viktor", "321741852", false));
        priorityQueue.add(new Client("Masha", "951263487", false));
        priorityQueue.add(new Client("Daria", "753214896", false));
        priorityQueue.add(new Client("Nina", "896412357", true));

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}
