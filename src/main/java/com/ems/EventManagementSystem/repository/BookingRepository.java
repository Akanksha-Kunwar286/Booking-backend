package com.ems.EventManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.EventManagementSystem.entity.Booking;


public  interface BookingRepository extends JpaRepository<Booking,Long> {

}
