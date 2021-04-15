package com.hotelreservation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
/* @Description- add hotel name and rates for regular customer */
public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

        public boolean addHotel(String hotelName, Double rates) {
            Hotel hotel = new Hotel(hotelName, rates);
            hotelList.add(hotel);
            return !hotelList.isEmpty();
        }
/* @Description- to find the cheapest rates for the hotel. */
    public String findCheapestHotel(Date [] dates) {
        ArrayList<Double> cheapRateHotels = new ArrayList<>();
        for (Hotel hotel : hotelList){
            Double rate = 0.0;
            for ( Date date : dates){
                rate = hotel.getRates();
            }
            cheapRateHotels.add(rate);
        }
        Double cheap = cheapRateHotels.stream().min(Comparator.comparing(Double::doubleValue)).orElse(null);
        int index = cheapRateHotels.indexOf(cheap);
        return hotelList.get(index).getName();
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the hotel reservation system");
    }
}


