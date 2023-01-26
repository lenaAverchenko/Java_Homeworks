package de.telran.averchenko.elena.homework3.Products;

public interface ProductDatabase {
    void save(Product product);
    Product findByTitle(String productTitle);
}
