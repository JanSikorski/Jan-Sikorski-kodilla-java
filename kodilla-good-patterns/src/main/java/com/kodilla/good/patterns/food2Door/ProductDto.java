package com.kodilla.good.patterns.food2Door;

public class ProductDto {
    private String productName;
    private int productAmmount;

    public ProductDto(String productName, int productAmmount) {
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
