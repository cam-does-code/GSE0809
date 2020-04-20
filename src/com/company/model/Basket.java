package com.company.model;

import java.util.HashMap;

public class Basket {

    private final HashMap<Product, Integer> products = new HashMap<Product, Integer>();

    public void addProduct(Product product, int amount) {
        this.products.put(product, this.products.containsKey(product) ? this.products.get(product) + amount : amount);
    }

    public void removeProduct(Product product) {
        this.products.remove(product);
    }
}
