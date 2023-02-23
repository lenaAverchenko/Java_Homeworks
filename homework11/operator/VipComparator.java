package de.telran.averchenko.elena.homework11.operator;

import java.util.Comparator;

public class VipComparator implements Comparator<Client> {

    @Override
    public int compare(Client o1, Client o2) {
        if (o1.isVip() && !o2.isVip()){
            return -1;
        } else if (!o1.isVip() && o2.isVip()) {
            return 1;
        } else {
                return 0;}

    }
}
