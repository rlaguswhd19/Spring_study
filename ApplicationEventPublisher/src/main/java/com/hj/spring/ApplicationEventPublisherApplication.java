package com.hj.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ApplicationEventPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEventPublisherApplication.class, args);
	}

}
