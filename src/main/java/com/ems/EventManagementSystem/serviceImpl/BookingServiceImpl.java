package com.ems.EventManagementSystem.serviceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ems.EventManagementSystem.entity.Booking;
import com.ems.EventManagementSystem.exception.BookingNotFoundException;
import com.ems.EventManagementSystem.repository.BookingRepository;
import com.ems.EventManagementSystem.service.BookingService;


@Service
public class BookingServiceImpl implements BookingService {
	
	
	private BookingRepository bookingRepository;
	
	

	public BookingServiceImpl(BookingRepository bookingRepository) {
		super();
		this.bookingRepository = bookingRepository;
	}


	@Override
	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking);
	}


	@Override
	public List<Booking> getAllBooking() {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}


	@Override
	public Booking getBookingById(long id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		if(booking.isPresent())
		{
		return booking.get();
	}
		else
		{
		throw new BookingNotFoundException("Booking","Id",id);
		}

	}
	
	@Override
	public void deleteBooking(long Id) {

		bookingRepository.findById(Id);
		bookingRepository.deleteById(Id);
	}

	@Override
	public Booking updateBooking(Booking Booking, long id) throws Exception {

		Booking existingBooking=bookingRepository.findById(id).orElseThrow(()->new BookingNotFoundException("Booking","Id",id)); 
		
     	existingBooking.setLocation(Booking.getLocation());
    	existingBooking.setStatus(Booking.isStatus());
     	existingBooking.setBill(Booking.getBill());
     	bookingRepository.save(existingBooking);
		return existingBooking;
	}

	

}
