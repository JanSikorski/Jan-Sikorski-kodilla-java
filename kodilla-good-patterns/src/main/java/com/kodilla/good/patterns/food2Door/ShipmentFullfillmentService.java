package com.kodilla.good.patterns.food2Door;

public interface ShipmentFullfillmentService {
    default boolean isOrderFullflled(boolean isFullfilled){
        System.out.println(isFullfilled ? "Shippment is ready to fullfill" : "Shippment is not ready to fullfill");
        return isFullfilled;
    }
}
