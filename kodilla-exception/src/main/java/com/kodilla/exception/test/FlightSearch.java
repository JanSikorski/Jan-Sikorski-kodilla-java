package com.kodilla.exception.test;

import java.util.*;

public class FlightSearch {

    public Flight findFlight(Flight flight) {
        Map<String, Boolean> aviableAirports = new HashMap<>();

        String arivalAirtport =  aviableAirports.entrySet().stream()
                .map(t -> t.getKey())
                .filter(t -> flight.getArrivalAirport().equals(t))
                .findFirst().orElse("");
    }
}
