package com.project.debito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@SpringBootApplication
@EnableR2dbcRepositories(basePackages = "com.project.debito.repository")
public class DebitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DebitoApplication.class, args);
	}

}
