package de.telran.averchenko.elena.homework10.soldiers;

import de.telran.averchenko.elena.classwork10.Cat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SoldierTest {
    public static void main(String[] args) {

        // Comparable<Soldier> выбрала, поскульку есть слово "всегда" в задании. Это значит, что в любые времена,
        // как бы ни звали солдат, где бы они ни были, их будут сравнивать и выстраивать по росту. Значит, нет смысла
        // делать им отдельный компаратор, достаточно сделать их сравниваемыми, а метод определить - сравнение по росту.

        List<Soldier> soldiersList = new ArrayList<>();
        soldiersList.add(new Soldier(1.65));
        soldiersList.add(new Soldier(2.05));
        soldiersList.add(new Soldier(1.20));
        soldiersList.add(new Soldier(1.89));
        soldiersList.add(new Soldier(1.60));
        soldiersList.add(new Soldier(2.15));
        soldiersList.add(new Soldier(1.90));

        System.out.println(soldiersList);

        Collections.sort(soldiersList);

        System.out.println(soldiersList);



    }
}
