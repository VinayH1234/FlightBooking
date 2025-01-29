package com.example.FlightBooking.Controller;


import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.FlightBooking.Service.BookingService;
import com.example.FlightBooking.Service.FlightService;
import com.example.FlightBooking.model.Booking;
import com.example.FlightBooking.model.Flight;
import com.example.FlightBooking.model.User;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @Autowired
    private FlightService flightService;

    @GetMapping("/new/{flightId}")
    public String showBookingPage(@PathVariable Long flightId, Model model) {
        Flight flight = flightService.getAllFlights().stream()
                      .filter(f -> f.getId().equals(flightId))
                      .findFirst()
                      .orElse(null);
        model.addAttribute("flight", flight);
        return "bookFlight";
    }

    @PostMapping("/new")
    public String bookFlight(
        @RequestParam Long flightId, 
        HttpSession session, 
        Model model
    ) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/users/login";
        }

        Booking booking = new Booking();
        booking.setUser(user);
        booking.setFlight(flightService.getAllFlights().stream()
                      .filter(f -> f.getId().equals(flightId))
                      .findFirst()
                      .orElseThrow());
        booking.setBookingDate(LocalDate.now());
        bookingService.createBooking(booking);

        model.addAttribute("message", "Flight booked successfully!");
        return "redirect:/bookings";
    }

    @GetMapping
    public String viewUserBookings(HttpSession session, Model model) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            return "redirect:/users/login";
        }

        List<Booking> bookings = bookingService.getUserBookings(user.getId());
        model.addAttribute("bookings", bookings);
        return "bookings";
    }
}

