package com.example.FlightBooking.model.Repo.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightBooking.model.User;
import com.example.FlightBooking.model.Repo.UserRepo;
import com.example.FlightBooking.model.Repo.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    @Override
    public User registerUser(User user) {
        // Ensure the username is unique
        if (userRepository.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("Username already exists!");
        }
        return userRepository.save(user);
    }

    @Override
    public User loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid username or password!");
        }
        return user;
    }
}

