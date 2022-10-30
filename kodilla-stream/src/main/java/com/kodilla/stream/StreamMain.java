package com.kodilla.stream;

import com.kodilla.stream.beautifieer.DecoratorExecutor;
import com.kodilla.stream.beautifieer.PoemBeautifier;
import com.kodilla.stream.beautifieer.PoemDecorator;
import com.kodilla.stream.lambda.*;

public class StreamMain {

    public static void main(String[] args) {
        DecoratorExecutor decoratorExecutor = new DecoratorExecutor();

        decoratorExecutor.executeBeautification("Example text", PoemBeautifier::beautify);
        decoratorExecutor.executeBeautification("Craaaaazy text", PoemBeautifier::beautify);
        decoratorExecutor.executeBeautification("2137", PoemBeautifier::beautify);

        decoratorExecutor.executeBeautification("", PoemBeautifier::removeAllSpace);
        decoratorExecutor.executeBeautification("There is no space", PoemBeautifier::removeAllSpace);
        decoratorExecutor.executeBeautification("Or is there", PoemBeautifier::removeAllSpace);

        decoratorExecutor.executeBeautification("Letters Like Teeth", PoemBeautifier::removeRandomLetters);
        decoratorExecutor.executeBeautification("Sometimes fall out", PoemBeautifier::removeRandomLetters);
        decoratorExecutor.executeBeautification("Sometimes not", PoemBeautifier::removeRandomLetters);
    }
}