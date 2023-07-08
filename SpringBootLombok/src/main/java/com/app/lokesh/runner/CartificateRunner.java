package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.catificate.Cartificate;

@Component
public class CartificateRunner implements CommandLineRunner {
	@Autowired
	private Cartificate cartificate; 
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(cartificate);
	}

}
