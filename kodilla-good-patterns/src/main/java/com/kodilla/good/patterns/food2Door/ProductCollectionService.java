package com.kodilla.good.patterns.food2Door;

import java.util.List;

public interface ProductCollectionService {
    void addProduct(String name, int ammount);
    List<Product> getProducts();
}
