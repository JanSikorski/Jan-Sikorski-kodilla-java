package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop implements ProcessProducer{
    private ShipmentFullfillmentService shipmentFullfillmentService;
    private ProductHandlingService productHandlingService;

    public ExtraFoodShop(ShipmentFullfillmentService shipmentFullfillmentService, ProductHandlingService productHandlingService) {
        this.shipmentFullfillmentService = shipmentFullfillmentService;
        this.productHandlingService = productHandlingService;
    }

    @Override
    public void addProducerAndProduct() {
        Producer producer = new Producer("ExtraFoodShop", "Example adress for ExtraFoodShop");
        productHandlingService.createProductList((new ProductDto("Mąka", 200), new ProductDto("Ziemniaki", 400)));
    }

    @Override
    public void process() {

    }
}
