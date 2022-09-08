package com.ems.EventManagementSystem.controller;

import java.util.List;

import javax.persistence.Column;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.EventManagementSystem.entity.Booking;
import com.ems.EventManagementSystem.repository.BookingRepository;
import com.ems.EventManagementSystem.service.BookingService;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
	
	private static final long Id = 0;
	private BookingService bookingservice;

	public BookingController(BookingService bookingservice) {
		super();
		this.bookingservice = bookingservice;
	}
	
   // Build Create BOOKING Rest API
	@PostMapping
	public ResponseEntity<Booking> saveBooking(@RequestBody Booking booking)
	{
		return new ResponseEntity<Booking>(bookingservice.saveBooking(booking),HttpStatus.OK);
	}
	
   // BUILD  ALL BOOKING REST API
	@GetMapping
	public List<Booking> getAllBooking()
	{
		return bookingservice.getAllBooking();
	}
    // Build get booking by id REST API
	@GetMapping("{id}")
	public ResponseEntity<Booking> getBookingById(@PathVariable("id") long Id)
	{
		return new ResponseEntity<Booking>(bookingservice.getBookingById(Id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteBooking(@PathVariable("id") long Id) {
		bookingservice.deleteBooking(Id);
		return new ResponseEntity<String>("Booking deleted successfully!", HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Booking> updateBooking(@PathVariable("id")long id,@RequestBody Booking booking) throws Exception{
		return new ResponseEntity<Booking>(bookingservice.updateBooking(booking, id),HttpStatus.OK);
	}
}
