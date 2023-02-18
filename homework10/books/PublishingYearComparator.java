package de.telran.averchenko.elena.homework10.books;

import java.util.Comparator;

public class PublishingYearComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getYearOfPublishing(), o2.getYearOfPublishing());
    }
}
