/**
 * 
 */
package com.security.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author sairam
 *
 */
public class Myexception extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 239283200L;
	private int id;
	private String message;

	public Myexception(int id, String message) {
		super(message);
		this.id = id;
		this.message = message;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
