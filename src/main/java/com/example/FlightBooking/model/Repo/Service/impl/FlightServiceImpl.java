package com.example.FlightBooking.model.Repo.Service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightBooking.model.Flight;
import com.example.FlightBooking.model.Repo.FlightRepo;
import com.example.FlightBooking.model.Repo.Service.FlightService;

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