package com.app.lokesh.db;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Value will try to read one key data and if found inject the same into one
 * variable, else key not found then container throws exception like:
 * IllegalArgumentException: Could not resolve placeholder 'my.db.driver'
 * in value "${my.db.driver}" 
 * 
 *    [ Problem ]
 *   -> If we have n variable to load n keys then we should define
 *      @Value over n variables.
 */
@Component
public class DatabaseConfigration {
	@Value("${my.app.driver}")
	private String driver;

	@Value("${my.app.url}")
	private String url;

	@Value("${my.app.username}")
	private String username;

	@Value("${my.app.password}")
	private String password;

	@Override
	public String toString() {
		return "DatabaseConfigration [driver=" + driver + ", url=" + url + ", username=" + username + ", password="
				+ password + "]";
	}

}
