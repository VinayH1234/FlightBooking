package com.example.FlightBooking.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightBooking.Repo.FlightRepo;
import com.example.FlightBooking.Service.FlightService;
import com.example.FlightBooking.model.Flight;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepo flightRepository;

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> searchFlights(String source, String destination) {
        return flightRepository.findBySourceAndDestination(source, destination);
    }

    @Override
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
    }