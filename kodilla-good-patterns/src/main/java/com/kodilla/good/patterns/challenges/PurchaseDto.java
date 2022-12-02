package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    private User user;
    private Offer offer;

    public PurchaseDto(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public Offer getOffer() {
        return offer;
    }
}
