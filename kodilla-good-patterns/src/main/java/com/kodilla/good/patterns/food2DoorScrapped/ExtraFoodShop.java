package com.kodilla.good.patterns.food2DoorScrapped;

public class ExtraFoodShop {
    private ShipmentFullfillmentService shipmentFullfillmentService;
    private ProductHandlingService productHandlingService;
    private ProcessProducer processProducer;

    public ExtraFoodShop(ShipmentFullfillmentService shipmentFullfillmentService, ProductHandlingService productHandlingService, ProcessProducer processProducer) {
        this.shipmentFullfillmentService = shipmentFullfillmentService;
        this.productHandlingService = productHandlingService;
        this.processProducer = processProducer;
    }


}
