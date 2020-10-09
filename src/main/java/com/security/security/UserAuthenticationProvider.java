/**
 * 
 */
package com.security.security;

import java.util.Collections;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

/**
 * @author sairam
 *
 */
@Component
public class UserAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		String user = authentication.getName();
		String password = authentication.getCredentials().toString();
		System.out.println("User Name::"+user);
		if (user.equalsIgnoreCase("kumar1") && password.equals("kumar")) { 
			return new UsernamePasswordAuthenticationToken(user, password, Collections.emptyList());
		} else {
			throw new BadCredentialsException("External system authentication failed");
		}
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}
}
