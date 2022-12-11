package com.kodilla.good.patterns.FlightSearch;

import java.util.Objects;

public class FlightWithStopoverDto {
    private final String departureAirport;
    private final String arrivalAirport;
    private final String stopover;

    public FlightWithStopoverDto(String departureAirport, String arrivalAirport, String stopover) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.stopover = stopover;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getStopover() {
        return stopover;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightWithStopoverDto flight = (FlightWithStopoverDto) o;

        if (!Objects.equals(departureAirport, flight.departureAirport))
            return false;
        if (!Objects.equals(arrivalAirport, flight.arrivalAirport))
            return false;
        return Objects.equals(stopover, flight.stopover);
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (stopover != null ? stopover.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight: " + departureAirport + " -> " + stopover + " -> " + arrivalAirport + ", no: " + hashCode();
    }
}
