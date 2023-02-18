package de.telran.averchenko.elena.homework10.advertisement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewspaperTest {
    public static void main(String[] args) {

        // Уровень 1 задание 6

        // Можно было также сделать и компараторы, потому как условия сортировки можно менять
        List<Advertisement> ads = new ArrayList<>();
        ads.add(new Advertisement(125, "Tower", "Bill Hewgo", 2020, "about the buildings"));
        ads.add(new Advertisement(1150, "Big Bang", "Donatan Tesko", 2023, "England about "));
        ads.add(new Advertisement(255, "Aura", "Stew Huge", 2020, "something about "));
        ads.add(new Advertisement(3000, "Love is", "Leo Baska", 2000, "Love is great"));
        ads.add(new Advertisement(14, "Power", "Antony Barkings", 1989, "My power is..."));
        ads.add(new Advertisement(150, "Knowledge", "Leonardo Marks", 2015, "The main reason..."));
        ads.add(new Advertisement(28903, "English", "Bask Dante", 2020, "English learning"));
        ads.add(new Advertisement(1999, "Math", "Glen Tudor", 2018, "count and be clever"));
        ads.add(new Advertisement(99, "English", "Stew Huge", 2020, "mystic book"));
        ads.add(new Advertisement(180, "Over the moon", "Will Power", 1993, "maybe one day..."));
        System.out.println(ads);
        System.out.println("___________________");
        Collections.sort(ads);
        System.out.println(ads);
        System.out.println("___________________");
        Newspaper newspaper = new Newspaper(ads);
        System.out.println(newspaper);

        System.out.println("___________________");
        System.out.println("Min price:");
        System.out.println(newspaper.getMinPrice());
        System.out.println("Max price:");
        System.out.println(newspaper.getMaxPrice());


    }
}
