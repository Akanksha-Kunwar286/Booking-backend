package com.ems.EventManagementSystem.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	private long Id;
	
	@Column(name = "Location")
	private String Location;
	
	@Column(name = "From_DateTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String fromDateTime;
	
	@Column(name = "To_DateTime")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private String toDateTime;
	
	@Column(name = "Status")
	private boolean status;
	
	@Column(name = "Bill")
	private float bill;
	
	
	public long getEventBookingId() {
		return Id;
	}
	public void setEventBookingId(long Id) {
		this.Id = Id;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getFromDateTime() {
		return fromDateTime;
	}
	public void setFromDateTime(String fromDateTime) {
		this.fromDateTime = fromDateTime;
	}
	public String getToDateTime() {
		return toDateTime;
	}
	public void setToDateTime(String toDateTime) {
		this.toDateTime = toDateTime;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}

}
