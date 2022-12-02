package com.kodilla.good.patterns.challenges;

public class PurchaseService implements SalesServiace{
    @Override
    public void completePurchase(User buyer, Offer offer) {
        System.out.println(buyer.hashCode() + " completed purchase " + offer.hashCode());
        offer.setActive(false);
    }
}
