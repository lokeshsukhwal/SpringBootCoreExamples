package com.app.lokesh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.lokesh.export.DataExport;

@Configuration
public class AppConfig {
	
	@Bean
	public DataExport export() {
		DataExport export = new DataExport();
		export.setFileName("springboot-Notes");
		export.setFileType("pdf");
		return export;
	}
}
