package com.example.FlightBooking.model.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightBooking.model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Long> {
    List<Booking> findByUserId(Long userId); 

}
