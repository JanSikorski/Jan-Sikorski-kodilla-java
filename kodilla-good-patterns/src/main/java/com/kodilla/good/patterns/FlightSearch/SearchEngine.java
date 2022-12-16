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

    public List<PairFlight> getFlightsWithStopover (String departureAirtport, String stopover, String arrivalAirport) {
        List<Flight> firstFlight = getFlightBasedOnArrivalAirport(stopover).stream()
                .filter(flight -> getFlightBasedOnDepartureAirport(departureAirtport).contains(flight))
                .toList();

        List<Flight> secondFlight = getFlightBasedOnDepartureAirport(stopover).stream()
                .filter(flight -> getFlightBasedOnArrivalAirport(arrivalAirport).contains(flight))
                .toList();
        return firstFlight.stream().flatMap(flight -> secondFlight.stream().map(flight1 -> new PairFlight(flight, flight1))).toList();
    }/*
    getFlightBasedOnArrivalAirport(stopover).stream()
                .filter(flight -> getFlightBasedOnArrivalAirport(departureAirtport).contains(flight))
            .toList();*/

/*
    getFlightBasedOnArrivalAirport(arrivalAirport).stream()
                .filter(flight -> getFlightBasedOnArrivalAirport(stopover).contains(flight))
            .toList();
*/


}
