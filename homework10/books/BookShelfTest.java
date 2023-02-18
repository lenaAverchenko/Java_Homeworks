package de.telran.averchenko.elena.homework10.books;

import java.sql.SQLOutput;
import java.util.*;

public class BookShelfTest {
    public static void main(String[] args) {

        // Уровень 2 задание 1-3

        Author author1 = new Author("Leo", "Bach",1960);
        Author author2 = new Author("Mike", "Taurus",1886);
        Author author3 = new Author("Don", "Markus",1985);
        Author author4 = new Author("Lew", "Glitters",1999);
        Author author5 = new Author("Koni", "Limkins",1956);

        PublishingHouse publishingHouse1 = new PublishingHouse("Smile", 2000);
        PublishingHouse publishingHouse2 = new PublishingHouse("Print All", 1998);
        PublishingHouse publishingHouse3 = new PublishingHouse("Alphabet", 2015);
        PublishingHouse publishingHouse4 = new PublishingHouse("Letter", 2020);
        PublishingHouse publishingHouse5 = new PublishingHouse("Keen Reader", 1988);

        List<Book> books = new ArrayList<>();
        books.add(new Book(author1,"King of the World", 1990,publishingHouse1));
        books.add(new Book(author2,"Rumble of Thunder", 2006,publishingHouse2));
        books.add(new Book(author3,"All over the World", 2016,publishingHouse3));
        books.add(new Book(author4,"All over the World", 2022,publishingHouse4));
        books.add(new Book(author5,"Hello, everyone!", 1989,publishingHouse5));


        Shelf shelf = new Shelf(books);
        System.out.println("Unsorted: ");
        System.out.println(shelf);

        Collections.sort(shelf.getBooks(),new PublishingYearComparator());
        System.out.println("Sorted by publishing year: ");
        System.out.println(shelf);

        Collections.sort(shelf.getBooks(),new AuthorComparator());
        System.out.println("Sorted by author: ");
        System.out.println(shelf);

        Collections.sort(shelf.getBooks(),new NameOfBookComparator());
        System.out.println("Sorted by name of book: ");
        System.out.println(shelf);

        Collections.sort(shelf.getBooks(),new PublishingComparator());
        System.out.println("Sorted by Publishing House: ");
        System.out.println(shelf);

        Collections.sort(shelf.getBooks(),new NameOfBookComparator().thenComparing(new AuthorComparator().reversed()));
        System.out.println("Mix Sorted: ");
        System.out.println(shelf);


        // Уровень 2 задание 4

        BookSorter bookSorter = new BookSorter();
        bookSorter.useComparatorByName(books);
        bookSorter.useComparatorByAuthor(books);
        bookSorter.useComparatorByPublishingHouse(books);
        bookSorter.useComparatorByYearOfPublishing(books);
        System.out.println(bookSorter.sortAsWished(books));

        //  Пример для проверки
        Collections.sort(books, new NameOfBookComparator().thenComparing(new PublishingYearComparator().reversed()));
        System.out.println(books);

    }
}
