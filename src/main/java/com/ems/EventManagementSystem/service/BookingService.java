package com.ems.EventManagementSystem.service;

import java.util.List;

import com.ems.EventManagementSystem.entity.Booking;

public interface BookingService {
	Booking saveBooking(Booking booking);
	List<Booking> getAllBooking();
	Booking getBookingById(long id);
	void deleteBooking(long Id);
    public  Booking updateBooking(Booking Booking,long id) throws Exception;

}
