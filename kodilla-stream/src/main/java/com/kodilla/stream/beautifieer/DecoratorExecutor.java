package com.kodilla.stream.beautifieer;

public class DecoratorExecutor {
    public void executeBeautification(String text, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }
}
