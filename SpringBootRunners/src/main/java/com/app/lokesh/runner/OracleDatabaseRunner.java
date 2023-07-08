package com.app.lokesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class OracleDatabaseRunner implements CommandLineRunner {
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("From OracleDatabaseRunner ...");
	}
}
