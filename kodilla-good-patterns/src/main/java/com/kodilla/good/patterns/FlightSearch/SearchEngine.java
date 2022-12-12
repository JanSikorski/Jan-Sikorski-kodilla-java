package com.kodilla.good.patterns.FlightSearch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SearchEngine {

    private final Flights flights;

    public SearchEngine(Flights FLIGHTS) {
        this.flights = FLIGHTS;
    }

    public List<Flight> getFlightBasedOnDepartureAirport(String departureAirport) {
        return flights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightBasedOnArrivalAirport(String arrivalAirport) {
        return flights.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public Map<Flight, Flight> getFlightsWithStopover (String departureAirtport, String stopover, String arrivalAirport) {
        List<Flight> flights1 = flights.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(stopover) && flight.getDepartureAirport().equals(departureAirtport))
                .toList();
        List<Flight> flights2 = flights.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(stopover) && flight.getArrivalAirport().equals(arrivalAirport))
                .toList();

        return IntStream.range(0, flights1.size()).boxed()
                .collect(Collectors.toMap(flights1::get, flights2::get));
    }


}
