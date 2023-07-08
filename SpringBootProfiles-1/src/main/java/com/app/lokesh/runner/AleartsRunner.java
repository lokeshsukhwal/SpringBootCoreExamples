package com.app.lokesh.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("qa")
@Component
public class AleartsRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("FROM AleartsRunner");
	}

}
