package com.digipets.pets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@EnableMongoRepositories("com.digipets.pets.repository")
public class PetsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetsApplication.class, args);
	}

}
