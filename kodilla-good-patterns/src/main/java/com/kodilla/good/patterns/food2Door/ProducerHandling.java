package com.kodilla.good.patterns.food2Door;

public abstract class ProducerHandling implements ShipmentFullfillmentService{

    private ProductHandlingService productHandlingService;
    private final boolean isFullfilled;

    public ProducerHandling(final ProductHandlingService productHandlingService, final String name, final String adress, final boolean isFullfilled) {
        this.productHandlingService = productHandlingService;
        this.isFullfilled = isFullfilled;
        Producer producer = new Producer(name, adress);
    }

    public boolean isOrderFullflled() {
        return ShipmentFullfillmentService.super.isOrderFullflled(isFullfilled);
    }
}
