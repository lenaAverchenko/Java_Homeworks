package de.telran.averchenko.elena.homework18New.extra_tasks.client;

import java.util.Comparator;

public class ClientAgeComparator implements Comparator<Client> {
    @Override
    public int compare(Client o1, Client o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
