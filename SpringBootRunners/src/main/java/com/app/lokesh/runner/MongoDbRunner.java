package com.app.lokesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * To execute any Logic only once by Spring Container 
 * on application startup / while starting application
 * Then we have to Write logic in run(-) method
 */
@Component
@Order(15)
public class MongoDbRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From MongoDbRunner...");
	}

}
