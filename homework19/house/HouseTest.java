package de.telran.averchenko.elena.homework19.house;


import de.telran.averchenko.elena.classwork9.People;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class HouseTest {
    public static void main(String[] args) {
        //Level 2 Task 2
        List<House> houses = List.of(
                new House("Zwyciezcow", 30, 199999.0, 2000),
                new House("1 Maja", 21, 200000.0, 1889),
                new House("Max Platz", 12, 1000000.0, 2010),
                new House("Stop", 66, 115009.0, 1996),
                new House("Life", 4, 120000.0, 1965),
                new House("Bohater", 89, 250000.0, 1910),
                new House("Stolarow", 15, 700000.0, 2015),
                new House("Stokrotka", 6, 899999.0, 1990),
                new House("Max Platz", 17, 900000.0, 1945),
                new House("Max Platz", 20, 885550.0, 1956));

        //1.
                House maxPriceHouse = houses.stream().max(new PriceComparator()).get();
                System.out.println(maxPriceHouse);

                Double maxPrice = houses.stream()
                        .map(House::getPrice)
                        .toList().stream()
                        .max(Comparator.naturalOrder())
                        .orElse(-1.0);
        System.out.println(maxPrice);

        //2.

        House minPriceUnevenHouse = houses.stream().filter(house -> house.getNumber()%2 !=0).min(new PriceComparator()).get();
        System.out.println(minPriceUnevenHouse);

        //3.

        Set<House> setOfHouses = houses
                .stream()
                .filter(h ->h.getPrice()< 200_000)
                .filter(h ->h.getPrice()> 100_000)
                .limit(2)
                .collect(Collectors.toSet());
        System.out.println(setOfHouses);

        //4.

        Set<Double> maxPlatzHousesPrices = houses
                .stream()
                .filter(house -> house.getStreet().equals("Max Platz"))
                .map(House::getPrice)
                .collect(Collectors.toSet());
        System.out.println(maxPlatzHousesPrices);


        //5.

        int amountOfOddHouses = houses
                .stream()
                .filter(house -> house.getNumber()%2 !=0)
                .toList().size();
        System.out.println(amountOfOddHouses);

        //6.
        Double sum = houses
                .stream()
                .filter(house -> house.getStreet().equals("Max Platz"))
                .map(House::getPrice)
                .reduce(0.0, Double::sum);
        System.out.println(sum);

    }
}
