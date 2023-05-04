package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(
info =@Info(
		title ="Player Database",
		version = "1.1.2",
		description = "Here You can find the details of your favourite player",
		contact = @Contact(
				name = "Dinesh Kannan S D",
				email = "727821tuec038@skct.edu.in"
				)
		)
)
public class SoccerDatabaseReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoccerDatabaseReviewApplication.class, args);
	}

}
