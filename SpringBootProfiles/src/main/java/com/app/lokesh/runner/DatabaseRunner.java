package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.db.DatabaseConnection;

@Component
public class DatabaseRunner implements CommandLineRunner {
	@Autowired
	private DatabaseConnection connection;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(connection);
	}

}
