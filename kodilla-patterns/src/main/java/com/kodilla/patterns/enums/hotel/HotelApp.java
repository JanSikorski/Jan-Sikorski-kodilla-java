package com.kodilla.patterns.enums.hotel;

public class HotelApp {

    public static void main(String[] args) {
        System.out.println("Accomodation prices:");
        System.out.println("1. Single Bed rooms");
        System.out.println("   - low season: " + Seasion.LOW.getSingleRoomPrice());
        System.out.println("   - high season: " + Seasion.HIGH.getSingleRoomPrice());
        System.out.println("   - holiday season: " + Seasion.HOLIDAY.getSingleRoomPrice());
        System.out.println("2. Double Bed rooms");
        System.out.println("   - low season: " + Seasion.LOW.getDoubleRoomPrice());
        System.out.println("   - high season: " + Seasion.HIGH.getDoubleRoomPrice());
        System.out.println("   - holiday season: " + Seasion.HOLIDAY.getDoubleRoomPrice());

        Seasion seasion = Seasion.HOLIDAY;
        System.out.println(seasion);
    }
}
