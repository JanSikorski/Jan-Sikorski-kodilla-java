package com.kodilla.good.patterns.FlightSearch;

public class PairFlight {
    private final Flight firstFlight;
    private final Flight secondFlight;

    public PairFlight(Flight firstFlight, Flight secondFlight) {
        this.firstFlight = firstFlight;
        this.secondFlight = secondFlight;
    }

    public Flight getFirstFlight() {
        return firstFlight;
    }

    public Flight getSecondFlight() {
        return secondFlight;
    }

    @Override
    public String toString() {
        return "Flight: " + firstFlight + " -> " + secondFlight + "\n";
    }
}
