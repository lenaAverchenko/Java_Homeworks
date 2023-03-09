package de.telran.averchenko.elena.homework15.seismology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Office {
    List<Integer> listOfSeismicEvents = new ArrayList<>();

    public Office(List<Integer> listOfSeismicEvents) {
        this.listOfSeismicEvents = listOfSeismicEvents;
    }

    public boolean endTheDay (){
        boolean end = false;
        Random random = new Random();
        int number = 0;
        while (number !=-97){
            number = random.nextInt(-100,10);
            listOfSeismicEvents.add(number);
        }
            end = true;
            System.out.println("The day is over!");

//            для проверки
//        System.out.println(listOfSeismicEvents);
//boolean можно и не возвращать
        return end;
    }

    public void reportStrangeEventsOfTheDay(){
        List<Integer> listOfStrangeActivity = new ArrayList<>();
        for (Integer element:listOfSeismicEvents) {
            if (element > 3){
                listOfStrangeActivity.add(element);
            }
        }
        if (listOfStrangeActivity.size() >= 5){
            for (Integer element : listOfStrangeActivity){
                System.out.println("The seismic activity was: " + element);
            }
            System.out.println("WARNING! There is a possibility of the Earthquake!");

        }

    }
}
