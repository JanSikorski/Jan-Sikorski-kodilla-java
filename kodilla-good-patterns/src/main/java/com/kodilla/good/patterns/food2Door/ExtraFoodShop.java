package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop implements OrderProcessService{

    private final ProductCollectionService productCollectionService;
    private final ProducerInformationService producerInformationService;

    public ExtraFoodShop(ProductCollectionService productCollectionService, ProducerInformationService producerInformationService) {
        this.productCollectionService = productCollectionService;
        this.producerInformationService = producerInformationService;
    }

    public void createProducerProfile() {

    }

    @Override
    public void process() {

    }
}
