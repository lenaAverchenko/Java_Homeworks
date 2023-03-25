package de.telran.averchenko.elena.homework20.shops;

import de.telran.averchenko.elena.classwork20.Book;
import de.telran.averchenko.elena.classwork20.Student;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopsTest {
    public static void main(String[] args) {

        //Level 2 Task 1

        System.out.println("________________Task 2.1____________________");

        Shop lidl = new Shop("Lidl", "Krakow, 1 Maja Str, 25", 23,
                List.of(new Product("apple", 3.50,Category.FRUIT),
                        new Product("pear", 4.40,Category.FRUIT),
                        new Product("peach", 6.40,Category.FRUIT),
                        new Product("meet", 23.70,Category.MEET),
                        new Product("cucumber", 23.00,Category.VEGETABLE)));

        Shop mellonShop = new Shop("Mellon Shop", "Warsaw, Grunwaldska Str, 56", 18,
                List.of(new Product("cucumber", 10.00,Category.VEGETABLE),
                        new Product("watermelon", 15.80,Category.FRUIT),
                        new Product("parsley", 1.99,Category.GROCERY)));

        Shop forPets = new Shop("Mellon Shop", "Warsaw, Grunwaldska Str, 56", 18,
                List.of(new Product("SeedsFood", 7.00,Category.PET_PRODUCT),
                        new Product("collar", 39.90,Category.PET_PRODUCT),
                        new Product("CatFood", 5.00,Category.PET_PRODUCT)));

        List<Shop> shops = List.of(lidl,mellonShop, forPets);

        TreeMap<String, Double> mapOfProducts = shops.stream().flatMap(v -> v.list.stream())
                .collect(Collectors.toMap(product -> product.name, product ->product.price, (f, s) -> {
                    System.out.printf("Duplicate detected!!! %f and %f\n", f, s);
                    if (f>s){
                        return s;
                    } else {
                        return f;
                    }
                }, TreeMap::new));

        System.out.println(mapOfProducts);

        HashMap<String, Double> hashMapOfProducts = shops.stream().flatMap(v -> v.list.stream())
                .collect(Collectors.toMap(product -> product.name, product ->product.price, (f, s) -> {
                    System.out.printf("Duplicate detected!!! %f and %f\n", f, s);
                    if (f>s){
                        return s;
                    } else {
                        return f;
                    }
                }, HashMap::new));

        System.out.println(hashMapOfProducts);


        //Level 2 Task 2

        System.out.println("________________Task 2.2____________________");
        List<Product> goods = shops.stream().filter(s -> s.getWorkTo() > 18).flatMap(l -> l.list.stream())
                .filter(c -> c.getCategory().equals(Category.FRUIT))
                .filter(c -> c.price < 5.0)
                .sorted(Comparator.comparing(c -> c.name)).toList();

        System.out.println(goods);

        //Level 2 Task 3

        System.out.println("________________Task 2.3____________________");

        Map<Category,Long> groupingList = shops.stream().flatMap(s -> s.list.stream())
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.counting()));

        System.out.println(groupingList);


        //Level 2 Task 4
        System.out.println("________________Task 2.4____________________");

        Map<Category,List<String>> groupingListOfNames = shops.stream()
                .flatMap(s -> s.list.stream())
                .collect(Collectors.groupingBy(Product::getCategory,Collectors.mapping(s->s.name, Collectors.toList())));

        System.out.println(groupingListOfNames);

        //Level 2 Task 5
        System.out.println("________________Task 2.5____________________");

        Map<Category, Optional<Double>> mapOfMaxPrices =
        shops.stream().flatMap(s -> s.list.stream())
                .collect(Collectors.groupingBy(
                        Product::getCategory, Collectors.mapping(v->v.price, Collectors.maxBy(Comparator.comparingDouble(value -> value)))));

        System.out.println(mapOfMaxPrices);


        //Level 2 Task 6
        System.out.println("________________Task 2.6____________________");
       String names = shops.stream()
                .flatMap(s -> s.list.stream())
                .map(s->s.name)
                .collect(Collectors.joining(", "));

        System.out.println(names);


    }
}
