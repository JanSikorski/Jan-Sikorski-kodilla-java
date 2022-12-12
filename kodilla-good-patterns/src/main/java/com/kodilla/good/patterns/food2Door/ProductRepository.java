package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements ProductCollectionService {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(String name, int ammount) {
        products.add(new Product(name, ammount));
    }

    public List<Product> getProducts() {
        return products;
    }
}
