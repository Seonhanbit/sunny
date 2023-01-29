package com.project.sunny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SunnyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SunnyApplication.class, args);
	}

	@CrossOrigin(origins = {"*"}, maxAge = 6000)
	@RestController
	public static class MainController {

		@GetMapping("/hello/{name}")
		public String hello(@PathVariable String name) {
			System.out.println("hello");
			return String.format("Hello %s!", name);
		}

		@GetMapping("/")
		public String home() {
			return "home";
		}
	}
}
