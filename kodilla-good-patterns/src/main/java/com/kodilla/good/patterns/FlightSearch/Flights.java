package com.kodilla.good.patterns.FlightSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Flights {
    private final List<Flight> flights = new ArrayList<>();

    public void addFlight(String departureAirport, String arrivalAirport) {
        flights.add(new Flight(departureAirport, arrivalAirport));
    }

    public List<Flight> getFlights() {
        return flights;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "flights=" + flights +
                '}';
    }
}
