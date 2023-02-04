package de.telran.averchenko.elena.homework6.lists;

import java.util.ArrayList;
import java.util.List;

public class TestFactoryProducts {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();;
        FactoryProducts factoryProducts= new FactoryProducts(list);
        factoryProducts.createListOfProducts(list,10);
        factoryProducts.findAndDeleteTheSameOne(list);

    }
}
