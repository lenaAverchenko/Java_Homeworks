package de.telran.averchenko.elena.homework6.secretary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSecretary {
    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        List<Person> list = dataBase.addNewPerson(5);
        System.out.println(list);
        Scanner scanner = new Scanner(System.in);
        System.out.println("We are looking for: ");
        String lastname = scanner.nextLine();
        System.out.println(dataBase.findTheNumberOf(list,lastname));
        System.out.println("We are looking for: ");
        String lastnameNew = scanner.nextLine();
        System.out.println(dataBase.findJustTheNumberOf(list,lastnameNew));


    }
}
