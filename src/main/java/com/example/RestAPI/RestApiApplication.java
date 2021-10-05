package com.example.RestAPI;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class RestApiApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RestApiApplication.class, args);
		ClassPathXmlApplicationContext ctx =
				new ClassPathXmlApplicationContext("applicationContext.xml");
	}

}