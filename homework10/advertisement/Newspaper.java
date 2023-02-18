package de.telran.averchenko.elena.homework10.advertisement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Newspaper {
    private List<Advertisement> ads = new ArrayList<>();

    public Newspaper(List<Advertisement> ads) {
        this.ads = ads;
    }

    public List<Advertisement> getAds() {
        return ads;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "ads=" + ads +
                '}';
    }

    // Уровень 1 задание 7

    public int getMaxPrice(){
        Collections.sort(this.getAds(), new PriceComparator());
        int maxVal = this.getAds().get(getAds().size()-1).getPrice();
        return maxVal;
    }

    public int getMinPrice(){
        Collections.sort(this.getAds(), new PriceComparator());
        int minVal = this.getAds().get(0).getPrice();
        return minVal;
    }
}
