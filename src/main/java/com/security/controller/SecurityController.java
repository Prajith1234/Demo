/**
 * 
 */
package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.exception.Myexception;

/**
 * @author sairam
 *
 */
@RestController
public class SecurityController {

	@GetMapping("/result")
	public String getResult() throws Myexception {

		int i = 0;

		if (i == 0) {
			throw new Myexception(1, "I value is zero");
		}

		return "Hello";
	}
}
