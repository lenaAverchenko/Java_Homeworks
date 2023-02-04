package de.telran.averchenko.elena.homework6.lists;

import java.util.ArrayList;
import java.util.List;

public class BrokerTest {
    public static void main(String[] args) {
        List<String> brokers = List.of("First","Second","Third","Fourth", "Fifth", "Sixth","Seventh", "Eighth", "Ninth", "Tenth");

        List<String> changed = new ArrayList<>(brokers);
        System.out.println(brokers);
//        String savedFirst = "";
//        for (int i = 0; i < (brokers.size()/2); i++) {
//            savedFirst = brokers.get(i);
//            brokers.set(i, brokers.get(brokers.size()-1-i));
//            brokers.set((brokers.size()-1-i),savedFirst);
//        }
        for (int i = 0; i < brokers.size(); i++) {
            changed.set(i, brokers.get(brokers.size()-1-i));
        }
        System.out.println(changed);
    }
}
