package com.security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
	@ExceptionHandler(value = Myexception.class)
	public ResponseEntity<Myexception> handleGenericNotFoundException(Myexception e) {
		Myexception error = new Myexception(1, e.getMessage());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}