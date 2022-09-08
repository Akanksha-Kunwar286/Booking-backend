package com.ems.EventManagementSystem.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class BookingNotFoundException extends RuntimeException {
	private final String resourceName;
	private final String fieldName;
	private final long fieldvalue;

	public BookingNotFoundException(String resourceName, String fieldName, long id) {
		super(String.format("%s not found with %s:'%s'",resourceName,fieldName,id));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldvalue = id;
	}

	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public long getFieldvalue() {
		return fieldvalue;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1970762601225780363L;


}
