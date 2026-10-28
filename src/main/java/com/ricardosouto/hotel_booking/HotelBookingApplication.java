package com.ricardosouto.hotel_booking;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class HotelBookingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Guest guest1 = new Guest("Ana", "ana@email.com");
		System.out.println(guest1.getName() +" " +  guest1.getEmail());

		Room room1 = new Room("101", new BigDecimal("200.00"));



	}
}
