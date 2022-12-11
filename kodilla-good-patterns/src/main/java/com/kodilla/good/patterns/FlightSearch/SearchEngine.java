package com.kodilla.good.patterns.FlightSearch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchEngine {

    private final Flights FLIGHTS;
    private final FlightsWithStopover FLIGHTS_WITH_STOPOVER;

    public SearchEngine(Flights FLIGHTS) {
        this.FLIGHTS = FLIGHTS;
        this.FLIGHTS_WITH_STOPOVER = new FlightsWithStopover(FLIGHTS);
    }

    public List<Flight> getFlightBasedOnDepartureAirport(String departureAirport) {
        return FLIGHTS.getFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightBasedOnArrivalAirport(String arrivalAirport) {
        return FLIGHTS.getFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }

    public List<FlightWithStopoverDto> getFlightsWithStopover (String departureAirtport, String stopover, String arrivalAirport) {
        List<FlightWithStopoverDto> flights = FLIGHTS_WITH_STOPOVER.createFlightsWithStopoverList();

        return flights.stream()
                .filter(f -> f.getDepartureAirport().equals(departureAirtport)
                        && f.getStopover().equals(stopover)
                        && f.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());
    }
}
