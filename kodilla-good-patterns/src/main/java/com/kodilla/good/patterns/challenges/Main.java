package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {
        User user = new User("AdamS",  "siwy1234@op.pl", 789312345);
        Offer offer = new Offer(new User("SuperSeller4", "sellers_buers_Co@gmail.com", 123789345), false);
        ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(), new OfferService(), new PurchaseService());

        productOrderService.process(offer, user);
    }
}
