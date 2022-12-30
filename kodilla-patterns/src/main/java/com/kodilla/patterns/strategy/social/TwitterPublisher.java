package com.kodilla.patterns.strategy.social;

public final class TwitterPublisher implements SocialPublisher {
    @Override
    public String Share() {
        System.out.println("Twitter");
        return "Twitter";
    }
}
