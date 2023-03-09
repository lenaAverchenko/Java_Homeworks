package de.telran.averchenko.elena.homework15.seismology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OfficeTest {
    public static void main(String[] args) {

        //Level 1 Task 5

        //перебор можно было сделать рандомный из массива значений магнитуды до 10 и отдельного значения для выхода "-97"

        List<Integer> listOfEvents = new ArrayList<>();
        Office office = new Office(listOfEvents);
        //c одного раза может не выбить 5 значений - для проверки
        office.endTheDay();
        office.reportStrangeEventsOfTheDay();
        office.endTheDay();
        office.reportStrangeEventsOfTheDay();
        office.endTheDay();
        office.reportStrangeEventsOfTheDay();



    }
}
