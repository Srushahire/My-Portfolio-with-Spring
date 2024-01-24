package com.example.demoSpringWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
@SpringBootApplication
public class DemoSpringWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringWebApplication.class, args);
		
	}

}
