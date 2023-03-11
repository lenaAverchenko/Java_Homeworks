package de.telran.averchenko.elena.homework16.arraylist;

import java.util.Comparator;

public class OneMoreNewComparator <T extends Comparable<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
