package de.telran.averchenko.elena.homework18.people;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PeopleTest {
    public static void main(String[] args) {

        // Level 2 Task 1

        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(12,"Oleh", "Olehov", 60.0, 152));
        peopleList.add(new People(50,"Alex", "Alexov", 89.0, 181));
        peopleList.add(new People(18,"Petr", "Petrov", 70.0, 183));
        peopleList.add(new People(32,"Anna", "Kotova", 120.0, 167));
        peopleList.add(new People(48,"Aleksandra", "Nevrova", 65.0, 170));
        peopleList.add(new People(30,"Lech", "Leszek", 70.0, 189));
        peopleList.add(new People(27,"Michail", "Michailov", 45.0, 168));
        peopleList.add(new People(10,"Hleb", "Hlebov", 35.0, 140));
        peopleList.add(new People(69,"Alexa", "Nikotova", 95.0, 160));
        peopleList.add(new People(71,"Anatol", "Pavlov", 78.0, 180));

        List<People> newPeopleList = new ArrayList<>();
//        Stream<People> peopleStream = peopleList.stream();

        newPeopleList = peopleList.stream().filter(v->v.getAge()>18).filter(v->v.getHeight()<180).filter(v-> Objects.equals(v.getFirstName().charAt(0), 'A')).collect(Collectors.toList());
        System.out.println(newPeopleList);
        List<String> newLastNameList = new ArrayList<>();
        newLastNameList = peopleList.stream().filter(v->v.getAge()>30).filter(v-> Objects.equals(v.getFirstName().charAt(0), 'A')).filter(v-> v.getFirstName().length()>5).map(People::getLastName).collect(Collectors.toList());
        System.out.println(newLastNameList);
    }
}
