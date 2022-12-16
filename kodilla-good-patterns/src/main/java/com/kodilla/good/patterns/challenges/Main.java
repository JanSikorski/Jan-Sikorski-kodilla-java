package com.kodilla.good.patterns.challenges;

public class Main {

    public static void main(String[] args) {
      
        MovieStore movieStore = new MovieStore();
        System.out.println(movieStore.getMovieTitlesAsString());

        User buyer = new User("AdamS",  "siwy1234@op.pl", 789312345);
        User seller = new User("SuperSeller4", "sellers_buers_Co@gmail.com", 123789345);
        Offer offer = new Offer(seller, false);
        ProductOrderService productOrderService = new ProductOrderService(new MailInformationService(), new OfferService(), new PurchaseService());
        productOrderService.process(offer, buyer);
        
        
    }
}
