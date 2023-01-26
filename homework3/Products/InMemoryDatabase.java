package de.telran.averchenko.elena.homework3.Products;

import java.util.ArrayList;
import java.util.Arrays;

public class InMemoryDatabase implements ProductDatabase {

    protected Product productOne = new Product("Aubergine");
    protected Product productTwo = new Product("Cabbage");
    protected Product productThree = new Product("Cucumber");
    Product[] arrayOfProducts = {productOne, productTwo,productThree};

    @Override

    public void save(Product product) {
        Product[] newArrayOfProducts = new Product[arrayOfProducts.length + 1];
        for (int i = 0; i < newArrayOfProducts.length-1; i++) {
            newArrayOfProducts[i] = arrayOfProducts[i];
        }
        newArrayOfProducts[newArrayOfProducts.length-1] = product;
        System.out.println(Arrays.toString(newArrayOfProducts));
        arrayOfProducts = newArrayOfProducts;

    }


    @Override
    public Product findByTitle(String productTitle) {
        Product result=null;
        for(int i = 0; i < arrayOfProducts.length; i++) {
            if (arrayOfProducts[i].getTitle().equals(productTitle)) {
                result = arrayOfProducts[i];
                break;
            }
        }
        return result;





}}
