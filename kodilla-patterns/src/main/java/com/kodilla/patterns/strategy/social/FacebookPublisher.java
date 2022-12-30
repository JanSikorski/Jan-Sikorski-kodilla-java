package com.kodilla.patterns.strategy.social;

public final class FacebookPublisher implements SocialPublisher {
    @Override
    public String Share() {
        System.out.println("Facebook");
        return "Facebook";
    }
}
