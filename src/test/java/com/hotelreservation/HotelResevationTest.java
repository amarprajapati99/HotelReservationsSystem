package com.hotelreservation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelResevationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotel_WhenAdded_shouldReturnTrue() {
        boolean result = hotelReservation.addHotel("Lakewood", 950.00);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenBookingDate_shouldReturnCheapestHotel(){
        SimpleDateFormat df = new SimpleDateFormat("ddMMMMyyyy");
        String inputDateString [] = {"10sep2020", "11sep2020"};

        Date[] inputDate = null;
        try {
            inputDate = new Date[]{df.parse(inputDateString[0]), df.parse(inputDateString[1])};
        }
        catch (ParseException e){
            System.out.println("Invalid Formate");
            if (!df.format(inputDateString).equals(inputDate)){
                System.out.println("Invalid Date!!");
            }else
                System.out.println("Valid Date");
        }
        boolean result = hotelReservation.addHotel("Lakewood", 220.00) &&
                hotelReservation.addHotel("Ridgewood", 1200.00) ;
        if (result)
            Assertions.assertEquals("Lakewood", hotelReservation.findCheapestHotel(inputDate));
    }

    @Test
    public void givenWeekDayAndWeek_endRatesForHotels_WhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotelRates("Lakewood", 110.00, 90.00) &&
                hotelReservation.addHotelRates("Bridgewood", 150.00, 50.00) &&
                hotelReservation.addHotelRates("Ridgewood", 220.00, 150.00);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenRatingForHotels_WhenAddedShouldReturnTrue() {
        boolean result = hotelReservation.addHotelRating("Lakewood",3) &&
                hotelReservation.addHotelRating("Bridgewood", 4) &&
                hotelReservation.addHotelRating("Ridgewood", 5);
        Assertions.assertTrue(result);
    }
}

