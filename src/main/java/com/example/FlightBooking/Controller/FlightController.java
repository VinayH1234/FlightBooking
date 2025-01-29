package com.example.FlightBooking.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.FlightBooking.Service.FlightService;
import com.example.FlightBooking.model.Flight;

import java.util.List;

@Controller
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public String viewAllFlights(Model model) {
        List<Flight> flights = flightService.getAllFlights();
        model.addAttribute("flights", flights);
        return "flights";
    }

    @PostMapping("/search")
    public String searchFlights(
        @RequestParam String source, 
        @RequestParam String destination, 
        Model model
    ) {
        List<Flight> flights = flightService.searchFlights(source, destination);
        model.addAttribute("flights", flights);
        return "flights";
    }

    @GetMapping("/add")
    public String showAddFlightPage() {
        return "addFlight";
    }

    @PostMapping("/add")
    public String addFlight(@ModelAttribute Flight flight, Model model) {
        flightService.addFlight(flight);
        model.addAttribute("message", "Flight added successfully!");
        return "redirect:/flights";
    }
}
