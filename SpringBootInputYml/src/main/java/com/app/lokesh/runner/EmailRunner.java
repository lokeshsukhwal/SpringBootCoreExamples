package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.config.EmailProvider;

@Component
public class EmailRunner implements CommandLineRunner {
	@Autowired
	private EmailProvider provider;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(provider);
	}

}
