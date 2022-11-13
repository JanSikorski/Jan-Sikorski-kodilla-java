package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> aviableAirports = new HashMap<>();
        if (aviableAirports.containsKey(flight.getArrivalAirport())) {
            for (Map.Entry<String, Boolean> entry : aviableAirports.entrySet()) {
                if (entry.getKey().equals(flight.getArrivalAirport())) {
                    System.out.println(flight.getDepartureAirport() + " - " + flight.getArrivalAirport() + "\t exists");
                }
            }
        } else {
            throw new RouteNotFoundException();
        }
    }
}
