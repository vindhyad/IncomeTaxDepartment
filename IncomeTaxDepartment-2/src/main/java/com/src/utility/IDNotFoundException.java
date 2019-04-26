package com.src.utility;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)// To give status as NOT FOUND if the id not found
public class IDNotFoundException extends Exception {
	
	public IDNotFoundException(String msg) {
		super(msg);
	}

}
