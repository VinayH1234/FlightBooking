package com.example.FlightBooking.Service;

import java.util.List;

import com.example.FlightBooking.model.Booking;

public interface BookingService {
	
    Booking createBooking(Booking booking);
    List<Booking> getUserBookings(Long userId);

}
