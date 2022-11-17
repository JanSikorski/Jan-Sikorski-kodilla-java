package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> aviableAirports = new HashMap<>();

        aviableAirports.put("Toronto", true);
        aviableAirports.put("London", false);

        if (aviableAirports.get(flight.getArrivalAirport()) != null) {
            return aviableAirports.get(flight.getArrivalAirport());
        } else {
            throw new RouteNotFoundException(flight);
        }
    }
}
