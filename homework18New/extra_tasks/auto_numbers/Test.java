package de.telran.averchenko.elena.homework18New.extra_tasks.auto_numbers;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        /**
         * Номера всех автомобилей, имеющих черный цвет или нулевой пробег.
         * Количество уникальных моделей в ценовом диапазоне от 700 до 800 тыс.*/

        List<Auto> list = Arrays.asList(new Auto("о656са121","LadaVesta", "Blue",2000,750000),
                new Auto("н455сх178","ToyotaCamry", "Black",500,1500000),
                new Auto("а787ук197","KiaRio", "Green",0,795000),
                new Auto("а787ук197","KiaRio", "Green",0,795000),
                new Auto("р435ав777","BMW", "Black",3560,3000000));

        list.stream()
                .filter(a -> a.getCarColor().equals("Black") || a.getMileage() ==0).forEach(System.out::println);

        long amountOfCars = list.stream()
                .filter(a -> a.getPrice() > 700000 && a.getPrice() < 800000)
                .map(auto ->auto.getCarModel()).distinct().count();
        System.out.println(amountOfCars);

    }
}
