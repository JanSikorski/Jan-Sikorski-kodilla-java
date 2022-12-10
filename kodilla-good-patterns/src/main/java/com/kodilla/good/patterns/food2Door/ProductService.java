package com.kodilla.good.patterns.food2Door;

import java.util.*;

public class ProductService implements ProductHandlingService{

    private final List<Product> products = new ArrayList<>();

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public void createProductList(Product[] products) {
        this.products.addAll(Arrays.asList(products));
    }
}
