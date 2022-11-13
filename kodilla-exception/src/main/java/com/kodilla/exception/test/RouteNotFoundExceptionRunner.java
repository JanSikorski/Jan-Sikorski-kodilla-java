package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findFlight(new Flight("Toronto", "New York"));
        } catch (RouteNotFoundException e) {
            System.out.println("Flight not found (Error: " + e + ")");
        }
    }
}
