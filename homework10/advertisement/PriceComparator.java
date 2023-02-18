package de.telran.averchenko.elena.homework10.advertisement;

import java.util.Comparator;

public class PriceComparator implements Comparator<Advertisement> {
    @Override
    public int compare(Advertisement o1, Advertisement o2) {
        return Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
