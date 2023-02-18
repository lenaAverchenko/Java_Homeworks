package de.telran.averchenko.elena.homework10.books;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Book> books = new ArrayList<>();

    public Shelf(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Shelf{" +
                "books=" + books +
                '}';
    }
}
