package com.kodilla.stream;

import com.kodilla.stream.beautifieer.PoemBeautifier;

public class StreamMain {

    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println(poemBeautifier.beautify("Example text", text -> text.replaceAll("\\s", "")));
        System.out.println(poemBeautifier.beautify("0000All 000 aaa", t -> t.toUpperCase()));
        System.out.println(poemBeautifier.beautify("hesoyam", text -> text.replace('s', '\n')));
    }
}