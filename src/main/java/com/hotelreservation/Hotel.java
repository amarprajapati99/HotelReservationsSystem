package com.hotelreservation;

public class Hotel {
    private final String hotelName;
    private final Double rates;
    private final Double weekendRates;

    public Hotel(String hotelName, Double rates) {
        this.hotelName = hotelName;
        this.rates = rates;
        weekendRates = null;
    }

    public Hotel(String hotelName, Double rates, Double weekendRates) {
        this.hotelName = hotelName;
        this.rates = rates;
        this.weekendRates = weekendRates;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + hotelName + '\'' +
                ", rates=" + rates + " weekendRates=" + weekendRates +
                '}';
    }

    public Double getRates() {
        return rates;
    }

    public String getName() {
        return hotelName;
    }
    public Double getWeekendRates() {
        return weekendRates;
    }

}
