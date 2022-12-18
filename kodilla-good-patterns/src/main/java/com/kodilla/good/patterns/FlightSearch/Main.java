package com.kodilla.good.patterns.FlightSearch;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine(initFlights());

        System.out.println(searchEngine.getFlightBasedOnArrivalAirport("Poznań"));
        System.out.println(searchEngine.getFlightBasedOnDepartureAirport("Szczecin"));
        System.out.println(searchEngine.getFlightsWithStopover("Szczecin", "Warszawa", "Rzeszów"));
    }

    private static Flights initFlights() {
        Flights flights = new Flights();

        flights.addFlight("Szczecin", "Warszawa");
        flights.addFlight("Warszawa", "Rzeszów");
        flights.addFlight("Warszawa", "Poznań");
        flights.addFlight("Szczecin", "Poznań");

        return flights;
    }
}
