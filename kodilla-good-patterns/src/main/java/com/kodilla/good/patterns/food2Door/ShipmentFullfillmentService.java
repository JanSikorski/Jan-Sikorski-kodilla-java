package com.kodilla.good.patterns.food2Door;

public interface ShipmentFullfillmentService {

    void process();

    void addProductToFullfillment();

    default boolean isOrderFullflled(boolean isFullfilled){
        System.out.println(isFullfilled ? "Shippment is ready to fullfill" : "Shippment is not ready to fullfill");
        return isFullfilled;
    }
}
