package com.kodilla.stream.beautifieer;

import java.util.Random;

public class PoemBeautifier {

    public String beautify(String text, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(text);
    }
}
