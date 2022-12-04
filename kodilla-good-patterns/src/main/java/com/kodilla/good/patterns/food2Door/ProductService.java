package com.kodilla.good.patterns.food2Door;

import java.util.*;

public class ProductService implements ProductHandlingService{

    private final List<ProductDto> products = new ArrayList<>();

    public List<ProductDto> getProducts() {
        return products;
    }

    @Override
    public void createProductList(ProductDto[] products) {
        this.products.addAll(Arrays.asList(products));
    }
}
