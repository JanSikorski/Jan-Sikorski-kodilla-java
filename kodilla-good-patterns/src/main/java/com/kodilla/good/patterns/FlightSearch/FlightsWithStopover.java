package com.kodilla.good.patterns.FlightSearch;

import java.util.ArrayList;
import java.util.List;

public class FlightsWithStopover {

    private final Flights flights;

    public FlightsWithStopover(Flights flights) {
        this.flights = flights;
    }

    public List<FlightWithStopoverDto> createFlightsWithStopoverList() {
        List<FlightWithStopoverDto> flightsWithStopover = new ArrayList<>();

        for (int i = 0; i < flights.getFlights().size(); i++) {
            for (int j = 0; j < flights.getFlights().size(); j++) {
                if (flights.getFlights().get(i).getArrivalAirport().equals(flights.getFlights().get(j).getDepartureAirport())) {
                    flightsWithStopover.add(new FlightWithStopoverDto(flights.getFlights().get(i).getDepartureAirport(),
                            flights.getFlights().get(j).getArrivalAirport(),
                            flights.getFlights().get(i).getArrivalAirport()));
                }
            }
        }

        return flightsWithStopover;
    }
}
