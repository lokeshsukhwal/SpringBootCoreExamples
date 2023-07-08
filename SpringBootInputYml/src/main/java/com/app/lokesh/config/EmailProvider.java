package com.app.lokesh.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * SnakeYAML is a API (JAR). This is used to read/parse YAML file
   data into Java Format, that is loaded finally into Spring
   Container Environment.

   It is not recommended to keep both properties and yaml file.
   In this case properties is loaded with priority.
 */
@Component
@ConfigurationProperties(prefix = "com.app")
@Data
public class EmailProvider {
	
	private String host;
	private String provider;
	private String username;
	private String password;
}
