package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    private final Set<Country> countries = new HashSet<>();

    private final String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountries(Country country) {
        countries.add(country);
    }

    public Set<Country> getCountries() {
        return countries;
    }
}
