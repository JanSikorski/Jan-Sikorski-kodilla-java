package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User userJohn = new Millenials("John");
        User userZacharael = new ZGeneration("Zacharael");
        User userLonginus = new YGeneration("Longinus");

        //When
        String johnsPublisher = userJohn.sharePost();
        String zacharaelsPublisher = userZacharael.sharePost();
        String longinusPublisher = userLonginus.sharePost();

        //Then
        assertEquals("Twitter", johnsPublisher);
        assertEquals("Snapchat", zacharaelsPublisher);
        assertEquals("Facebook", longinusPublisher);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User changingUser = new Millenials("John");

        //When
        String publisherBeforeChenge = changingUser.sharePost();
        changingUser.setSocialPublisher(new SnapchatPublisher());
        String publisherAfterChange = changingUser.sharePost();

        //Then
        assertEquals("Twitter", publisherBeforeChenge);
        assertEquals("Snapchat", publisherAfterChange);
    }
}
