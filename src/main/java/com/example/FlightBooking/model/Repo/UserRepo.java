package com.example.FlightBooking.model.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.FlightBooking.model.User;

public interface UserRepo extends JpaRepository<User,Long>{
	 User findByUsername(String username);
}
