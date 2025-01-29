package com.example.FlightBooking.Service;

import com.example.FlightBooking.model.User;

public interface UserService {
	    User registerUser(User user);
	    User loginUser(String username, String password);
}
