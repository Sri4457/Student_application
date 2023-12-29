package com.project.marks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MarksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarksApplication.class, args);
	}

}
