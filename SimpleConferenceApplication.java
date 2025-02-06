package com.example.Simple_Conference;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleConferenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleConferenceApplication.class, args);
	}

}
