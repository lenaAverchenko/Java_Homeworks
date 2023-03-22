package de.telran.averchenko.elena.homework19.house;

import java.util.Comparator;

public class PriceComparator implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
