package de.telran.averchenko.elena.homework16;

import java.util.HashMap;
import java.util.Map;

public class DatabaseTest {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(8,"eight");
        System.out.println(map);

        Database<Integer,String> database = new Database<>();

// и он ничего не добавляет...

        database.add(1, "One");
        database.add(2, "Two");
        System.out.println(database);


    }
}
