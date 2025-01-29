package com.example.FlightBooking.model.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightBooking.model.Flight;

public interface FlightRepo extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestination(String source, String destination); 
        
}
