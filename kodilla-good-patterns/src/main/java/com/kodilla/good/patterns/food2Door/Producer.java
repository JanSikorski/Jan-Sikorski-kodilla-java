package com.kodilla.good.patterns.food2Door;

import java.util.Map;

public class Producer {
    private final String name;
    private final String adress;

    public Producer(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }
}
