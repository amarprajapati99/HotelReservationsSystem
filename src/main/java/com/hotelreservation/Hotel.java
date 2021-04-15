package com.hotelreservation;

public class Hotel {
    private final String hotelName;
    private final double rates;

    public Hotel(String hotelName, double rates) {
        this.hotelName = hotelName;
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + hotelName + '\'' +
                ", rates=" + rates +
                '}';
    }
}