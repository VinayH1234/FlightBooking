package com.example.FlightBooking.Service;

import java.util.List;

import com.example.FlightBooking.model.Flight;

public interface FlightService {
	 Flight addFlight(Flight flight);
	    List<Flight> searchFlights(String source, String destination);
	    List<Flight> getAllFlights();

}
