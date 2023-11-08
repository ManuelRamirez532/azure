package com.javacrud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaCrudApplication.class, args);
	}

}

@GetMapping("/")
public String init() {
	return String.format("Welcome to Java CRUD Application!");
}

@GetMapping("/hello")
public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
return String.format("Hello %s!", name);
}