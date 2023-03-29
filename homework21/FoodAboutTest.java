package de.telran.averchenko.elena.homework21;

import de.telran.averchenko.elena.classwork21.NoRecepieException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FoodAboutTest {
    public static void main(String[] args) throws PriceException {

        // Level 1 Task 10

        checkPrice(2.0);
        checkPrice(7.5);
        checkPrice(8.5);


        // Level 1 Task 11

        buyFood(2.0);
        buyFood(7.0);
        buyFood(9.0);



    }

    public static boolean checkPrice(double currentPrice) throws PriceException{
        boolean res = false;
        if (currentPrice > 8.0){
            res = false;
            throw new PriceException();
        }
        return true;
    }

    public static String buyBread(double currentPrice) throws PriceException{
        if (checkPrice(currentPrice)) {
            return "Bread";
        } else {
            return null;
        }
    }
    public static String buyMeat() {
        return "Meat";
    }

    public static void buyFood(double breadPrice) throws PriceException {
        List<String> boughtFood = new ArrayList<>();
        try {
            boughtFood.add(buyBread(breadPrice));
        }catch (PriceException pe) {
          throw pe;
        }
        finally {
            boughtFood.add(buyMeat());
            System.out.println(boughtFood);
        }

    }
}
