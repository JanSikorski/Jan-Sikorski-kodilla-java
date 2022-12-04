package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop extends ProducerHandling{

    public ExtraFoodShop(ProductHandlingService productHandlingService, String name, String adress, boolean isFullfilled) {
        super(productHandlingService, name, adress, isFullfilled);
    }



    @Override
    public void process() {

    }
}
