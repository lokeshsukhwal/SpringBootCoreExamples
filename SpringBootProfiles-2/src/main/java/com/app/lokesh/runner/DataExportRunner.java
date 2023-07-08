package com.app.lokesh.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.lokesh.export.DataExport;

@Component
public class DataExportRunner implements CommandLineRunner {
	
	@Autowired
	private DataExport export;
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println(export);
	}

}
