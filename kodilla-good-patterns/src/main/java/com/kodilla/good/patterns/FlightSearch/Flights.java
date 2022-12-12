package com.kodilla.good.patterns.FlightSearch;

import java.util.*;

public class Flights {
    private final List<Flight> flights = new ArrayList<>();

    public void addFlight(String departureAirport, String arrivalAirport) {
        flights.add(new Flight(departureAirport, arrivalAirport));
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
