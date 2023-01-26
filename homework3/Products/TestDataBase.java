package de.telran.averchenko.elena.homework3.Products;

import java.util.Scanner;

public class TestDataBase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to add to your list:");
        String firstThing = scanner.nextLine();
        InMemoryDatabase inMemoryDatabase = new InMemoryDatabase();
        Product firstProduct = new Product(firstThing);
        inMemoryDatabase.save(firstProduct);

        String secondThing = scanner.nextLine();
        Product productTwo = new Product(secondThing);
        inMemoryDatabase.save(productTwo);

        String thirdThing = scanner.nextLine();
        Product productThree = new Product(thirdThing);
        inMemoryDatabase.save(productThree);

        System.out.println("What are you looking for?");
        String productForLooking = scanner.nextLine();
        System.out.println(inMemoryDatabase.findByTitle(productForLooking));


    }
}
