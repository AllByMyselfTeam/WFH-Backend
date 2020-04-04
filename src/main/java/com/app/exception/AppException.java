package com.app.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class AppException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public AppException() {
		super();
	}
	public AppException(final String message) {
		super(message);
	}
	
}
