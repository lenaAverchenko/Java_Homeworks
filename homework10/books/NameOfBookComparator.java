package de.telran.averchenko.elena.homework10.books;

import java.util.Comparator;

public class NameOfBookComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getNameOfBook().compareTo(o2.getNameOfBook());
    }
}
