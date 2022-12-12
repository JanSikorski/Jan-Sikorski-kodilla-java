package com.kodilla.good.patterns.food2DoorScrapped;

public class Product {
    private String productName;
    private int productAmmount;

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
