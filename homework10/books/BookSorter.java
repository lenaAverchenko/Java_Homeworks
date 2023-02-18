package de.telran.averchenko.elena.homework10.books;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BookSorter {

    protected Scanner scanner = new Scanner(System.in);
    protected Comparator<Book> comparatorOfBooks;

    public Comparator<Book> useComparatorByName(List<Book> books){
        System.out.println("Would you like to sort by name of books? (Yes / No)");
        String answerName = scanner.nextLine();
        if(answerName.equals("Yes")){
            System.out.println("In what order: ascending or descending? (a / d)");
            String answerNameOrder = scanner.nextLine();
            if (answerNameOrder.equals("a")){
                comparatorOfBooks = new NameOfBookComparator();
            }
            if (answerNameOrder.equals("d")){
                comparatorOfBooks = new NameOfBookComparator().reversed();
            }
        }
        return comparatorOfBooks;
    }


    public Comparator<Book> useComparatorByAuthor(List<Book> books){
        System.out.println("Would you like to sort by author? (Yes / No)");
        String answerAuthor = scanner.nextLine();
        if(answerAuthor.equals("Yes")) {
            System.out.println("In what order: ascending or descending? (a / d)");
            String answerAuthorOrder = scanner.nextLine();
            if (answerAuthorOrder.equals("a")) {
                comparatorOfBooks = comparatorOfBooks.thenComparing(new AuthorComparator());
            }
            if (answerAuthorOrder.equals("d")) {
                comparatorOfBooks = comparatorOfBooks.thenComparing(new AuthorComparator().reversed());
            }
        }
        return comparatorOfBooks;
    }


    public Comparator<Book> useComparatorByYearOfPublishing(List<Book> books){
        System.out.println("Would you like to sort by the year of Publishing? (Yes / No)");
        String answerYearOfPub = scanner.nextLine();
        if(answerYearOfPub.equals("Yes")) {
            System.out.println("In what order: ascending or descending? (a / d)");
            String answerYearOfPubOrder = scanner.nextLine();
            if (answerYearOfPubOrder.equals("a")) {
                comparatorOfBooks = comparatorOfBooks.thenComparing(new PublishingYearComparator());
            }
            if (answerYearOfPubOrder.equals("d")) {
                comparatorOfBooks = comparatorOfBooks.thenComparing(new PublishingYearComparator().reversed());
            }
        }


        return comparatorOfBooks;
    }



    public Comparator<Book> useComparatorByPublishingHouse(List<Book> books){
        System.out.println("Would you like to sort by Publishing Houses? (Yes / No)");
        String answerPH = scanner.nextLine();
        if(answerPH.equals("Yes")) {
            System.out.println("In what order: ascending or descending? (a / d)");
            String answerPHOrder = scanner.nextLine();
            if (answerPHOrder.equals("a")) {
                comparatorOfBooks = comparatorOfBooks.thenComparing(new PublishingComparator());
            }
            if (answerPHOrder.equals("d")) {
                comparatorOfBooks = comparatorOfBooks.thenComparing(new PublishingComparator().reversed());
            }
        }
        return comparatorOfBooks;
    }
    public List<Book> sortAsWished(List<Book> books){
        Collections.sort(books, comparatorOfBooks);
        return books;
    }



}
