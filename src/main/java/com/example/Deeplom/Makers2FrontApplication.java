package com.example.Deeplom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class Makers2FrontApplication {

	public static void main(String[] args) {
		SpringApplication.run(Makers2FrontApplication.class, args);
	}

}
