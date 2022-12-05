package com.kodilla.good.patterns.challenges;

public class MailInformationService implements InformationService {
    @Override
    public void informSeller(User user) {
        System.out.println("Sending mail to " + user.getEmai() + "...\n" +
                "There is purchase request for one of your products");
    }

    @Override
    public void informBuyer(User user) {
        System.out.println("Sending message to " + user.getEmai() + "...\n" +
                "The seller responded to your request");
    }
}
