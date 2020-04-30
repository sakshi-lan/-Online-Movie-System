package com.cap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeleteTheatreApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeleteTheatreApplication.class, args);
	}

}
