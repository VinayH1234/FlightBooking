package com.example.FlightBooking.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Booking {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Flight flight;

    private LocalDate bookingDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Booking(Long id, User user, Flight flight, LocalDate bookingDate) {
		super();
		this.id = id;
		this.user = user;
		this.flight = flight;
		this.bookingDate = bookingDate;
	}

	public Booking() {
		super();
	}
    
    
}