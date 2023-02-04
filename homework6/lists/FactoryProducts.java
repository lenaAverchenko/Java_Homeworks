package de.telran.averchenko.elena.homework6.lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FactoryProducts {
    private List listOfProducts;

    public FactoryProducts(List listOfProducts) {
        this.listOfProducts = listOfProducts;
    }

    public FactoryProducts() {
    }

    public List createListOfProducts(List list, int amount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String product = "";
        for (int i = 0; i < amount; i++) {
            product = scanner.nextLine();
            list.add(product);
        }
        return list;
    }


    public List findAndDeleteTheSameOne(List list){
        List correctedList = new ArrayList(list);
        System.out.println(list);
            for (int i = 0; i < list.size(); i++) {
                if(list.get(0).equals(list.get(i))) {
                    correctedList.remove(list.get(i));
                }
            }
        System.out.println(correctedList);
        return correctedList;

    }

}
