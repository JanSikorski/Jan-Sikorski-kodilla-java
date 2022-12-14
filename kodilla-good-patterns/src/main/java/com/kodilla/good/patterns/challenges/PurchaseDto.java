package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    private final User buyer;
    private final Offer offer;

    public PurchaseDto(User user, Offer offer) {
        this.buyer = user;
        this.offer = offer;
    }

    public User getBuyer() {
        return buyer;
    }

    public Offer getOffer() {
        return offer;
    }
}
