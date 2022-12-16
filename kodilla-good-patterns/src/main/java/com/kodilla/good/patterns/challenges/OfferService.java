package com.kodilla.good.patterns.challenges;

public class OfferService implements ProductRepository{

    @Override
    public void finishTransation(Offer offer) {
        System.out.println("...transaction finished");
    }
}
