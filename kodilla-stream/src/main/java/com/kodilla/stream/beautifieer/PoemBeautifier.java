package com.kodilla.stream.beautifieer;

import java.util.Random;

public class PoemBeautifier {
    private final static Random RANDOM = new Random();

    public static String beautify(String text) {
        String decoratedText = "";
        for (char character: text.toCharArray()) {
            decoratedText += (RANDOM.nextBoolean()) ? Character.toUpperCase(character) : Character.toLowerCase(character);
        }
        return decoratedText;
    }

    public static String removeAllSpace(String text) {
        return text.replaceAll("\\s", "");
    }

    public static String removeRandomLetters(String text) {
        String newText = "";

        for (char character: text.toCharArray()) {
            newText += (RANDOM.nextBoolean()) ? character : "";
        }

        return newText;
    }
}
