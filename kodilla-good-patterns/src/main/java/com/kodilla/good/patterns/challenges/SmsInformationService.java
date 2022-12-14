package com.kodilla.good.patterns.challenges;

public class SmsInformationService implements InformationService{
    @Override
    public void informSeller(User seller) {
        System.out.println("Sending message to " + seller.getPhoneNumber() + "...\n" +
                "There is purchase request for one of your products");
    }

    @Override
    public void informBuyer(User buyer) {
        System.out.println("Sending message to " + buyer.getPhoneNumber() + "...\n" +
                "The seller responded to your request");
    }
}
