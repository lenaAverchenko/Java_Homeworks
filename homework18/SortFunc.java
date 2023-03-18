package de.telran.averchenko.elena.homework18;

import java.util.Comparator;
import java.util.List;

public interface SortFunc<T extends Comparable<T>> {
    void sortList(List<T> list, Comparator<T> comparator);
}
