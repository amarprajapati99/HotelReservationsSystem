package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HotelResevationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotelWhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotel("Lakewood", 950.00);
        Assertions.assertTrue(result);
    }
}

