package de.telran.averchenko.elena.homework10.books;

import java.util.Objects;

public class Book {
    private Author author;
    private String nameOfBook;
    private  int yearOfPublishing;
    private PublishingHouse publishingHouse;

    public Book(Author author, String nameOfBook, int yearOfPublishing, PublishingHouse publishingHouse) {
        this.author = author;
        this.nameOfBook = nameOfBook;
        this.yearOfPublishing = yearOfPublishing;
        this.publishingHouse = publishingHouse;
    }

    public Author getAuthor() {
        return author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public PublishingHouse getPublishingHouse() {
        return publishingHouse;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", publishingHouse=" + publishingHouse +
                '}';
    }


}

