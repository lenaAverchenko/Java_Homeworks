package de.telran.averchenko.elena.homework16;

import java.util.Comparator;

public class TComparator <T extends Comparable<T>> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }
}
