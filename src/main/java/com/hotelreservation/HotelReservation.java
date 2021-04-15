package com.hotelreservation;

import java.util.ArrayList;
import java.util.List;
/* @Description- add hotel name and rates

 */
public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

        public boolean addHotel(String hotelName, Double rates) {
            Hotel hotel = new Hotel(hotelName, rates);
            hotelList.add(hotel);
            return !hotelList.isEmpty();
        }

    public static void main(String[] args) {
        System.out.println("Welcome to the hotel reservation system");
    }
}


