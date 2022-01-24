package com.florianhansen.webservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends Exception {
	
	private static final long serialVersionUID = 2963830553569940948L;

	public BadRequestException(String message) {
		super(message);
	}

}
