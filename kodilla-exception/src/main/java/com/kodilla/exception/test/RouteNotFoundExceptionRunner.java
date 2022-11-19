package com.kodilla.exception.test;

public class RouteNotFoundExceptionRunner {
    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        try {
            System.out.println(flightSearch.findFlight(new Flight("Toronto", "New York")));
        } catch (RouteNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
