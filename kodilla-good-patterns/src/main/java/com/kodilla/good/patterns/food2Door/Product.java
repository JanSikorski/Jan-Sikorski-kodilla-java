package com.kodilla.good.patterns.food2Door;

public class Product {
    private final String productName;
    private final int productAmmount;

    public Product(String productName, int productAmmount) {
        this.productName = productName;
        this.productAmmount = productAmmount;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductAmmount() {
        return productAmmount;
    }
}
