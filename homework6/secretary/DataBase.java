package de.telran.averchenko.elena.homework6.secretary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {
    protected List<Person> list;

    public DataBase(List<Person> list) {
        this.list = list;
    }

    public DataBase() {
    }

    public List<Person> addNewPerson(int amount){
        List<Person> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter the full name:");
            String NewFullName = scanner.nextLine();
            System.out.println("Enter the phone number:");
            String NewPhoneNumber = scanner.nextLine();
            Person person = new Person(NewFullName,NewPhoneNumber);
            list.add(person);
        }

        return list;
    }



    public Person findTheNumberOf (List<Person> list,String surname){
        Person foundPerson = new Person("","");
        for (int i = 0; i < list.size(); i++) {
            String toCompare = list.get(i).getFullName();
            if (toCompare.contains(surname)){
                foundPerson.setFullName(list.get(i).getFullName());
                foundPerson.setPhoneNumber(list.get(i).getPhoneNumber());
            }
        }
        return foundPerson;
    }

    public List findJustTheNumberOf (List<Person> list,String surname){
        List<String> newListOfNumbers = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String toCompare = list.get(i).getFullName();
            if (toCompare.contains(surname)){
                newListOfNumbers.add(list.get(i).getPhoneNumber());
            }
        }
        return newListOfNumbers;
    }
    }


