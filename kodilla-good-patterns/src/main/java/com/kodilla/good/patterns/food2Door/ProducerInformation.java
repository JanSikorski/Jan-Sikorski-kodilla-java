package com.kodilla.good.patterns.food2Door;

public class ProducerInformation implements ProducerInformationService {

    private final boolean isFullfilled;

    public ProducerInformation(boolean isFullfilled) {
        this.isFullfilled = isFullfilled;
    }

    @Override
    public void informifOrderIsFullfilled() {
        System.out.println(isFullfilled ? "The order has been fullfilled" : "The order has not been fullfilled");
    }
}
