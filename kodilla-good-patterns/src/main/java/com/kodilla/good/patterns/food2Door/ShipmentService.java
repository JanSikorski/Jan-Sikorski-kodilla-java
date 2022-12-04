package com.kodilla.good.patterns.food2Door;

public class ShipmentService implements ShipmentFullfillmentService {
    @Override
    public boolean isOrderFullflled(boolean isFullfilled) {
        return ShipmentFullfillmentService.super.isOrderFullflled(isFullfilled);
    }
}
