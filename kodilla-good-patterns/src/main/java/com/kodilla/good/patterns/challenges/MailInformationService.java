package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {
    @Override
    public void informSeller(User seller) {
        System.out.println("Sending mail to " + seller.getEmai() + "...\n" +
                "There is purchase request for one of your products");
    }

    @Override
    public void informBuyer(User buyer) {
        System.out.println("Sending message to " + buyer.getEmai() + "...\n" +
                "The seller responded to your request");
    }
}
