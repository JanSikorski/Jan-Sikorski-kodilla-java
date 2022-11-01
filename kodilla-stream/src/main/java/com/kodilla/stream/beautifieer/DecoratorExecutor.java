package com.kodilla.stream.beautifieer;

public class DecoratorExecutor {
    public void executeBeautification(String text, PoemDecorator poemDecorator) {
        System.out.println(poemDecorator.decorate(text));
    }
}
