package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("log to check image success");
		log.info("log slf4j");
		SpringApplication.run(DemoApplication.class, args);
	}

}
