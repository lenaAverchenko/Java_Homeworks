package de.telran.averchenko.elena.homework13.people;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PeopleTest {
    public static void main(String[] args) {

        // Level 1 Task 8

        TreeMap<Integer, People> treemap = new TreeMap<Integer, People>();
        treemap.put(15, new People("Oleh", "Honcharov"));
        treemap.put(61, new People("Viktoriia", "Honcharov"));
        treemap.put(3, new People("Olena", "Golovina"));
        treemap.put(24, new People("Katia", "Lipa"));
        treemap.put(80, new People("Lenka", "Guzik"));
        treemap.put(49, new People("Olivia", "Kostovych"));
        treemap.put(12, new People("Basia", "Maszkovski"));
        treemap.put(22, new People("Kasia", "Dziadek"));
        treemap.put(69, new People("Olek", "Tuwim"));
        treemap.put(50, new People("Rys", "Lihachev"));


        // 1 option
        for (Map.Entry<Integer, People> item : treemap.entrySet()){
            System.out.println(item);
            System.out.println();
        }

        // 2 option
        System.out.println(treemap);

        //3 option
        Set<Integer> flats = treemap.keySet();
        for (Integer element:flats) {
            System.out.printf("In the flat #%d lives %s %s\n",element, treemap.get(element).getFirstName(),treemap.get(element).getLastName());
        }


    }
}
