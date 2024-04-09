package com.springboot.samplebootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/github-actions")
public class SampleBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleBootProjectApplication.class, args);
	}
	
	
	@GetMapping
	public String viewDemo() {
		return "Congrats!!!  Application deployed successfully";
	}

}
