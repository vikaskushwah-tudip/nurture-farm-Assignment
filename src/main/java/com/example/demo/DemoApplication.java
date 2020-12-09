package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext c =	SpringApplication.run(DemoApplication.class, args);

		System.out.println("Welcome to Spring Boot");
	}
	@Bean
	public Jackson2ObjectMapperBuilder jacksonBuilder() {
		Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
		builder.indentOutput(true);
		builder.dateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		return builder;
	}

}
