package com.kodilla.patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher {

    @Override
    public String Share() {
        System.out.println("Snapchat");
        return "Snapchat";
    }


}
