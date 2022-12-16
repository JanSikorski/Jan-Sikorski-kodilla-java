package com.kodilla.good.patterns.challenges;

import java.util.Objects;

public class Offer {

    private final User seller;
    private boolean isActive;


    public Offer(User seller, boolean isActive) {
        this.seller = seller;
        this.isActive = isActive;
    }

    public User getSeller() {
        return seller;
    }

    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offer offer = (Offer) o;

        if (isActive != offer.isActive) return false;
        return Objects.equals(seller, offer.seller);
    }

    @Override
    public int hashCode() {
        int result = seller != null ? seller.hashCode() : 0;
        result = 31 * result + (isActive ? 1 : 0);
        return result;
    }
}
